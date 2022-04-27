package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsBrand;
import com.project.mall.product.service.PmsBrandService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsBrand")
public class PmsBrandController {
    /**
     * 服务对象
     */
    @Resource
    private PmsBrandService pmsBrandService;

    /**
     * 分页查询
     *
     * @param pmsBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsBrand>> queryByPage(PmsBrand pmsBrand, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsBrandService.queryByPage(pmsBrand, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsBrand> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsBrandService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsBrand 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsBrand> add(PmsBrand pmsBrand) {
        return ResponseEntity.ok(this.pmsBrandService.insert(pmsBrand));
    }

    /**
     * 编辑数据
     *
     * @param pmsBrand 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsBrand> edit(PmsBrand pmsBrand) {
        return ResponseEntity.ok(this.pmsBrandService.update(pmsBrand));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsBrandService.deleteById(id));
    }

}

