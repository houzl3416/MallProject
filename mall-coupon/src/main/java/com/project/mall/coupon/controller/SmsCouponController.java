package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsCoupon;
import com.project.mall.coupon.service.SmsCouponService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券信息(SmsCoupon)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:03
 */
@RestController
@RequestMapping("smsCoupon")
public class SmsCouponController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponService smsCouponService;

    /**
     * 分页查询
     *
     * @param smsCoupon 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsCoupon>> queryByPage(SmsCoupon smsCoupon, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsCouponService.queryByPage(smsCoupon, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsCoupon> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsCouponService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCoupon 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsCoupon> add(SmsCoupon smsCoupon) {
        return ResponseEntity.ok(this.smsCouponService.insert(smsCoupon));
    }

    /**
     * 编辑数据
     *
     * @param smsCoupon 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsCoupon> edit(SmsCoupon smsCoupon) {
        return ResponseEntity.ok(this.smsCouponService.update(smsCoupon));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsCouponService.deleteById(id));
    }

}

