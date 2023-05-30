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
import com.ruoyi.crm.domain.AssignRecord;
import com.ruoyi.crm.service.IAssignRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线索分配记录Controller
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@RestController
@RequestMapping("/crm/record")
public class AssignRecordController extends BaseController
{
    @Autowired
    private IAssignRecordService assignRecordService;

    /**
     * 查询线索分配记录列表
     */
    @PreAuthorize("@ss.hasPermi('crm:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(AssignRecord assignRecord)
    {
        startPage();
        List<AssignRecord> list = assignRecordService.selectAssignRecordList(assignRecord);
        return getDataTable(list);
    }

    /**
     * 导出线索分配记录列表
     */
    @PreAuthorize("@ss.hasPermi('crm:record:export')")
    @Log(title = "线索分配记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AssignRecord assignRecord)
    {
        List<AssignRecord> list = assignRecordService.selectAssignRecordList(assignRecord);
        ExcelUtil<AssignRecord> util = new ExcelUtil<AssignRecord>(AssignRecord.class);
        util.exportExcel(response, list, "线索分配记录数据");
    }

    /**
     * 获取线索分配记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('crm:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(assignRecordService.selectAssignRecordById(id));
    }

    /**
     * 新增线索分配记录
     */
    @PreAuthorize("@ss.hasPermi('crm:record:add')")
    @Log(title = "线索分配记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AssignRecord assignRecord)
    {
        return toAjax(assignRecordService.insertAssignRecord(assignRecord));
    }

    /**
     * 修改线索分配记录
     */
    @PreAuthorize("@ss.hasPermi('crm:record:edit')")
    @Log(title = "线索分配记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AssignRecord assignRecord)
    {
        return toAjax(assignRecordService.updateAssignRecord(assignRecord));
    }

    /**
     * 删除线索分配记录
     */
    @PreAuthorize("@ss.hasPermi('crm:record:remove')")
    @Log(title = "线索分配记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(assignRecordService.deleteAssignRecordByIds(ids));
    }
}
