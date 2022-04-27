package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSpuBounds;
import com.project.mall.coupon.service.SmsSpuBoundsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品spu积分设置(SmsSpuBounds)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSpuBounds")
public class SmsSpuBoundsController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSpuBoundsService smsSpuBoundsService;

    /**
     * 分页查询
     *
     * @param smsSpuBounds 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSpuBounds>> queryByPage(SmsSpuBounds smsSpuBounds, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSpuBoundsService.queryByPage(smsSpuBounds, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSpuBounds> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSpuBoundsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSpuBounds 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSpuBounds> add(SmsSpuBounds smsSpuBounds) {
        return ResponseEntity.ok(this.smsSpuBoundsService.insert(smsSpuBounds));
    }

    /**
     * 编辑数据
     *
     * @param smsSpuBounds 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSpuBounds> edit(SmsSpuBounds smsSpuBounds) {
        return ResponseEntity.ok(this.smsSpuBoundsService.update(smsSpuBounds));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSpuBoundsService.deleteById(id));
    }

}

