package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsHomeSubject;
import com.project.mall.coupon.service.SmsHomeSubjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsHomeSubject")
public class SmsHomeSubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 分页查询
     *
     * @param smsHomeSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsHomeSubject>> queryByPage(SmsHomeSubject smsHomeSubject, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsHomeSubjectService.queryByPage(smsHomeSubject, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsHomeSubject> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsHomeSubjectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsHomeSubject> add(SmsHomeSubject smsHomeSubject) {
        return ResponseEntity.ok(this.smsHomeSubjectService.insert(smsHomeSubject));
    }

    /**
     * 编辑数据
     *
     * @param smsHomeSubject 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsHomeSubject> edit(SmsHomeSubject smsHomeSubject) {
        return ResponseEntity.ok(this.smsHomeSubjectService.update(smsHomeSubject));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsHomeSubjectService.deleteById(id));
    }

}

