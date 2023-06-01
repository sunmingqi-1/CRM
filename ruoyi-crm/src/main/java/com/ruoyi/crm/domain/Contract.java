package com.ruoyi.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同对象 tb_contract
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public class Contract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同id */
    private String id;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNo;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String name;

    /** 邮箱地址 */
    @Excel(name = "邮箱地址")
    private String email;

    /** 意向学科 */
    @Excel(name = "意向学科")
    private String subject;

    /** 活动id */
    @Excel(name = "活动id")
    private Long activityId;

    /** 活动名称 */
    @Excel(name = "活动名称")
    private String activityName;

    /** 课程id */
    @Excel(name = "课程id")
    private Long courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 渠道 */
    @Excel(name = "渠道")
    private String channel;

    /** 状态(待审核1，已通过2，已驳回3 全部完成4) */
    @Excel(name = "状态(待审核1，已通过2，已驳回3 全部完成4)")
    private String status;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String fileName;

    /** 订单价格 */
    @Excel(name = "订单价格")
    private Long contractOrder;

    /** 折扣类型 */
    @Excel(name = "折扣类型")
    private String discountType;

    /** 课程价格 */
    @Excel(name = "课程价格")
    private Long coursePrice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String processInstanceId;

    /** 商机ID */
    @Excel(name = "商机ID")
    private Long businessId;

    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setContractNo(String contractNo) 
    {
        this.contractNo = contractNo;
    }

    public String getContractNo() 
    {
        return contractNo;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setActivityId(Long activityId) 
    {
        this.activityId = activityId;
    }

    public Long getActivityId() 
    {
        return activityId;
    }
    public void setActivityName(String activityName) 
    {
        this.activityName = activityName;
    }

    public String getActivityName() 
    {
        return activityName;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setChannel(String channel) 
    {
        this.channel = channel;
    }

    public String getChannel() 
    {
        return channel;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }
    public void setContractOrder(Long contractOrder) 
    {
        this.contractOrder = contractOrder;
    }

    public Long getContractOrder() 
    {
        return contractOrder;
    }
    public void setDiscountType(String discountType) 
    {
        this.discountType = discountType;
    }

    public String getDiscountType() 
    {
        return discountType;
    }
    public void setCoursePrice(Long coursePrice) 
    {
        this.coursePrice = coursePrice;
    }

    public Long getCoursePrice() 
    {
        return coursePrice;
    }
    public void setProcessInstanceId(String processInstanceId) 
    {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessInstanceId() 
    {
        return processInstanceId;
    }
    public void setBusinessId(Long businessId) 
    {
        this.businessId = businessId;
    }

    public Long getBusinessId() 
    {
        return businessId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("contractNo", getContractNo())
            .append("name", getName())
            .append("email", getEmail())
            .append("subject", getSubject())
            .append("activityId", getActivityId())
            .append("activityName", getActivityName())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("channel", getChannel())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("fileName", getFileName())
            .append("contractOrder", getContractOrder())
            .append("discountType", getDiscountType())
            .append("coursePrice", getCoursePrice())
            .append("processInstanceId", getProcessInstanceId())
            .append("businessId", getBusinessId())
            .toString();
    }
}
