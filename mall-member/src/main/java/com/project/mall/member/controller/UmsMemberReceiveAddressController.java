package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberReceiveAddress;
import com.project.mall.member.service.UmsMemberReceiveAddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    /**
     * 分页查询
     *
     * @param umsMemberReceiveAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberReceiveAddress>> queryByPage(UmsMemberReceiveAddress umsMemberReceiveAddress, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberReceiveAddressService.queryByPage(umsMemberReceiveAddress, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberReceiveAddress> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberReceiveAddressService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberReceiveAddress 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberReceiveAddress> add(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return ResponseEntity.ok(this.umsMemberReceiveAddressService.insert(umsMemberReceiveAddress));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberReceiveAddress 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberReceiveAddress> edit(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return ResponseEntity.ok(this.umsMemberReceiveAddressService.update(umsMemberReceiveAddress));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberReceiveAddressService.deleteById(id));
    }

}

