package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsCategoryBrandRelation;
import com.project.mall.product.service.PmsCategoryBrandRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsCategoryBrandRelation")
public class PmsCategoryBrandRelationController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 分页查询
     *
     * @param pmsCategoryBrandRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsCategoryBrandRelation>> queryByPage(PmsCategoryBrandRelation pmsCategoryBrandRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsCategoryBrandRelationService.queryByPage(pmsCategoryBrandRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsCategoryBrandRelation> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsCategoryBrandRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsCategoryBrandRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsCategoryBrandRelation> add(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        return ResponseEntity.ok(this.pmsCategoryBrandRelationService.insert(pmsCategoryBrandRelation));
    }

    /**
     * 编辑数据
     *
     * @param pmsCategoryBrandRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsCategoryBrandRelation> edit(PmsCategoryBrandRelation pmsCategoryBrandRelation) {
        return ResponseEntity.ok(this.pmsCategoryBrandRelationService.update(pmsCategoryBrandRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsCategoryBrandRelationService.deleteById(id));
    }

}

