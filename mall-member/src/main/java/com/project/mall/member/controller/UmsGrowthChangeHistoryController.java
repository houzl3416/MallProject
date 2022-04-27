package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsGrowthChangeHistory;
import com.project.mall.member.service.UmsGrowthChangeHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsGrowthChangeHistory")
public class UmsGrowthChangeHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * 分页查询
     *
     * @param umsGrowthChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsGrowthChangeHistory>> queryByPage(UmsGrowthChangeHistory umsGrowthChangeHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsGrowthChangeHistoryService.queryByPage(umsGrowthChangeHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsGrowthChangeHistory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsGrowthChangeHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsGrowthChangeHistory> add(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        return ResponseEntity.ok(this.umsGrowthChangeHistoryService.insert(umsGrowthChangeHistory));
    }

    /**
     * 编辑数据
     *
     * @param umsGrowthChangeHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsGrowthChangeHistory> edit(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        return ResponseEntity.ok(this.umsGrowthChangeHistoryService.update(umsGrowthChangeHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsGrowthChangeHistoryService.deleteById(id));
    }

}

