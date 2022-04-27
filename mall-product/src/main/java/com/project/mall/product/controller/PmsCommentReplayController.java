package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsCommentReplay;
import com.project.mall.product.service.PmsCommentReplayService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品评价回复关系(PmsCommentReplay)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsCommentReplay")
public class PmsCommentReplayController {
    /**
     * 服务对象
     */
    @Resource
    private PmsCommentReplayService pmsCommentReplayService;

    /**
     * 分页查询
     *
     * @param pmsCommentReplay 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsCommentReplay>> queryByPage(PmsCommentReplay pmsCommentReplay, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsCommentReplayService.queryByPage(pmsCommentReplay, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsCommentReplay> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsCommentReplayService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsCommentReplay> add(PmsCommentReplay pmsCommentReplay) {
        return ResponseEntity.ok(this.pmsCommentReplayService.insert(pmsCommentReplay));
    }

    /**
     * 编辑数据
     *
     * @param pmsCommentReplay 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsCommentReplay> edit(PmsCommentReplay pmsCommentReplay) {
        return ResponseEntity.ok(this.pmsCommentReplayService.update(pmsCommentReplay));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsCommentReplayService.deleteById(id));
    }

}

