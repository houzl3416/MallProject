package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSkuSaleAttrValue;
import com.project.mall.product.service.PmsSkuSaleAttrValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSkuSaleAttrValue")
public class PmsSkuSaleAttrValueController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 分页查询
     *
     * @param pmsSkuSaleAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSkuSaleAttrValue>> queryByPage(PmsSkuSaleAttrValue pmsSkuSaleAttrValue, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSkuSaleAttrValueService.queryByPage(pmsSkuSaleAttrValue, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSkuSaleAttrValue> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSkuSaleAttrValueService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSkuSaleAttrValue> add(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return ResponseEntity.ok(this.pmsSkuSaleAttrValueService.insert(pmsSkuSaleAttrValue));
    }

    /**
     * 编辑数据
     *
     * @param pmsSkuSaleAttrValue 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSkuSaleAttrValue> edit(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return ResponseEntity.ok(this.pmsSkuSaleAttrValueService.update(pmsSkuSaleAttrValue));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSkuSaleAttrValueService.deleteById(id));
    }

}

