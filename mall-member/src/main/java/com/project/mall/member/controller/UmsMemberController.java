package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMember;
import com.project.mall.member.service.UmsMemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 分页查询
     *
     * @param umsMember 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMember>> queryByPage(UmsMember umsMember, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberService.queryByPage(umsMember, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMember> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMember 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMember> add(UmsMember umsMember) {
        return ResponseEntity.ok(this.umsMemberService.insert(umsMember));
    }

    /**
     * 编辑数据
     *
     * @param umsMember 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMember> edit(UmsMember umsMember) {
        return ResponseEntity.ok(this.umsMemberService.update(umsMember));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberService.deleteById(id));
    }

}

