package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberLevel;
import com.project.mall.member.service.UmsMemberLevelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员等级(UmsMemberLevel)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberLevel")
public class UmsMemberLevelController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 分页查询
     *
     * @param umsMemberLevel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberLevel>> queryByPage(UmsMemberLevel umsMemberLevel, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberLevelService.queryByPage(umsMemberLevel, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberLevel> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberLevelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberLevel> add(UmsMemberLevel umsMemberLevel) {
        return ResponseEntity.ok(this.umsMemberLevelService.insert(umsMemberLevel));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberLevel 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberLevel> edit(UmsMemberLevel umsMemberLevel) {
        return ResponseEntity.ok(this.umsMemberLevelService.update(umsMemberLevel));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberLevelService.deleteById(id));
    }

}

