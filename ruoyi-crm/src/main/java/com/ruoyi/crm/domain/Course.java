package com.ruoyi.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 课程管理对象 tb_course
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课程id */
    private Long id;

    /** 代码 */
    @Excel(name = "代码")
    private String code;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 学科 */
    @Excel(name = "学科")
    private String subject;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** 适应人群 */
    @Excel(name = "适应人群")
    private String applicablePerson;

    /** 课程描述信息 */
    @Excel(name = "课程描述信息")
    private String info;

    /** 是否删除 1 是 */
    @Excel(name = "是否删除 1 是")
    private Long isDelete;

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

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setApplicablePerson(String applicablePerson) 
    {
        this.applicablePerson = applicablePerson;
    }

    public String getApplicablePerson() 
    {
        return applicablePerson;
    }
    public void setInfo(String info) 
    {
        this.info = info;
    }

    public String getInfo() 
    {
        return info;
    }
    public void setIsDelete(Long isDelete) 
    {
        this.isDelete = isDelete;
    }

    public Long getIsDelete() 
    {
        return isDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("subject", getSubject())
            .append("price", getPrice())
            .append("applicablePerson", getApplicablePerson())
            .append("info", getInfo())
            .append("createTime", getCreateTime())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
