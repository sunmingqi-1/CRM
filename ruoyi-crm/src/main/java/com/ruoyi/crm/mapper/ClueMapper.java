package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.Clue;

/**
 * 线索Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public interface ClueMapper 
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
     * 删除线索
     * 
     * @param id 线索主键
     * @return 结果
     */
    public int deleteClueById(Long id);

    /**
     * 批量删除线索
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClueByIds(Long[] ids);
}
