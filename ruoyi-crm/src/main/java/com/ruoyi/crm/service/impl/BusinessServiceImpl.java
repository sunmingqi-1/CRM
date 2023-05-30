package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.BusinessMapper;
import com.ruoyi.crm.domain.Business;
import com.ruoyi.crm.service.IBusinessService;

/**
 * 商机Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@Service
public class BusinessServiceImpl implements IBusinessService 
{
    @Autowired
    private BusinessMapper businessMapper;

    /**
     * 查询商机
     * 
     * @param id 商机主键
     * @return 商机
     */
    @Override
    public Business selectBusinessById(Long id)
    {
        return businessMapper.selectBusinessById(id);
    }

    /**
     * 查询商机列表
     * 
     * @param business 商机
     * @return 商机
     */
    @Override
    public List<Business> selectBusinessList(Business business)
    {
        return businessMapper.selectBusinessList(business);
    }

    /**
     * 新增商机
     * 
     * @param business 商机
     * @return 结果
     */
    @Override
    public int insertBusiness(Business business)
    {
        business.setCreateTime(DateUtils.getNowDate());
        return businessMapper.insertBusiness(business);
    }

    /**
     * 修改商机
     * 
     * @param business 商机
     * @return 结果
     */
    @Override
    public int updateBusiness(Business business)
    {
        return businessMapper.updateBusiness(business);
    }

    /**
     * 批量删除商机
     * 
     * @param ids 需要删除的商机主键
     * @return 结果
     */
    @Override
    public int deleteBusinessByIds(Long[] ids)
    {
        return businessMapper.deleteBusinessByIds(ids);
    }

    /**
     * 删除商机信息
     * 
     * @param id 商机主键
     * @return 结果
     */
    @Override
    public int deleteBusinessById(Long id)
    {
        return businessMapper.deleteBusinessById(id);
    }
}
