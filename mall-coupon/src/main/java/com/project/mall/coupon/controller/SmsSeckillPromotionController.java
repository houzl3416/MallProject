package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSeckillPromotion;
import com.project.mall.coupon.service.SmsSeckillPromotionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动(SmsSeckillPromotion)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSeckillPromotion")
public class SmsSeckillPromotionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 分页查询
     *
     * @param smsSeckillPromotion 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSeckillPromotion>> queryByPage(SmsSeckillPromotion smsSeckillPromotion, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSeckillPromotionService.queryByPage(smsSeckillPromotion, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSeckillPromotion> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSeckillPromotionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillPromotion 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSeckillPromotion> add(SmsSeckillPromotion smsSeckillPromotion) {
        return ResponseEntity.ok(this.smsSeckillPromotionService.insert(smsSeckillPromotion));
    }

    /**
     * 编辑数据
     *
     * @param smsSeckillPromotion 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSeckillPromotion> edit(SmsSeckillPromotion smsSeckillPromotion) {
        return ResponseEntity.ok(this.smsSeckillPromotionService.update(smsSeckillPromotion));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSeckillPromotionService.deleteById(id));
    }

}

