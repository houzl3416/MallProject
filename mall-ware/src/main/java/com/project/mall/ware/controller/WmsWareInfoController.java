package com.project.mall.ware.controller;

import com.project.mall.ware.entity.WmsWareInfo;
import com.project.mall.ware.service.WmsWareInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 仓库信息(WmsWareInfo)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@RestController
@RequestMapping("wmsWareInfo")
public class WmsWareInfoController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareInfoService wmsWareInfoService;

    /**
     * 分页查询
     *
     * @param wmsWareInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<WmsWareInfo>> queryByPage(WmsWareInfo wmsWareInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.wmsWareInfoService.queryByPage(wmsWareInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<WmsWareInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.wmsWareInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<WmsWareInfo> add(WmsWareInfo wmsWareInfo) {
        return ResponseEntity.ok(this.wmsWareInfoService.insert(wmsWareInfo));
    }

    /**
     * 编辑数据
     *
     * @param wmsWareInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<WmsWareInfo> edit(WmsWareInfo wmsWareInfo) {
        return ResponseEntity.ok(this.wmsWareInfoService.update(wmsWareInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.wmsWareInfoService.deleteById(id));
    }

}

