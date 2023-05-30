<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="客户姓名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入客户姓名"
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
      <el-form-item label="渠道" prop="channel">
        <el-input
          v-model="queryParams.channel"
          placeholder="请输入渠道"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="活动id" prop="activityId">
        <el-input
          v-model="queryParams.activityId"
          placeholder="请输入活动id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="省" prop="provinces">
        <el-input
          v-model="queryParams.provinces"
          placeholder="请输入省"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="区" prop="city">
        <el-input
          v-model="queryParams.city"
          placeholder="请输入区"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="年龄" prop="age">
        <el-input
          v-model="queryParams.age"
          placeholder="请输入年龄"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="微信" prop="weixin">
        <el-input
          v-model="queryParams.weixin"
          placeholder="请输入微信"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="qq" prop="qq">
        <el-input
          v-model="queryParams.qq"
          placeholder="请输入qq"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="意向等级" prop="level">
        <el-input
          v-model="queryParams.level"
          placeholder="请输入意向等级"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="意向学科" prop="subject">
        <el-input
          v-model="queryParams.subject"
          placeholder="请输入意向学科"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程" prop="courseId">
        <el-input
          v-model="queryParams.courseId"
          placeholder="请输入课程"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职业" prop="occupation">
        <el-input
          v-model="queryParams.occupation"
          placeholder="请输入职业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="学历" prop="education">
        <el-input
          v-model="queryParams.education"
          placeholder="请输入学历"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="在职情况" prop="job">
        <el-input
          v-model="queryParams.job"
          placeholder="请输入在职情况"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="薪资" prop="salary">
        <el-input
          v-model="queryParams.salary"
          placeholder="请输入薪资"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="专业" prop="major">
        <el-input
          v-model="queryParams.major"
          placeholder="请输入专业"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="希望薪资" prop="expectedSalary">
        <el-input
          v-model="queryParams.expectedSalary"
          placeholder="请输入希望薪资"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="学习原因" prop="reasons">
        <el-input
          v-model="queryParams.reasons"
          placeholder="请输入学习原因"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="职业计划" prop="plan">
        <el-input
          v-model="queryParams.plan"
          placeholder="请输入职业计划"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="计划时间" prop="planTime">
        <el-date-picker clearable
          v-model="queryParams.planTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择计划时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="其他意向" prop="otherIntention">
        <el-input
          v-model="queryParams.otherIntention"
          placeholder="请输入其他意向"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="下次跟进时间" prop="nextTime">
        <el-date-picker clearable
          v-model="queryParams.nextTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择下次跟进时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="最后更新时间" prop="lastUpdateTime">
        <el-date-picker clearable
          v-model="queryParams.lastUpdateTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择最后更新时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="线索ID" prop="clueId">
        <el-input
          v-model="queryParams.clueId"
          placeholder="请输入线索ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否转派" prop="transfer">
        <el-input
          v-model="queryParams.transfer"
          placeholder="请输入是否转派"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="回收时间" prop="endTime">
        <el-date-picker clearable
          v-model="queryParams.endTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择回收时间">
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
          v-hasPermi="['crm:business:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['crm:business:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['crm:business:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['crm:business:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="businessList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="商机id" align="center" prop="id" />
      <el-table-column label="客户姓名" align="center" prop="name" />
      <el-table-column label="手机号" align="center" prop="phone" />
      <el-table-column label="渠道" align="center" prop="channel" />
      <el-table-column label="活动id" align="center" prop="activityId" />
      <el-table-column label="省" align="center" prop="provinces" />
      <el-table-column label="区" align="center" prop="city" />
      <el-table-column label="性别" align="center" prop="sex" />
      <el-table-column label="年龄" align="center" prop="age" />
      <el-table-column label="微信" align="center" prop="weixin" />
      <el-table-column label="qq" align="center" prop="qq" />
      <el-table-column label="意向等级" align="center" prop="level" />
      <el-table-column label="意向学科" align="center" prop="subject" />
      <el-table-column label="课程" align="center" prop="courseId" />
      <el-table-column label="职业" align="center" prop="occupation" />
      <el-table-column label="学历" align="center" prop="education" />
      <el-table-column label="在职情况" align="center" prop="job" />
      <el-table-column label="薪资" align="center" prop="salary" />
      <el-table-column label="专业" align="center" prop="major" />
      <el-table-column label="希望薪资" align="center" prop="expectedSalary" />
      <el-table-column label="学习原因" align="center" prop="reasons" />
      <el-table-column label="职业计划" align="center" prop="plan" />
      <el-table-column label="计划时间" align="center" prop="planTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.planTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="其他意向" align="center" prop="otherIntention" />
      <el-table-column label="状态(已分配1  进行中2  回收3)" align="center" prop="status" />
      <el-table-column label="下次跟进时间" align="center" prop="nextTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.nextTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="最后更新时间" align="center" prop="lastUpdateTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.lastUpdateTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="线索ID" align="center" prop="clueId" />
      <el-table-column label="是否转派" align="center" prop="transfer" />
      <el-table-column label="备注" align="center" prop="remark" />
      <el-table-column label="回收时间" align="center" prop="endTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.endTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['crm:business:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['crm:business:remove']"
          >删除</el-button>
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

    <!-- 添加或修改商机对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="客户姓名" prop="name">
          <el-input v-model="form.name" placeholder="请输入客户姓名" />
        </el-form-item>
        <el-form-item label="手机号" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入手机号" />
        </el-form-item>
        <el-form-item label="渠道" prop="channel">
          <el-input v-model="form.channel" placeholder="请输入渠道" />
        </el-form-item>
        <el-form-item label="活动id" prop="activityId">
          <el-input v-model="form.activityId" placeholder="请输入活动id" />
        </el-form-item>
        <el-form-item label="省" prop="provinces">
          <el-input v-model="form.provinces" placeholder="请输入省" />
        </el-form-item>
        <el-form-item label="区" prop="city">
          <el-input v-model="form.city" placeholder="请输入区" />
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-input v-model="form.age" placeholder="请输入年龄" />
        </el-form-item>
        <el-form-item label="微信" prop="weixin">
          <el-input v-model="form.weixin" placeholder="请输入微信" />
        </el-form-item>
        <el-form-item label="qq" prop="qq">
          <el-input v-model="form.qq" placeholder="请输入qq" />
        </el-form-item>
        <el-form-item label="意向等级" prop="level">
          <el-input v-model="form.level" placeholder="请输入意向等级" />
        </el-form-item>
        <el-form-item label="意向学科" prop="subject">
          <el-input v-model="form.subject" placeholder="请输入意向学科" />
        </el-form-item>
        <el-form-item label="课程" prop="courseId">
          <el-input v-model="form.courseId" placeholder="请输入课程" />
        </el-form-item>
        <el-form-item label="职业" prop="occupation">
          <el-input v-model="form.occupation" placeholder="请输入职业" />
        </el-form-item>
        <el-form-item label="学历" prop="education">
          <el-input v-model="form.education" placeholder="请输入学历" />
        </el-form-item>
        <el-form-item label="在职情况" prop="job">
          <el-input v-model="form.job" placeholder="请输入在职情况" />
        </el-form-item>
        <el-form-item label="薪资" prop="salary">
          <el-input v-model="form.salary" placeholder="请输入薪资" />
        </el-form-item>
        <el-form-item label="专业" prop="major">
          <el-input v-model="form.major" placeholder="请输入专业" />
        </el-form-item>
        <el-form-item label="希望薪资" prop="expectedSalary">
          <el-input v-model="form.expectedSalary" placeholder="请输入希望薪资" />
        </el-form-item>
        <el-form-item label="学习原因" prop="reasons">
          <el-input v-model="form.reasons" placeholder="请输入学习原因" />
        </el-form-item>
        <el-form-item label="职业计划" prop="plan">
          <el-input v-model="form.plan" placeholder="请输入职业计划" />
        </el-form-item>
        <el-form-item label="计划时间" prop="planTime">
          <el-date-picker clearable
            v-model="form.planTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择计划时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="其他意向" prop="otherIntention">
          <el-input v-model="form.otherIntention" placeholder="请输入其他意向" />
        </el-form-item>
        <el-form-item label="下次跟进时间" prop="nextTime">
          <el-date-picker clearable
            v-model="form.nextTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择下次跟进时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="最后更新时间" prop="lastUpdateTime">
          <el-date-picker clearable
            v-model="form.lastUpdateTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择最后更新时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="线索ID" prop="clueId">
          <el-input v-model="form.clueId" placeholder="请输入线索ID" />
        </el-form-item>
        <el-form-item label="是否转派" prop="transfer">
          <el-input v-model="form.transfer" placeholder="请输入是否转派" />
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" placeholder="请输入备注" />
        </el-form-item>
        <el-form-item label="回收时间" prop="endTime">
          <el-date-picker clearable
            v-model="form.endTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择回收时间">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listBusiness, getBusiness, delBusiness, addBusiness, updateBusiness } from "@/api/crm/business";

