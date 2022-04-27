package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsAttrGroup;
import com.project.mall.product.service.PmsAttrGroupService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 属性分组(PmsAttrGroup)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsAttrGroup")
public class PmsAttrGroupController {
    /**
     * 服务对象
     */
    @Resource
    private PmsAttrGroupService pmsAttrGroupService;

    /**
     * 分页查询
     *
     * @param pmsAttrGroup 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsAttrGroup>> queryByPage(PmsAttrGroup pmsAttrGroup, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsAttrGroupService.queryByPage(pmsAttrGroup, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsAttrGroup> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsAttrGroupService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsAttrGroup> add(PmsAttrGroup pmsAttrGroup) {
        return ResponseEntity.ok(this.pmsAttrGroupService.insert(pmsAttrGroup));
    }

    /**
     * 编辑数据
     *
     * @param pmsAttrGroup 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsAttrGroup> edit(PmsAttrGroup pmsAttrGroup) {
        return ResponseEntity.ok(this.pmsAttrGroupService.update(pmsAttrGroup));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsAttrGroupService.deleteById(id));
    }

}

