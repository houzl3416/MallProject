package com.project.mall.order.controller;

import com.project.mall.order.entity.OmsOrderReturnApply;
import com.project.mall.order.service.OmsOrderReturnApplyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单退货申请(OmsOrderReturnApply)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@RestController
@RequestMapping("omsOrderReturnApply")
public class OmsOrderReturnApplyController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderReturnApplyService omsOrderReturnApplyService;

    /**
     * 分页查询
     *
     * @param omsOrderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OmsOrderReturnApply>> queryByPage(OmsOrderReturnApply omsOrderReturnApply, PageRequest pageRequest) {
        return ResponseEntity.ok(this.omsOrderReturnApplyService.queryByPage(omsOrderReturnApply, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OmsOrderReturnApply> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.omsOrderReturnApplyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OmsOrderReturnApply> add(OmsOrderReturnApply omsOrderReturnApply) {
        return ResponseEntity.ok(this.omsOrderReturnApplyService.insert(omsOrderReturnApply));
    }

    /**
     * 编辑数据
     *
     * @param omsOrderReturnApply 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OmsOrderReturnApply> edit(OmsOrderReturnApply omsOrderReturnApply) {
        return ResponseEntity.ok(this.omsOrderReturnApplyService.update(omsOrderReturnApply));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.omsOrderReturnApplyService.deleteById(id));
    }

}

