package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSpuImages;
import com.project.mall.product.service.PmsSpuImagesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu图片(PmsSpuImages)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSpuImages")
public class PmsSpuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuImagesService pmsSpuImagesService;

    /**
     * 分页查询
     *
     * @param pmsSpuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSpuImages>> queryByPage(PmsSpuImages pmsSpuImages, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSpuImagesService.queryByPage(pmsSpuImages, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSpuImages> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSpuImagesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSpuImages> add(PmsSpuImages pmsSpuImages) {
        return ResponseEntity.ok(this.pmsSpuImagesService.insert(pmsSpuImages));
    }

    /**
     * 编辑数据
     *
     * @param pmsSpuImages 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSpuImages> edit(PmsSpuImages pmsSpuImages) {
        return ResponseEntity.ok(this.pmsSpuImagesService.update(pmsSpuImages));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSpuImagesService.deleteById(id));
    }

}

