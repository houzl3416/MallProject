package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSeckillSkuRelation;
import com.project.mall.coupon.service.SmsSeckillSkuRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSeckillSkuRelation")
public class SmsSeckillSkuRelationController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    /**
     * 分页查询
     *
     * @param smsSeckillSkuRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSeckillSkuRelation>> queryByPage(SmsSeckillSkuRelation smsSeckillSkuRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSeckillSkuRelationService.queryByPage(smsSeckillSkuRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSeckillSkuRelation> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSeckillSkuRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSeckillSkuRelation> add(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return ResponseEntity.ok(this.smsSeckillSkuRelationService.insert(smsSeckillSkuRelation));
    }

    /**
     * 编辑数据
     *
     * @param smsSeckillSkuRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSeckillSkuRelation> edit(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return ResponseEntity.ok(this.smsSeckillSkuRelationService.update(smsSeckillSkuRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSeckillSkuRelationService.deleteById(id));
    }

}

