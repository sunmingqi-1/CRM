package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.ClueMapper;
import com.ruoyi.crm.domain.Clue;
import com.ruoyi.crm.service.IClueService;

/**
 * 线索Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@Service
public class ClueServiceImpl implements IClueService 
{
    @Autowired
    private ClueMapper clueMapper;

    /**
     * 查询线索
     * 
     * @param id 线索主键
     * @return 线索
     */
    @Override
    public Clue selectClueById(Long id)
    {
        return clueMapper.selectClueById(id);
    }

    /**
     * 查询线索列表
     * 
     * @param clue 线索
     * @return 线索
     */
    @Override
    public List<Clue> selectClueList(Clue clue)
    {
        return clueMapper.selectClueList(clue);
    }

    /**
     * 新增线索
     * 
     * @param clue 线索
     * @return 结果
     */
    @Override
    public int insertClue(Clue clue)
    {
        clue.setCreateTime(DateUtils.getNowDate());
        return clueMapper.insertClue(clue);
    }

    /**
     * 修改线索
     * 
     * @param clue 线索
     * @return 结果
     */
    @Override
    public int updateClue(Clue clue)
    {
        clue.setUpdateTime(DateUtils.getNowDate());
        return clueMapper.updateClue(clue);
    }

    /**
     * 批量删除线索
     * 
     * @param ids 需要删除的线索主键
     * @return 结果
     */
    @Override
    public int deleteClueByIds(Long[] ids)
    {
        return clueMapper.deleteClueByIds(ids);
    }

    /**
     * 删除线索信息
     * 
     * @param id 线索主键
     * @return 结果
     */
    @Override
    public int deleteClueById(Long id)
    {
        return clueMapper.deleteClueById(id);
    }
}
