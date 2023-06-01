package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.AssignRecord;

/**
 * 分配记录Service接口
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
public interface IAssignRecordService 
{
    /**
     * 查询分配记录
     * 
     * @param id 分配记录主键
     * @return 分配记录
     */
    public AssignRecord selectAssignRecordById(Long id);

    /**
     * 查询分配记录列表
     * 
     * @param assignRecord 分配记录
     * @return 分配记录集合
     */
    public List<AssignRecord> selectAssignRecordList(AssignRecord assignRecord);

    /**
     * 新增分配记录
     * 
     * @param assignRecord 分配记录
     * @return 结果
     */
    public int insertAssignRecord(AssignRecord assignRecord);

    /**
     * 修改分配记录
     * 
     * @param assignRecord 分配记录
     * @return 结果
     */
    public int updateAssignRecord(AssignRecord assignRecord);

    /**
     * 批量删除分配记录
     * 
     * @param ids 需要删除的分配记录主键集合
     * @return 结果
     */
    public int deleteAssignRecordByIds(Long[] ids);

    /**
     * 删除分配记录信息
     * 
     * @param id 分配记录主键
     * @return 结果
     */
    public int deleteAssignRecordById(Long id);
}
