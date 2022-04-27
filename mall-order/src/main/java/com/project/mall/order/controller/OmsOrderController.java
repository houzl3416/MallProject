package com.project.mall.order.controller;

import com.project.mall.order.entity.OmsOrder;
import com.project.mall.order.service.OmsOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单(OmsOrder)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:07:53
 */
@RestController
@RequestMapping("omsOrder")
public class OmsOrderController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderService omsOrderService;

    /**
     * 分页查询
     *
     * @param omsOrder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OmsOrder>> queryByPage(OmsOrder omsOrder, PageRequest pageRequest) {
        return ResponseEntity.ok(this.omsOrderService.queryByPage(omsOrder, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OmsOrder> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.omsOrderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OmsOrder> add(OmsOrder omsOrder) {
        return ResponseEntity.ok(this.omsOrderService.insert(omsOrder));
    }

    /**
     * 编辑数据
     *
     * @param omsOrder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OmsOrder> edit(OmsOrder omsOrder) {
        return ResponseEntity.ok(this.omsOrderService.update(omsOrder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.omsOrderService.deleteById(id));
    }

}

