package com.ruoyi.crm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商机对象 tb_business
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public class Business extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商机id */
    private Long id;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String name;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 渠道 */
    @Excel(name = "渠道")
    private String channel;

    /** 活动id */
    @Excel(name = "活动id")
    private Long activityId;

    /** 省 */
    @Excel(name = "省")
    private String provinces;

    /** 区 */
    @Excel(name = "区")
    private String city;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 微信 */
    @Excel(name = "微信")
    private String weixin;

    /** qq */
    @Excel(name = "qq")
    private String qq;

    /** 意向等级 */
    @Excel(name = "意向等级")
    private String level;

    /** 意向学科 */
    @Excel(name = "意向学科")
    private String subject;

    /** 课程 */
    @Excel(name = "课程")
    private Long courseId;

    /** 职业 */
    @Excel(name = "职业")
    private String occupation;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 在职情况 */
    @Excel(name = "在职情况")
    private String job;

    /** 薪资 */
    @Excel(name = "薪资")
    private String salary;

    /** 专业 */
    @Excel(name = "专业")
    private String major;

    /** 希望薪资 */
    @Excel(name = "希望薪资")
    private String expectedSalary;

    /** 学习原因 */
    @Excel(name = "学习原因")
    private String reasons;

    /** 职业计划 */
    @Excel(name = "职业计划")
    private String plan;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planTime;

    /** 其他意向 */
    @Excel(name = "其他意向")
    private String otherIntention;

    /** 状态(已分配1  进行中2  回收3) */
    @Excel(name = "状态(已分配1  进行中2  回收3)")
    private String status;

    /** 下次跟进时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下次跟进时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextTime;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastUpdateTime;

    /** 线索ID */
    @Excel(name = "线索ID")
    private Long clueId;

    /** 是否转派 */
    @Excel(name = "是否转派")
    private String transfer;

    /** 回收时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回收时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setChannel(String channel) 
    {
        this.channel = channel;
    }

    public String getChannel() 
    {
        return channel;
    }
    public void setActivityId(Long activityId) 
    {
        this.activityId = activityId;
    }

    public Long getActivityId() 
    {
        return activityId;
    }
    public void setProvinces(String provinces) 
    {
        this.provinces = provinces;
    }

    public String getProvinces() 
    {
        return provinces;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setWeixin(String weixin) 
    {
        this.weixin = weixin;
    }

    public String getWeixin() 
    {
        return weixin;
    }
    public void setQq(String qq) 
    {
        this.qq = qq;
    }

    public String getQq() 
    {
        return qq;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setCourseId(Long courseId) 
    {
        this.courseId = courseId;
    }

    public Long getCourseId() 
    {
        return courseId;
    }
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setJob(String job) 
    {
        this.job = job;
    }

    public String getJob() 
    {
        return job;
    }
    public void setSalary(String salary) 
    {
        this.salary = salary;
    }

    public String getSalary() 
    {
        return salary;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setExpectedSalary(String expectedSalary) 
    {
        this.expectedSalary = expectedSalary;
    }

    public String getExpectedSalary() 
    {
        return expectedSalary;
    }
    public void setReasons(String reasons) 
    {
        this.reasons = reasons;
    }

    public String getReasons() 
    {
        return reasons;
    }
    public void setPlan(String plan) 
    {
        this.plan = plan;
    }

    public String getPlan() 
    {
        return plan;
    }
    public void setPlanTime(Date planTime) 
    {
        this.planTime = planTime;
    }

    public Date getPlanTime() 
    {
        return planTime;
    }
    public void setOtherIntention(String otherIntention) 
    {
        this.otherIntention = otherIntention;
    }

    public String getOtherIntention() 
    {
        return otherIntention;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setNextTime(Date nextTime) 
    {
        this.nextTime = nextTime;
    }

    public Date getNextTime() 
    {
        return nextTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) 
    {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime() 
    {
        return lastUpdateTime;
    }
    public void setClueId(Long clueId) 
    {
        this.clueId = clueId;
    }

    public Long getClueId() 
    {
        return clueId;
    }
    public void setTransfer(String transfer) 
    {
        this.transfer = transfer;
    }

    public String getTransfer() 
    {
        return transfer;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("channel", getChannel())
            .append("activityId", getActivityId())
            .append("provinces", getProvinces())
            .append("city", getCity())
            .append("sex", getSex())
            .append("age", getAge())
            .append("weixin", getWeixin())
            .append("qq", getQq())
            .append("level", getLevel())
            .append("subject", getSubject())
            .append("courseId", getCourseId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("occupation", getOccupation())
            .append("education", getEducation())
            .append("job", getJob())
            .append("salary", getSalary())
            .append("major", getMajor())
            .append("expectedSalary", getExpectedSalary())
            .append("reasons", getReasons())
            .append("plan", getPlan())
            .append("planTime", getPlanTime())
            .append("otherIntention", getOtherIntention())
            .append("status", getStatus())
            .append("nextTime", getNextTime())
            .append("lastUpdateTime", getLastUpdateTime())
            .append("clueId", getClueId())
            .append("transfer", getTransfer())
            .append("remark", getRemark())
            .append("endTime", getEndTime())
            .toString();
    }
}
