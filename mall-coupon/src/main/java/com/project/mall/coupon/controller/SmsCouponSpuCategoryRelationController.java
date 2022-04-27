package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsCouponSpuCategoryRelation;
import com.project.mall.coupon.service.SmsCouponSpuCategoryRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsCouponSpuCategoryRelation")
public class SmsCouponSpuCategoryRelationController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
     * 分页查询
     *
     * @param smsCouponSpuCategoryRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsCouponSpuCategoryRelation>> queryByPage(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsCouponSpuCategoryRelationService.queryByPage(smsCouponSpuCategoryRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsCouponSpuCategoryRelation> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsCouponSpuCategoryRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuCategoryRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsCouponSpuCategoryRelation> add(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        return ResponseEntity.ok(this.smsCouponSpuCategoryRelationService.insert(smsCouponSpuCategoryRelation));
    }

    /**
     * 编辑数据
     *
     * @param smsCouponSpuCategoryRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsCouponSpuCategoryRelation> edit(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        return ResponseEntity.ok(this.smsCouponSpuCategoryRelationService.update(smsCouponSpuCategoryRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsCouponSpuCategoryRelationService.deleteById(id));
    }

}

