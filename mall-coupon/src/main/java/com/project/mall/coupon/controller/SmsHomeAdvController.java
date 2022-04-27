package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsHomeAdv;
import com.project.mall.coupon.service.SmsHomeAdvService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页轮播广告(SmsHomeAdv)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsHomeAdv")
public class SmsHomeAdvController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeAdvService smsHomeAdvService;

    /**
     * 分页查询
     *
     * @param smsHomeAdv 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsHomeAdv>> queryByPage(SmsHomeAdv smsHomeAdv, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsHomeAdvService.queryByPage(smsHomeAdv, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsHomeAdv> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsHomeAdvService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsHomeAdv> add(SmsHomeAdv smsHomeAdv) {
        return ResponseEntity.ok(this.smsHomeAdvService.insert(smsHomeAdv));
    }

    /**
     * 编辑数据
     *
     * @param smsHomeAdv 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsHomeAdv> edit(SmsHomeAdv smsHomeAdv) {
        return ResponseEntity.ok(this.smsHomeAdvService.update(smsHomeAdv));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsHomeAdvService.deleteById(id));
    }

}

