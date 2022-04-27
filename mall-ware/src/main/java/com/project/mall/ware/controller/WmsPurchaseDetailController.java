package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsPurchaseDetail;
import com.project.mall.ware.service.WmsPurchaseDetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WmsPurchaseDetail)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@RestController
@RequestMapping("wmsPurchaseDetail")
public class WmsPurchaseDetailController {
    /**
     * 服务对象
     */
    @Resource
    private WmsPurchaseDetailService wmsPurchaseDetailService;

    /**
     * 分页查询
     *
     * @param wmsPurchaseDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsPurchaseDetail>> queryByPage(WmsPurchaseDetail wmsPurchaseDetail, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsPurchaseDetailService.queryByPage(wmsPurchaseDetail, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsPurchaseDetail> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsPurchaseDetailService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsPurchaseDetail 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsPurchaseDetail> add(WmsPurchaseDetail wmsPurchaseDetail) {
        return ResponseEntity.ok(this.wmsPurchaseDetailService.insert(wmsPurchaseDetail));
    }

    /**
     * 编辑数据
     *
     * @param wmsPurchaseDetail 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsPurchaseDetail> edit(WmsPurchaseDetail wmsPurchaseDetail) {
        return ResponseEntity.ok(this.wmsPurchaseDetailService.update(wmsPurchaseDetail));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsPurchaseDetailService.deleteById(id));
    }

}

