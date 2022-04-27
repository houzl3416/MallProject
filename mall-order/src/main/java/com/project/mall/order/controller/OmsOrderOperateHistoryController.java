package com.project.mall.order.controller;

import com.project.mall.order.entity.OmsOrderOperateHistory;
import com.project.mall.order.service.OmsOrderOperateHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@RestController
@RequestMapping("omsOrderOperateHistory")
public class OmsOrderOperateHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderOperateHistoryService omsOrderOperateHistoryService;

    /**
     * 分页查询
     *
     * @param omsOrderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OmsOrderOperateHistory>> queryByPage(OmsOrderOperateHistory omsOrderOperateHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.omsOrderOperateHistoryService.queryByPage(omsOrderOperateHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OmsOrderOperateHistory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.omsOrderOperateHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OmsOrderOperateHistory> add(OmsOrderOperateHistory omsOrderOperateHistory) {
        return ResponseEntity.ok(this.omsOrderOperateHistoryService.insert(omsOrderOperateHistory));
    }

    /**
     * 编辑数据
     *
     * @param omsOrderOperateHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OmsOrderOperateHistory> edit(OmsOrderOperateHistory omsOrderOperateHistory) {
        return ResponseEntity.ok(this.omsOrderOperateHistoryService.update(omsOrderOperateHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.omsOrderOperateHistoryService.deleteById(id));
    }

}

