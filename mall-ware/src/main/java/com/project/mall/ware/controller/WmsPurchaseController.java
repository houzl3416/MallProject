package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsPurchase;
import com.project.mall.ware.service.WmsPurchaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 采购信息(WmsPurchase)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:48
 */
@RestController
@RequestMapping("wmsPurchase")
public class WmsPurchaseController {
    /**
     * 服务对象
     */
    @Resource
    private WmsPurchaseService wmsPurchaseService;

    /**
     * 分页查询
     *
     * @param wmsPurchase 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsPurchase>> queryByPage(WmsPurchase wmsPurchase, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsPurchaseService.queryByPage(wmsPurchase, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsPurchase> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsPurchaseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsPurchase 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsPurchase> add(WmsPurchase wmsPurchase) {
        return ResponseEntity.ok(this.wmsPurchaseService.insert(wmsPurchase));
    }

    /**
     * 编辑数据
     *
     * @param wmsPurchase 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsPurchase> edit(WmsPurchase wmsPurchase) {
        return ResponseEntity.ok(this.wmsPurchaseService.update(wmsPurchase));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsPurchaseService.deleteById(id));
    }

}

