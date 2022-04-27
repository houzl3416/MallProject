package com.project.mall.product.controller;

import com.project.mall.product.entity.PmsSpuComment;
import com.project.mall.product.service.PmsSpuCommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品评价(PmsSpuComment)表控制层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@RestController
@RequestMapping("pmsSpuComment")
public class PmsSpuCommentController {
    /**
     * 服务对象
     */
    @Resource
    private PmsSpuCommentService pmsSpuCommentService;

    /**
     * 分页查询
     *
     * @param pmsSpuComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PmsSpuComment>> queryByPage(PmsSpuComment pmsSpuComment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pmsSpuCommentService.queryByPage(pmsSpuComment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PmsSpuComment> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.pmsSpuCommentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PmsSpuComment> add(PmsSpuComment pmsSpuComment) {
        return ResponseEntity.ok(this.pmsSpuCommentService.insert(pmsSpuComment));
    }

    /**
     * 编辑数据
     *
     * @param pmsSpuComment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PmsSpuComment> edit(PmsSpuComment pmsSpuComment) {
        return ResponseEntity.ok(this.pmsSpuCommentService.update(pmsSpuComment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.pmsSpuCommentService.deleteById(id));
    }

}