export default {
  name: "Business",
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
      // 商机表格数据
      businessList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        name: null,
        phone: null,
        channel: null,
        activityId: null,
        provinces: null,
        city: null,
        sex: null,
        age: null,
        weixin: null,
        qq: null,
        level: null,
        subject: null,
        courseId: null,
        occupation: null,
        education: null,
        job: null,
        salary: null,
        major: null,
        expectedSalary: null,
        reasons: null,
        plan: null,
        planTime: null,
        otherIntention: null,
        status: null,
        nextTime: null,
        lastUpdateTime: null,
        clueId: null,
        transfer: null,
        endTime: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询商机列表 */
    getList() {
      this.loading = true;
      listBusiness(this.queryParams).then(response => {
        this.businessList = response.rows;
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
        provinces: null,
        city: null,
        sex: null,
        age: null,
        weixin: null,
        qq: null,
        level: null,
        subject: null,
        courseId: null,
        createBy: null,
        createTime: null,
        occupation: null,
        education: null,
        job: null,
        salary: null,
        major: null,
        expectedSalary: null,
        reasons: null,
        plan: null,
        planTime: null,
        otherIntention: null,
        status: null,
        nextTime: null,
        lastUpdateTime: null,
        clueId: null,
        transfer: null,
        remark: null,
        endTime: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
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
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加商机";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getBusiness(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改商机";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateBusiness(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addBusiness(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除商机编号为"' + ids + '"的数据项？').then(function() {
        return delBusiness(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('crm/business/export', {
        ...this.queryParams
      }, `business_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
