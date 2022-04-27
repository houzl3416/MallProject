package com.project.mall.coupon.controller;

import com.project.mall.coupon.entity.SmsSeckillSession;
import com.project.mall.coupon.service.SmsSeckillSessionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 秒杀活动场次(SmsSeckillSession)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@RestController
@RequestMapping("smsSeckillSession")
public class SmsSeckillSessionController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 分页查询
     *
     * @param smsSeckillSession 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SmsSeckillSession>> queryByPage(SmsSeckillSession smsSeckillSession, PageRequest pageRequest) {
        return ResponseEntity.ok(this.smsSeckillSessionService.queryByPage(smsSeckillSession, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SmsSeckillSession> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.smsSeckillSessionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SmsSeckillSession> add(SmsSeckillSession smsSeckillSession) {
        return ResponseEntity.ok(this.smsSeckillSessionService.insert(smsSeckillSession));
    }

    /**
     * 编辑数据
     *
     * @param smsSeckillSession 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SmsSeckillSession> edit(SmsSeckillSession smsSeckillSession) {
        return ResponseEntity.ok(this.smsSeckillSessionService.update(smsSeckillSession));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.smsSeckillSessionService.deleteById(id));
    }

}

