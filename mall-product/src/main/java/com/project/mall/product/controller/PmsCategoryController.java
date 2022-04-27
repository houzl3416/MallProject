package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsCategory;
import com.project.mall.product.service.PmsCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品三级分类(PmsCategory)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsCategory")
public class PmsCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCategoryService pmsCategoryService;

    /**
     * 分页查询
     *
     * @param pmsCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsCategory>> queryByPage(PmsCategory pmsCategory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsCategoryService.queryByPage(pmsCategory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsCategory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsCategoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsCategory> add(PmsCategory pmsCategory) {
        return ResponseEntity.ok(this.pmsCategoryService.insert(pmsCategory));
    }

    /**
     * 编辑数据
     *
     * @param pmsCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsCategory> edit(PmsCategory pmsCategory) {
        return ResponseEntity.ok(this.pmsCategoryService.update(pmsCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsCategoryService.deleteById(id));
    }

}

