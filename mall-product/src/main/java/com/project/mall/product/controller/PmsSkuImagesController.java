package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSkuImages;
import com.project.mall.product.service.PmsSkuImagesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku图片(PmsSkuImages)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSkuImages")
public class PmsSkuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuImagesService pmsSkuImagesService;

    /**
     * 分页查询
     *
     * @param pmsSkuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSkuImages>> queryByPage(PmsSkuImages pmsSkuImages, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSkuImagesService.queryByPage(pmsSkuImages, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSkuImages> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSkuImagesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSkuImages> add(PmsSkuImages pmsSkuImages) {
        return ResponseEntity.ok(this.pmsSkuImagesService.insert(pmsSkuImages));
    }

    /**
     * 编辑数据
     *
     * @param pmsSkuImages 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSkuImages> edit(PmsSkuImages pmsSkuImages) {
        return ResponseEntity.ok(this.pmsSkuImagesService.update(pmsSkuImages));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSkuImagesService.deleteById(id));
    }

}

