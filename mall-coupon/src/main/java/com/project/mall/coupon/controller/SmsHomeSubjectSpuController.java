package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsHomeSubjectSpu;
import com.project.mall.coupon.service.SmsHomeSubjectSpuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 专题商品(SmsHomeSubjectSpu)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsHomeSubjectSpu")
public class SmsHomeSubjectSpuController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectSpuService smsHomeSubjectSpuService;

    /**
     * 分页查询
     *
     * @param smsHomeSubjectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsHomeSubjectSpu>> queryByPage(SmsHomeSubjectSpu smsHomeSubjectSpu, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsHomeSubjectSpuService.queryByPage(smsHomeSubjectSpu, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsHomeSubjectSpu> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsHomeSubjectSpuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsHomeSubjectSpu> add(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return ResponseEntity.ok(this.smsHomeSubjectSpuService.insert(smsHomeSubjectSpu));
    }

    /**
     * 编辑数据
     *
     * @param smsHomeSubjectSpu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsHomeSubjectSpu> edit(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return ResponseEntity.ok(this.smsHomeSubjectSpuService.update(smsHomeSubjectSpu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsHomeSubjectSpuService.deleteById(id));
    }

}

