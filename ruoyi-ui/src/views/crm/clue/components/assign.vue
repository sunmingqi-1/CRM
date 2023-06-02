<template>
  <el-dialog title="分配线索" :visible.sync="open">
    <el-tag>
      你选择了{{ ids.length }}
    </el-tag>
    <el-form :model="form" ref="form">
      <el-row :gutter="5">
        <el-col :span="16">
          <el-form-item label="部门" prop="deptId">
            <treeselect v-model="form.deptId" :options="deptOptions"
                        :show-count="true" placeholder="请选择部门" :disable-branch-nodes="true" @input="changet"/>
          </el-form-item>
        </el-col>
        <el-col :span="8">
          <el-form-item label="用户" prop="userId">
            <el-select v-model="form.userId" placeholder="请选择用户" clearable
            >
              <el-option v-for="dict in deptChOptions"
                         :label="dict.nickName"
                         :value="dict.userId"/>
            </el-select>
          </el-form-item>
        </el-col>
      </el-row>
    </el-form>
    <div slot="footer" class="dialog-footer">
      <el-button @click="restform">取 消</el-button>
      <el-button type="primary" @click="submitForm">确 定</el-button>
    </div>
  </el-dialog>
</template>

<script>
import Treeselect from "@riophae/vue-treeselect";
import "@riophae/vue-treeselect/dist/vue-treeselect.css";
import {deptTreeSelect} from "@/api/system/user";
import {listUser} from "@/api/system/user";
import {addAssignRecord} from "@/api/crm/assignRecord";

export default {
  name: "assign.vue",
  components: {Treeselect},
  data() {
    return {
      ids: [],
      open: false,
      form: {
        userId: null,
        deptId: null,
      },
      deptOptions: [],
      deptChOptions: [],
      rules: {
        userId: [{required: true, message: "用户不能为空", trigger: "blur"}],
        deptId: [{required: true, message: "部门不能为空", trigger: "blur"}],
      }
    }
  },
  created() {
    this.getDeptTree();
  },
  methods: {
    getDeptTree() {
      deptTreeSelect().then(response => {
        this.deptOptions = response.data;
      });
    },
    changet(val) {
      if (val) {
        listUser({deptId: val}).then(resp => {
          this.deptChOptions = resp.rows;
          this.form.userId = null
        })
      } else {
        this.deptChOptions = []
      }
    }, submitForm() {
      this.$refs.form.validate(vaile => {
        if (vaile) {
          this.open = false;
          let assignList = this.idToList();
          addAssignRecord(assignList).then(resp => {
            if (resp.code == 200) {
              this.$modal.msgSuccess("分配成功")
              this.open = false;
              this.$emit('ok')
              this.form = {
                deptId: null,
                userId: null,
              }
            }
          })
        }
      })
    }, restform() {
      this.form = {
        deptId: null,
        userId: null,
      }
      this.open = false;
    }, idToList() {
      let list =[];
     let userName= this.deptChOptions.find(item => item.userId ==this.form.userId).userName;
      for (let id of this.ids) {
        let item = {
          assignId: id,
          type: '0',
          userId: this.form.userId,
          userName: userName,
          deptId: this.form.deptId,
        }
        list.push(item)
      }
      return list;
    }
  }
}
</script>

<style scoped>

</style>
