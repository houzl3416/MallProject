package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsWareOrderTask;
import com.project.mall.ware.service.WmsWareOrderTaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTask)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@RestController
@RequestMapping("wmsWareOrderTask")
public class WmsWareOrderTaskController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 分页查询
     *
     * @param wmsWareOrderTask 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsWareOrderTask>> queryByPage(WmsWareOrderTask wmsWareOrderTask, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsWareOrderTaskService.queryByPage(wmsWareOrderTask, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsWareOrderTask> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsWareOrderTaskService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsWareOrderTask> add(WmsWareOrderTask wmsWareOrderTask) {
        return ResponseEntity.ok(this.wmsWareOrderTaskService.insert(wmsWareOrderTask));
    }

    /**
     * 编辑数据
     *
     * @param wmsWareOrderTask 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsWareOrderTask> edit(WmsWareOrderTask wmsWareOrderTask) {
        return ResponseEntity.ok(this.wmsWareOrderTaskService.update(wmsWareOrderTask));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsWareOrderTaskService.deleteById(id));
    }

}

