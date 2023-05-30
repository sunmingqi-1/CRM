package com.ruoyi.crm.mapper;

import java.util.List;
import com.ruoyi.crm.domain.Business;

/**
 * 商机Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
public interface BusinessMapper 
{
    /**
     * 查询商机
     * 
     * @param id 商机主键
     * @return 商机
     */
    public Business selectBusinessById(Long id);

    /**
     * 查询商机列表
     * 
     * @param business 商机
     * @return 商机集合
     */
    public List<Business> selectBusinessList(Business business);

    /**
     * 新增商机
     * 
     * @param business 商机
     * @return 结果
     */
    public int insertBusiness(Business business);

    /**
     * 修改商机
     * 
     * @param business 商机
     * @return 结果
     */
    public int updateBusiness(Business business);

    /**
     * 删除商机
     * 
     * @param id 商机主键
     * @return 结果
     */
    public int deleteBusinessById(Long id);

    /**
     * 批量删除商机
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBusinessByIds(Long[] ids);
}
