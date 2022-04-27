package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSpuComment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品评价(PmsSpuComment)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuComment queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsSpuComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSpuComment> queryByPage(PmsSpuComment pmsSpuComment, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment insert(PmsSpuComment pmsSpuComment);

    /**
     * 修改数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment update(PmsSpuComment pmsSpuComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
