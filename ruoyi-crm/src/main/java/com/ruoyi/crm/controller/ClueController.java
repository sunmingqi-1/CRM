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
import com.ruoyi.crm.domain.Clue;
import com.ruoyi.crm.service.IClueService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线索Controller
 * 
 * @author ruoyi
 * @date 2023-05-29
 */
@RestController
@RequestMapping("/crm/clue")
public class ClueController extends BaseController
{
    @Autowired
    private IClueService clueService;

    /**
     * 查询线索列表
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:list')")
    @GetMapping("/list")
    public TableDataInfo list(Clue clue)
    {
        startPage();
        List<Clue> list = clueService.selectClueList(clue);
        return getDataTable(list);
    }

    /**
     * 导出线索列表
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:export')")
    @Log(title = "线索", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Clue clue)
    {
        List<Clue> list = clueService.selectClueList(clue);
        ExcelUtil<Clue> util = new ExcelUtil<Clue>(Clue.class);
        util.exportExcel(response, list, "线索数据");
    }

    /**
     * 获取线索详细信息
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(clueService.selectClueById(id));
    }

    /**
     * 新增线索
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:add')")
    @Log(title = "线索", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Clue clue)
    {
        return toAjax(clueService.insertClue(clue));
    }

    /**
     * 修改线索
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:edit')")
    @Log(title = "线索", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Clue clue)
    {
        return toAjax(clueService.updateClue(clue));
    }

    /**
     * 删除线索
     */
    @PreAuthorize("@ss.hasPermi('crm:clue:remove')")
    @Log(title = "线索", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(clueService.deleteClueByIds(ids));
    }
}
