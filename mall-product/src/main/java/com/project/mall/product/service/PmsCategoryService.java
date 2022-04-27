package com.project.mall.product.service;

import com.project.mall.product.entity.PmsCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品三级分类(PmsCategory)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    PmsCategory queryById(Long catId);

    /**
     * 分页查询
     *
     * @param pmsCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsCategory> queryByPage(PmsCategory pmsCategory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory insert(PmsCategory pmsCategory);

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory update(PmsCategory pmsCategory);

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    boolean deleteById(Long catId);

}
