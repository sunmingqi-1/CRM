package com.ruoyi.crm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 线索对象 tb_clue
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public class Clue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 线索id */
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

    /** 1 男 0 女 */
    @Excel(name = "1 男 0 女")
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

    /** 状态(已分配1  进行中2  回收3  伪线索4) */
    @Excel(name = "状态(已分配1  进行中2  回收3  伪线索4)")
    private String status;

    /** 伪线索失败次数(最大数3次) */
    @Excel(name = "伪线索失败次数(最大数3次)")
    private Long falseCount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nextTime;

    /** 是否转派 */
    @Excel(name = "是否转派")
    private String transfer;

    /** 线索失效时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "线索失效时间", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setFalseCount(Long falseCount) 
    {
        this.falseCount = falseCount;
    }

    public Long getFalseCount() 
    {
        return falseCount;
    }
    public void setNextTime(Date nextTime) 
    {
        this.nextTime = nextTime;
    }

    public Date getNextTime() 
    {
        return nextTime;
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
            .append("sex", getSex())
            .append("age", getAge())
            .append("weixin", getWeixin())
            .append("qq", getQq())
            .append("level", getLevel())
            .append("subject", getSubject())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("falseCount", getFalseCount())
            .append("nextTime", getNextTime())
            .append("updateTime", getUpdateTime())
            .append("transfer", getTransfer())
            .append("endTime", getEndTime())
            .toString();
    }
}
