package com.project.mall.product.service;

import com.project.mall.product.entity.PmsCommentReplay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsCommentReplayService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsCommentReplay queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsCommentReplay 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsCommentReplay> queryByPage(PmsCommentReplay pmsCommentReplay, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay);

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay update(PmsCommentReplay pmsCommentReplay);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
