package com.ruoyi.crm.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.crm.domain.Business;
import com.ruoyi.crm.service.IBusinessService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商机Controller
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@RestController
@RequestMapping("/crm/business")
public class BusinessController extends BaseController
{
    @Autowired
    private IBusinessService businessService;

    /**
     * 查询商机列表
     */
    @PreAuthorize("@ss.hasPermi('crm:business:list')")
    @GetMapping("/list")
    public TableDataInfo list(Business business)
    {
        startPage();
        List<Business> list = businessService.selectBusinessList(business);
        return getDataTable(list);
    }

    /**
     * 导出商机列表
     */
    @PreAuthorize("@ss.hasPermi('crm:business:export')")
    @Log(title = "商机", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Business business)
    {
        List<Business> list = businessService.selectBusinessList(business);
        ExcelUtil<Business> util = new ExcelUtil<Business>(Business.class);
        util.exportExcel(response, list, "商机数据");
    }

    /**
     * 获取商机详细信息
     */
    @PreAuthorize("@ss.hasPermi('crm:business:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(businessService.selectBusinessById(id));
    }

    /**
     * 新增商机
     */
    @PreAuthorize("@ss.hasPermi('crm:business:add')")
    @Log(title = "商机", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Business business)
    {
        return toAjax(businessService.insertBusiness(business));
    }

    /**
     * 修改商机
     */
    @PreAuthorize("@ss.hasPermi('crm:business:edit')")
    @Log(title = "商机", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Business business)
    {
        return toAjax(businessService.updateBusiness(business));
    }

    /**
     * 删除商机
     */
    @PreAuthorize("@ss.hasPermi('crm:business:remove')")
    @Log(title = "商机", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(businessService.deleteBusinessByIds(ids));
    }
}
