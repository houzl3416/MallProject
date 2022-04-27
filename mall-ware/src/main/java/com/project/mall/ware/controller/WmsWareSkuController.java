package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsWareSku;
import com.project.mall.ware.service.WmsWareSkuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品库存(WmsWareSku)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@RestController
@RequestMapping("wmsWareSku")
public class WmsWareSkuController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareSkuService wmsWareSkuService;

    /**
     * 分页查询
     *
     * @param wmsWareSku 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsWareSku>> queryByPage(WmsWareSku wmsWareSku, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsWareSkuService.queryByPage(wmsWareSku, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsWareSku> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsWareSkuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareSku 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsWareSku> add(WmsWareSku wmsWareSku) {
        return ResponseEntity.ok(this.wmsWareSkuService.insert(wmsWareSku));
    }

    /**
     * 编辑数据
     *
     * @param wmsWareSku 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsWareSku> edit(WmsWareSku wmsWareSku) {
        return ResponseEntity.ok(this.wmsWareSkuService.update(wmsWareSku));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsWareSkuService.deleteById(id));
    }

}

