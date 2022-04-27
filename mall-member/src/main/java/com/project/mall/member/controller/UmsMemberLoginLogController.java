package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberLoginLog;
import com.project.mall.member.service.UmsMemberLoginLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员登录记录(UmsMemberLoginLog)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberLoginLog")
public class UmsMemberLoginLogController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 分页查询
     *
     * @param umsMemberLoginLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberLoginLog>> queryByPage(UmsMemberLoginLog umsMemberLoginLog, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberLoginLogService.queryByPage(umsMemberLoginLog, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberLoginLog> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberLoginLogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberLoginLog> add(UmsMemberLoginLog umsMemberLoginLog) {
        return ResponseEntity.ok(this.umsMemberLoginLogService.insert(umsMemberLoginLog));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberLoginLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberLoginLog> edit(UmsMemberLoginLog umsMemberLoginLog) {
        return ResponseEntity.ok(this.umsMemberLoginLogService.update(umsMemberLoginLog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberLoginLogService.deleteById(id));
    }

}

