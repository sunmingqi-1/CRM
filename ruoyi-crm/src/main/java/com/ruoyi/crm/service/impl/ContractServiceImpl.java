package com.ruoyi.crm.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.crm.mapper.ContractMapper;
import com.ruoyi.crm.domain.Contract;
import com.ruoyi.crm.service.IContractService;

/**
 * 合同Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@Service
public class ContractServiceImpl implements IContractService 
{
    @Autowired
    private ContractMapper contractMapper;

    /**
     * 查询合同
     * 
     * @param id 合同主键
     * @return 合同
     */
    @Override
    public Contract selectContractById(String id)
    {
        return contractMapper.selectContractById(id);
    }

    /**
     * 查询合同列表
     * 
     * @param contract 合同
     * @return 合同
     */
    @Override
    public List<Contract> selectContractList(Contract contract)
    {
        return contractMapper.selectContractList(contract);
    }

    /**
     * 新增合同
     * 
     * @param contract 合同
     * @return 结果
     */
    @Override
    public int insertContract(Contract contract)
    {
        contract.setCreateTime(DateUtils.getNowDate());
        return contractMapper.insertContract(contract);
    }

    /**
     * 修改合同
     * 
     * @param contract 合同
     * @return 结果
     */
    @Override
    public int updateContract(Contract contract)
    {
        return contractMapper.updateContract(contract);
    }

    /**
     * 批量删除合同
     * 
     * @param ids 需要删除的合同主键
     * @return 结果
     */
    @Override
    public int deleteContractByIds(String[] ids)
    {
        return contractMapper.deleteContractByIds(ids);
    }

    /**
     * 删除合同信息
     * 
     * @param id 合同主键
     * @return 结果
     */
    @Override
    public int deleteContractById(String id)
    {
        return contractMapper.deleteContractById(id);
    }
}
