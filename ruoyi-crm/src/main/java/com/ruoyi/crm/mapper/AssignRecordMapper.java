package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.AssignRecord;

/**
 * 线索分配记录Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public interface AssignRecordMapper 
{
    /**
     * 查询线索分配记录
     * 
     * @param id 线索分配记录主键
     * @return 线索分配记录
     */
    public AssignRecord selectAssignRecordById(Long id);

    /**
     * 查询线索分配记录列表
     * 
     * @param assignRecord 线索分配记录
     * @return 线索分配记录集合
     */
    public List<AssignRecord> selectAssignRecordList(AssignRecord assignRecord);

    /**
     * 新增线索分配记录
     * 
     * @param assignRecord 线索分配记录
     * @return 结果
     */
    public int insertAssignRecord(AssignRecord assignRecord);

    /**
     * 修改线索分配记录
     * 
     * @param assignRecord 线索分配记录
     * @return 结果
     */
    public int updateAssignRecord(AssignRecord assignRecord);

    /**
     * 删除线索分配记录
     * 
     * @param id 线索分配记录主键
     * @return 结果
     */
    public int deleteAssignRecordById(Long id);

    /**
     * 批量删除线索分配记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAssignRecordByIds(Long[] ids);
}
