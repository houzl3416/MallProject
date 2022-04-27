package com.project.mall.member.controller;

import com.project.mall.member.entity.UmsMemberStatisticsInfo;
import com.project.mall.member.service.UmsMemberStatisticsInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@RestController
@RequestMapping("umsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * 分页查询
     *
     * @param umsMemberStatisticsInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UmsMemberStatisticsInfo>> queryByPage(UmsMemberStatisticsInfo umsMemberStatisticsInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.umsMemberStatisticsInfoService.queryByPage(umsMemberStatisticsInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UmsMemberStatisticsInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.umsMemberStatisticsInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UmsMemberStatisticsInfo> add(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return ResponseEntity.ok(this.umsMemberStatisticsInfoService.insert(umsMemberStatisticsInfo));
    }

    /**
     * 编辑数据
     *
     * @param umsMemberStatisticsInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UmsMemberStatisticsInfo> edit(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return ResponseEntity.ok(this.umsMemberStatisticsInfoService.update(umsMemberStatisticsInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.umsMemberStatisticsInfoService.deleteById(id));
    }

}

