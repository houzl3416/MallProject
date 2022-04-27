package com.project.mall.order.controller;

import com.project.mall.order.entity.OmsPaymentInfo;
import com.project.mall.order.service.OmsPaymentInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付信息表(OmsPaymentInfo)表控制层
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
@RestController
@RequestMapping("omsPaymentInfo")
public class OmsPaymentInfoController {
    /**
     * 服务对象
     */
    @Resource
    private OmsPaymentInfoService omsPaymentInfoService;

    /**
     * 分页查询
     *
     * @param omsPaymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OmsPaymentInfo>> queryByPage(OmsPaymentInfo omsPaymentInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.omsPaymentInfoService.queryByPage(omsPaymentInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OmsPaymentInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.omsPaymentInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OmsPaymentInfo> add(OmsPaymentInfo omsPaymentInfo) {
        return ResponseEntity.ok(this.omsPaymentInfoService.insert(omsPaymentInfo));
    }

    /**
     * 编辑数据
     *
     * @param omsPaymentInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OmsPaymentInfo> edit(OmsPaymentInfo omsPaymentInfo) {
        return ResponseEntity.ok(this.omsPaymentInfoService.update(omsPaymentInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.omsPaymentInfoService.deleteById(id));
    }

}

