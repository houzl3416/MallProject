package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsWareOrderTaskDetail;
import com.project.mall.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@RestController
@RequestMapping("wmsWareOrderTaskDetail")
public class WmsWareOrderTaskDetailController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareOrderTaskDetailService wmsWareOrderTaskDetailService;

    /**
     * 分页查询
     *
     * @param wmsWareOrderTaskDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsWareOrderTaskDetail>> queryByPage(WmsWareOrderTaskDetail wmsWareOrderTaskDetail, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsWareOrderTaskDetailService.queryByPage(wmsWareOrderTaskDetail, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsWareOrderTaskDetail> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsWareOrderTaskDetailService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsWareOrderTaskDetail> add(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        return ResponseEntity.ok(this.wmsWareOrderTaskDetailService.insert(wmsWareOrderTaskDetail));
    }

    /**
     * 编辑数据
     *
     * @param wmsWareOrderTaskDetail 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsWareOrderTaskDetail> edit(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        return ResponseEntity.ok(this.wmsWareOrderTaskDetailService.update(wmsWareOrderTaskDetail));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsWareOrderTaskDetailService.deleteById(id));
    }

}

