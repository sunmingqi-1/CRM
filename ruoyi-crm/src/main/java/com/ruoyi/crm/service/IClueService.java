package com.ruoyi.crm.service;

import java.util.List;
import com.ruoyi.crm.domain.Clue;

/**
 * 线索Service接口
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public interface IClueService 
{
    /**
     * 查询线索
     * 
     * @param id 线索主键
     * @return 线索
     */
    public Clue selectClueById(Long id);

    /**
     * 查询线索列表
     * 
     * @param clue 线索
     * @return 线索集合
     */
    public List<Clue> selectClueList(Clue clue);

    /**
     * 新增线索
     * 
     * @param clue 线索
     * @return 结果
     */
    public int insertClue(Clue clue);

    /**
     * 修改线索
     * 
     * @param clue 线索
     * @return 结果
     */
    public int updateClue(Clue clue);

    /**
     * 批量删除线索
     * 
     * @param ids 需要删除的线索主键集合
     * @return 结果
     */
    public int deleteClueByIds(Long[] ids);

    /**
     * 删除线索信息
     * 
     * @param id 线索主键
     * @return 结果
     */
    public int deleteClueById(Long id);
}
