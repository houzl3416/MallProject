package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSkuFullReduction;
import com.project.mall.coupon.service.SmsSkuFullReductionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品满减信息(SmsSkuFullReduction)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSkuFullReduction")
public class SmsSkuFullReductionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSkuFullReductionService smsSkuFullReductionService;

    /**
     * 分页查询
     *
     * @param smsSkuFullReduction 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSkuFullReduction>> queryByPage(SmsSkuFullReduction smsSkuFullReduction, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSkuFullReductionService.queryByPage(smsSkuFullReduction, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSkuFullReduction> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSkuFullReductionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSkuFullReduction> add(SmsSkuFullReduction smsSkuFullReduction) {
        return ResponseEntity.ok(this.smsSkuFullReductionService.insert(smsSkuFullReduction));
    }

    /**
     * 编辑数据
     *
     * @param smsSkuFullReduction 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSkuFullReduction> edit(SmsSkuFullReduction smsSkuFullReduction) {
        return ResponseEntity.ok(this.smsSkuFullReductionService.update(smsSkuFullReduction));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSkuFullReductionService.deleteById(id));
    }

}

