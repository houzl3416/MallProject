package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsProductAttrValue;
import com.project.mall.product.service.PmsProductAttrValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu属性值(PmsProductAttrValue)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsProductAttrValue")
public class PmsProductAttrValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsProductAttrValueService pmsProductAttrValueService;

    /**
     * 分页查询
     *
     * @param pmsProductAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsProductAttrValue>> queryByPage(PmsProductAttrValue pmsProductAttrValue, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsProductAttrValueService.queryByPage(pmsProductAttrValue, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsProductAttrValue> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsProductAttrValueService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsProductAttrValue> add(PmsProductAttrValue pmsProductAttrValue) {
        return ResponseEntity.ok(this.pmsProductAttrValueService.insert(pmsProductAttrValue));
    }

    /**
     * 编辑数据
     *
     * @param pmsProductAttrValue 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsProductAttrValue> edit(PmsProductAttrValue pmsProductAttrValue) {
        return ResponseEntity.ok(this.pmsProductAttrValueService.update(pmsProductAttrValue));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsProductAttrValueService.deleteById(id));
    }

}

