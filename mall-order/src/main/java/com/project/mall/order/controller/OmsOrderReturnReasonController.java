package com.project.mall.order.controller;

import com.project.mall.order.entity.OmsOrderReturnReason;
import com.project.mall.order.service.OmsOrderReturnReasonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 退货原因(OmsOrderReturnReason)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@RestController
@RequestMapping("omsOrderReturnReason")
public class OmsOrderReturnReasonController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 分页查询
     *
     * @param omsOrderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OmsOrderReturnReason>> queryByPage(OmsOrderReturnReason omsOrderReturnReason, PageRequest pageRequest) {
        return ResponseEntity.ok(this.omsOrderReturnReasonService.queryByPage(omsOrderReturnReason, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OmsOrderReturnReason> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.omsOrderReturnReasonService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OmsOrderReturnReason> add(OmsOrderReturnReason omsOrderReturnReason) {
        return ResponseEntity.ok(this.omsOrderReturnReasonService.insert(omsOrderReturnReason));
    }

    /**
     * 编辑数据
     *
     * @param omsOrderReturnReason 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OmsOrderReturnReason> edit(OmsOrderReturnReason omsOrderReturnReason) {
        return ResponseEntity.ok(this.omsOrderReturnReasonService.update(omsOrderReturnReason));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.omsOrderReturnReasonService.deleteById(id));
    }

}

