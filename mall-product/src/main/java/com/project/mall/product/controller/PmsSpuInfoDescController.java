package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSpuInfoDesc;
import com.project.mall.product.service.PmsSpuInfoDescService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu信息介绍(PmsSpuInfoDesc)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSpuInfoDesc")
public class PmsSpuInfoDescController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuInfoDescService pmsSpuInfoDescService;

    /**
     * 分页查询
     *
     * @param pmsSpuInfoDesc 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSpuInfoDesc>> queryByPage(PmsSpuInfoDesc pmsSpuInfoDesc, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSpuInfoDescService.queryByPage(pmsSpuInfoDesc, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSpuInfoDesc> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSpuInfoDescService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSpuInfoDesc> add(PmsSpuInfoDesc pmsSpuInfoDesc) {
        return ResponseEntity.ok(this.pmsSpuInfoDescService.insert(pmsSpuInfoDesc));
    }

    /**
     * 编辑数据
     *
     * @param pmsSpuInfoDesc 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSpuInfoDesc> edit(PmsSpuInfoDesc pmsSpuInfoDesc) {
        return ResponseEntity.ok(this.pmsSpuInfoDescService.update(pmsSpuInfoDesc));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSpuInfoDescService.deleteById(id));
    }

}

