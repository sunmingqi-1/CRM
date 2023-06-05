package com.ruoyi.crm.service.impl;

import java.util.Date;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.crm.domain.Business;
import com.ruoyi.crm.domain.Clue;
import com.ruoyi.crm.mapper.BusinessMapper;
import com.ruoyi.crm.mapper.ClueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.AssignRecordMapper;
import com.ruoyi.crm.domain.AssignRecord;
import com.ruoyi.crm.service.IAssignRecordService;

import javax.annotation.Resource;

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
    @Resource
    private ClueMapper clueMapper;
    @Resource
    private BusinessMapper businessMapper;
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
     * 1.更新线索或商机的状态为已分配
     * 2.更新分批记录表对应的ID的latest值为0
     * 3.插入分配纪录，latest值为1
     * @param assignRecord 分配记录
     * @return 结果
     */
    @Override
    public int insertAssignRecord(AssignRecord assignRecord)
    {
        if(assignRecord.getType().equals("0")){
            Clue clue = clueMapper.selectClueById(assignRecord.getAssignId());
            clue.setStatus("1");
            clue.setUpdateBy(SecurityUtils.getUsername());
            clue.setUpdateTime(new Date());
            clueMapper.updateClue(clue);
            assignRecordMapper.updateLatest(assignRecord.getAssignId(),"0","0");
            assignRecord.setType("0");
        }else if (assignRecord.getType().equals("1")){
            Business business = businessMapper.selectBusinessById(assignRecord.getAssignId());
            business.setStatus("1");
            business.setUpdateBy(SecurityUtils.getUsername());
            business.setUpdateTime(new Date());
            businessMapper.updateBusiness(business);
            assignRecordMapper.updateLatest(assignRecord.getAssignId(),"0","1");
            assignRecord.setType("1");
        }
        assignRecord.setLatest("1");
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

    @Override
    public int insertAssignRecords(List<AssignRecord> assignRecord) {
        int count = 0;
        for (AssignRecord assignRecorda : assignRecord) {
            count += this.insertAssignRecord(assignRecorda);
        }
        return count;
    }


}
