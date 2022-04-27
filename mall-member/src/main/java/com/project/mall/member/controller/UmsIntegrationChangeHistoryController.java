package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsIntegrationChangeHistory;
import com.project.mall.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsIntegrationChangeHistory")
public class UmsIntegrationChangeHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * 分页查询
     *
     * @param umsIntegrationChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsIntegrationChangeHistory>> queryByPage(UmsIntegrationChangeHistory umsIntegrationChangeHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsIntegrationChangeHistoryService.queryByPage(umsIntegrationChangeHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsIntegrationChangeHistory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsIntegrationChangeHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsIntegrationChangeHistory> add(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return ResponseEntity.ok(this.umsIntegrationChangeHistoryService.insert(umsIntegrationChangeHistory));
    }

    /**
     * 编辑数据
     *
     * @param umsIntegrationChangeHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsIntegrationChangeHistory> edit(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return ResponseEntity.ok(this.umsIntegrationChangeHistoryService.update(umsIntegrationChangeHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsIntegrationChangeHistoryService.deleteById(id));
    }

}

