<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="线索ID" prop="id">
        <el-input
          v-model="queryParams.id"
          placeholder="请输入线索ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="手机号" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入手机号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="渠道来源" prop="channel">
        <el-select v-model="queryParams.channel" placeholder="请输入渠道来源" clearable
                   @keyup.enter.native="handleQuery">
          <el-option
            v-for="dict in dict.type.clues_item"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="状态" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择状态" clearable @keyup.enter.native="handleQuery">
          <el-option
            v-for="dict in dict.type.clue_status"
            :key="dict.value"
            :label="dict.label"
            :value="dict.value"
          />
        </el-select>
      </el-form-item>
      <el-form-item label="时间" prop="data">
        <el-date-picker
          v-model="queryParams.data"
          type="daterange"
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          value-format="yyyy-MM-dd"
        >
        </el-date-picker>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['crm:clue:add']"
        >新增
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['crm:clue:edit']"
        >修改
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['crm:clue:remove']"
        >删除
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['crm:clue:export']"
        >导出
        </el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleBatchAssign"
        >批量分配
        </el-button>
      </el-col>

      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleBatchAdd"
        >批量添加
        </el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="clueList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="线索id" align="center" prop="id"/>
      <el-table-column label="客户姓名" align="center" prop="name"/>
      <el-table-column label="手机号" align="center" prop="phone"/>
      <el-table-column label="渠道来源" align="center" prop="channel" :formatter="channelselect"/>
      <el-table-column label="创建时间" align="center" prop="createTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createTime, '{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="归属人" align="center" prop="guishu" width="180"/>
      <el-table-column label="状态" align="center" prop="status" width="180" :formatter="createByselect"/>
      <el-table-column label="下次跟进时间" align="center" prop="nextTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.nextTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['crm:clue:edit']"
          >修改
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['crm:clue:remove']"
          >删除
          </el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleAssign([scope.row.id])"
            v-hasPermi="['crm:clue:edit']"
          >分配
          </el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改线索对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="客户姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入客户姓名"/>
        </el-form-item>
        <el-form-item label="手机号" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入手机号"/>
        </el-form-item>
        <el-form-item label="渠道" prop="channel">
          <el-input v-model="form.channel" placeholder="请输入渠道"/>
        </el-form-item>
        <el-form-item label="活动id" prop="activityId">
          <el-input v-model="form.activityId" placeholder="请输入活动id"/>
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入年龄"/>
        </el-form-item>
        <el-form-item label="微信" prop="weixin">
          <el-input v-model="form.weixin" placeholder="请输入微信"/>
        </el-form-item>
        <el-form-item label="qq" prop="qq">
          <el-input v-model="form.qq" placeholder="请输入qq"/>
        </el-form-item>
        <el-form-item label="意向等级" prop="level">
          <el-input v-model="form.level" placeholder="请输入意向等级"/>
        </el-form-item>
        <el-form-item label="意向学科" prop="subject">
          <el-input v-model="form.subject" placeholder="请输入意向学科"/>
        </el-form-item>
        <el-form-item label="伪线索失败次数(最大数3次)" prop="falseCount">
          <el-input v-model="form.falseCount" placeholder="请输入伪线索失败次数(最大数3次)"/>
        </el-form-item>
        <el-form-item label="时间" prop="nextTime">
          <el-date-picker clearable
                          v-model="form.nextTime"
                          type="date"
                          value-format="yyyy-MM-dd"
                          placeholder="请选择时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="是否转派" prop="transfer">
          <el-input v-model="form.transfer" placeholder="请输入是否转派"/>
        </el-form-item>
        <el-form-item label="线索失效时间" prop="endTime">
          <el-date-picker clearable
                          v-model="form.endTime"
                          type="date"
                          value-format="yyyy-MM-dd"
                          placeholder="请选择线索失效时间">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
    <assign-run ref="assignDialog" @ok="getList"></assign-run>
    <batch-add ref="batchAddLog"></batch-add>
  </div>
</template>

<script>
import {listClue, getClue, delClue, addClue, updateClue} from "@/api/crm/clue";
import AssignRun from '@/views/crm/clue/components/assign';
import BatchAdd from '@/views/crm/clue/components/batch-add'

export default {
  name: "Clue",
  dicts: ["clues_item", "sys_user_sex", "course_subject", "clues_level", "clue_status"],
  components: { AssignRun, BatchAdd },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 线索表格数据
      clueList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        id: null,
        pageNum: 1,
        pageSize: 10,
        name: null,
        phone: null,
        channel: null,
        activityId: null,
        sex: null,
        age: null,
        weixin: null,
        qq: null,
        level: null,
        subject: null,
        status: null,
        falseCount: null,
        nextTime: null,
        transfer: null,
        startTime: null,
        endTime: null,
        data: []
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {}
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询线索列表 */
    getList() {
      this.loading = true;
      listClue(this.queryParams).then(response => {
        this.clueList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        name: null,
        phone: null,
        channel: null,
        activityId: null,
        sex: null,
        age: null,
        weixin: null,
        qq: null,
        level: null,
        subject: null,
        status: null,
        createTime: null,
        createBy: null,
        falseCount: null,
        nextTime: null,
        updateTime: null,
        transfer: null,
        endTime: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      if (this.queryParams.data != null) {
        this.queryParams.startTime = this.queryParams.data[0].toString();
        this.queryParams.endTime = this.queryParams.data[1].toString();
      } else {
        this.queryParams.startTime = null;
        this.queryParams.endTime = null
      }
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length !== 1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加线索";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getClue(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改线索";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateClue(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addClue(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除线索编号为"' + ids + '"的数据项？').then(function () {
        return delClue(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {
      });
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('crm/clue/export', {
        ...this.queryParams
      }, `clue_${new Date().getTime()}.xlsx`)
    },
    channelselect(row) {
      return this.selectDictLabel(this.dict.type.clues_item, row.channel)
    },
    sexx(row) {
      return this.selectDictLabel(this.dict.type.sys_user_sex, row.sex)
    },
    selectsubject(row) {
      return this.selectDictLabel(this.dict.type.course_subject, row.subject)
    },
    selectlevle(row) {
      return this.selectDictLabel(this.dict.type.clues_level, row.level)
    },
    createByselect(row) {
      return this.selectDictLabel(this.dict.type.clue_status, row.status)
    }, handleAssign(row) {
      this.$refs.assignDialog.open = true;
      this.$refs.assignDialog.ids = row;
      this.$refs.assignDialog.shangji = '线索'
    },
    handleBatchAssign() {
      if (this.ids && this.ids.length > 0) {
        this.handleAssign(this.ids)
      } else {
        this.$modal.alert("请选择至少一项");
      }
    }, handleBatchAdd() {
      this.$refs.batchAddLog.open=true;
    }
  }
};
</script>
