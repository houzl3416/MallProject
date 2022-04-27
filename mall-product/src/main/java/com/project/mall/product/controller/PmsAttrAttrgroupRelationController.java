package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsAttrAttrgroupRelation;
import com.project.mall.product.service.PmsAttrAttrgroupRelationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsAttrAttrgroupRelation")
public class PmsAttrAttrgroupRelationController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    /**
     * 分页查询
     *
     * @param pmsAttrAttrgroupRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsAttrAttrgroupRelation>> queryByPage(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsAttrAttrgroupRelationService.queryByPage(pmsAttrAttrgroupRelation, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsAttrAttrgroupRelation> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsAttrAttrgroupRelationService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsAttrAttrgroupRelation> add(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        return ResponseEntity.ok(this.pmsAttrAttrgroupRelationService.insert(pmsAttrAttrgroupRelation));
    }

    /**
     * 编辑数据
     *
     * @param pmsAttrAttrgroupRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsAttrAttrgroupRelation> edit(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        return ResponseEntity.ok(this.pmsAttrAttrgroupRelationService.update(pmsAttrAttrgroupRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsAttrAttrgroupRelationService.deleteById(id));
    }

}

