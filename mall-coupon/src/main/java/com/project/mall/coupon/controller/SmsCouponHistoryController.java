package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsCouponHistory;
import com.project.mall.coupon.service.SmsCouponHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsCouponHistory")
public class SmsCouponHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponHistoryService smsCouponHistoryService;

    /**
     * 分页查询
     *
     * @param smsCouponHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsCouponHistory>> queryByPage(SmsCouponHistory smsCouponHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsCouponHistoryService.queryByPage(smsCouponHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsCouponHistory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsCouponHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsCouponHistory> add(SmsCouponHistory smsCouponHistory) {
        return ResponseEntity.ok(this.smsCouponHistoryService.insert(smsCouponHistory));
    }

    /**
     * 编辑数据
     *
     * @param smsCouponHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsCouponHistory> edit(SmsCouponHistory smsCouponHistory) {
        return ResponseEntity.ok(this.smsCouponHistoryService.update(smsCouponHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsCouponHistoryService.deleteById(id));
    }

}

