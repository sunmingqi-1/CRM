package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.AssignRecordMapper;
import com.ruoyi.crm.domain.AssignRecord;
import com.ruoyi.crm.service.IAssignRecordService;

/**
 * 分配记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-30
 */
@Service
public class AssignRecordServiceImpl implements IAssignRecordService 
{
    @Autowired
    private AssignRecordMapper assignRecordMapper;

    /**
     * 查询分配记录
     * 
     * @param id 分配记录主键
     * @return 分配记录
     */
    @Override
    public AssignRecord selectAssignRecordById(Long id)
    {
        return assignRecordMapper.selectAssignRecordById(id);
    }

    /**
     * 查询分配记录列表
     * 
     * @param assignRecord 分配记录
     * @return 分配记录
     */
    @Override
    public List<AssignRecord> selectAssignRecordList(AssignRecord assignRecord)
    {
        return assignRecordMapper.selectAssignRecordList(assignRecord);
    }

    /**
     * 新增分配记录
     * 
     * @param assignRecord 分配记录
     * @return 结果
     */
    @Override
    public int insertAssignRecord(AssignRecord assignRecord)
    {
        assignRecord.setCreateTime(DateUtils.getNowDate());
        return assignRecordMapper.insertAssignRecord(assignRecord);
    }

    /**
     * 修改分配记录
     * 
     * @param assignRecord 分配记录
     * @return 结果
     */
    @Override
    public int updateAssignRecord(AssignRecord assignRecord)
    {
        return assignRecordMapper.updateAssignRecord(assignRecord);
    }

    /**
     * 批量删除分配记录
     * 
     * @param ids 需要删除的分配记录主键
     * @return 结果
     */
    @Override
    public int deleteAssignRecordByIds(Long[] ids)
    {
        return assignRecordMapper.deleteAssignRecordByIds(ids);
    }

    /**
     * 删除分配记录信息
     * 
     * @param id 分配记录主键
     * @return 结果
     */
    @Override
    public int deleteAssignRecordById(Long id)
    {
        return assignRecordMapper.deleteAssignRecordById(id);
    }
}
