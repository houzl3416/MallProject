package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSkuLadder;
import com.project.mall.coupon.service.SmsSkuLadderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品阶梯价格(SmsSkuLadder)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSkuLadder")
public class SmsSkuLadderController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSkuLadderService smsSkuLadderService;

    /**
     * 分页查询
     *
     * @param smsSkuLadder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSkuLadder>> queryByPage(SmsSkuLadder smsSkuLadder, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSkuLadderService.queryByPage(smsSkuLadder, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSkuLadder> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSkuLadderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSkuLadder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSkuLadder> add(SmsSkuLadder smsSkuLadder) {
        return ResponseEntity.ok(this.smsSkuLadderService.insert(smsSkuLadder));
    }

    /**
     * 编辑数据
     *
     * @param smsSkuLadder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSkuLadder> edit(SmsSkuLadder smsSkuLadder) {
        return ResponseEntity.ok(this.smsSkuLadderService.update(smsSkuLadder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSkuLadderService.deleteById(id));
    }

}

