package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSkuInfo;
import com.project.mall.product.service.PmsSkuInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku信息(PmsSkuInfo)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSkuInfo")
public class PmsSkuInfoController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSkuInfoService pmsSkuInfoService;

    /**
     * 分页查询
     *
     * @param pmsSkuInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSkuInfo>> queryByPage(PmsSkuInfo pmsSkuInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSkuInfoService.queryByPage(pmsSkuInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSkuInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSkuInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSkuInfo> add(PmsSkuInfo pmsSkuInfo) {
        return ResponseEntity.ok(this.pmsSkuInfoService.insert(pmsSkuInfo));
    }

    /**
     * 编辑数据
     *
     * @param pmsSkuInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSkuInfo> edit(PmsSkuInfo pmsSkuInfo) {
        return ResponseEntity.ok(this.pmsSkuInfoService.update(pmsSkuInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSkuInfoService.deleteById(id));
    }

}

