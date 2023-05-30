package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.AssignRecordMapper;
import com.ruoyi.crm.domain.AssignRecord;
import com.ruoyi.crm.service.IAssignRecordService;

/**
 * 线索分配记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@Service
public class AssignRecordServiceImpl implements IAssignRecordService 
{
    @Autowired
    private AssignRecordMapper assignRecordMapper;

    /**
     * 查询线索分配记录
     * 
     * @param id 线索分配记录主键
     * @return 线索分配记录
     */
    @Override
    public AssignRecord selectAssignRecordById(Long id)
    {
        return assignRecordMapper.selectAssignRecordById(id);
    }

    /**
     * 查询线索分配记录列表
     * 
     * @param assignRecord 线索分配记录
     * @return 线索分配记录
     */
    @Override
    public List<AssignRecord> selectAssignRecordList(AssignRecord assignRecord)
    {
        return assignRecordMapper.selectAssignRecordList(assignRecord);
    }

    /**
     * 新增线索分配记录
     * 
     * @param assignRecord 线索分配记录
     * @return 结果
     */
    @Override
    public int insertAssignRecord(AssignRecord assignRecord)
    {
        assignRecord.setCreateTime(DateUtils.getNowDate());
        return assignRecordMapper.insertAssignRecord(assignRecord);
    }

    /**
     * 修改线索分配记录
     * 
     * @param assignRecord 线索分配记录
     * @return 结果
     */
    @Override
    public int updateAssignRecord(AssignRecord assignRecord)
    {
        return assignRecordMapper.updateAssignRecord(assignRecord);
    }

    /**
     * 批量删除线索分配记录
     * 
     * @param ids 需要删除的线索分配记录主键
     * @return 结果
     */
    @Override
    public int deleteAssignRecordByIds(Long[] ids)
    {
        return assignRecordMapper.deleteAssignRecordByIds(ids);
    }

    /**
     * 删除线索分配记录信息
     * 
     * @param id 线索分配记录主键
     * @return 结果
     */
    @Override
    public int deleteAssignRecordById(Long id)
    {
        return assignRecordMapper.deleteAssignRecordById(id);
    }
}
