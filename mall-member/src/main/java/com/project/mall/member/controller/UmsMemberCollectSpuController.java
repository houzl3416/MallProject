package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberCollectSpu;
import com.project.mall.member.service.UmsMemberCollectSpuService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberCollectSpu")
public class UmsMemberCollectSpuController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 分页查询
     *
     * @param umsMemberCollectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberCollectSpu>> queryByPage(UmsMemberCollectSpu umsMemberCollectSpu, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberCollectSpuService.queryByPage(umsMemberCollectSpu, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberCollectSpu> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberCollectSpuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberCollectSpu> add(UmsMemberCollectSpu umsMemberCollectSpu) {
        return ResponseEntity.ok(this.umsMemberCollectSpuService.insert(umsMemberCollectSpu));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberCollectSpu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberCollectSpu> edit(UmsMemberCollectSpu umsMemberCollectSpu) {
        return ResponseEntity.ok(this.umsMemberCollectSpuService.update(umsMemberCollectSpu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberCollectSpuService.deleteById(id));
    }

}

