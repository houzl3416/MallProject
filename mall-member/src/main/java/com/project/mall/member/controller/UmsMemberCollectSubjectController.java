package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberCollectSubject;
import com.project.mall.member.service.UmsMemberCollectSubjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberCollectSubject")
public class UmsMemberCollectSubjectController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 分页查询
     *
     * @param umsMemberCollectSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberCollectSubject>> queryByPage(UmsMemberCollectSubject umsMemberCollectSubject, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberCollectSubjectService.queryByPage(umsMemberCollectSubject, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberCollectSubject> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberCollectSubjectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberCollectSubject> add(UmsMemberCollectSubject umsMemberCollectSubject) {
        return ResponseEntity.ok(this.umsMemberCollectSubjectService.insert(umsMemberCollectSubject));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberCollectSubject 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberCollectSubject> edit(UmsMemberCollectSubject umsMemberCollectSubject) {
        return ResponseEntity.ok(this.umsMemberCollectSubjectService.update(umsMemberCollectSubject));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberCollectSubjectService.deleteById(id));
    }

}

