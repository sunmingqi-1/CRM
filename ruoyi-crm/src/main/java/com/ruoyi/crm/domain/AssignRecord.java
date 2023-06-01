package com.ruoyi.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分配记录对象 tb_assign_record
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public class AssignRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 关联id */
    @Excel(name = "关联id")
    private Long assignId;

    /** 类型0 线索 1 商机 */
    @Excel(name = "类型0 线索 1 商机")
    private String type;

    /** 所属人用户id */
    @Excel(name = "所属人用户id")
    private Long userId;

    /** 所属人名称 */
    @Excel(name = "所属人名称")
    private String userName;

    /** 所属人所属组织 */
    @Excel(name = "所属人所属组织")
    private Long deptId;

    /** 是否当前最新分配人 */
    @Excel(name = "是否当前最新分配人")
    private String latest;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAssignId(Long assignId) 
    {
        this.assignId = assignId;
    }

    public Long getAssignId() 
    {
        return assignId;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setLatest(String latest) 
    {
        this.latest = latest;
    }

    public String getLatest() 
    {
        return latest;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("assignId", getAssignId())
            .append("type", getType())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("latest", getLatest())
            .toString();
    }
}
