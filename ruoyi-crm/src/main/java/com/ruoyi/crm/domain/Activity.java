package com.ruoyi.crm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 活动管理对象 tb_activity
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public class Activity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 活动名称 */
    @Excel(name = "活动名称")
    private String name;

    /** 渠道来源 */
    @Excel(name = "渠道来源")
    private String channel;

    /** 活动简介 */
    @Excel(name = "活动简介")
    private String info;

    /** 活动类型1折扣2代金券 */
    @Excel(name = "活动类型1折扣2代金券")
    private String type;

    /** 折扣 */
    @Excel(name = "折扣")
    private Long discount;

    /** 课程代金券 */
    @Excel(name = "课程代金券")
    private Long vouchers;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 活动编码 */
    @Excel(name = "活动编码")
    private String code;

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
    public void setChannel(String channel) 
    {
        this.channel = channel;
    }

    public String getChannel() 
    {
        return channel;
    }
    public void setInfo(String info) 
    {
        this.info = info;
    }

    public String getInfo() 
    {
        return info;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setDiscount(Long discount) 
    {
        this.discount = discount;
    }

    public Long getDiscount() 
    {
        return discount;
    }
    public void setVouchers(Long vouchers) 
    {
        this.vouchers = vouchers;
    }

    public Long getVouchers() 
    {
        return vouchers;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("channel", getChannel())
            .append("info", getInfo())
            .append("type", getType())
            .append("discount", getDiscount())
            .append("vouchers", getVouchers())
            .append("status", getStatus())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("createTime", getCreateTime())
            .append("code", getCode())
            .toString();
    }
}
