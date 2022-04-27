package com.project.mall.product.service;

import com.project.mall.product.entity.PmsCategoryBrandRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 品牌分类关联(PmsCategoryBrandRelation)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsCategoryBrandRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsCategoryBrandRelation queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsCategoryBrandRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsCategoryBrandRelation> queryByPage(PmsCategoryBrandRelation pmsCategoryBrandRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsCategoryBrandRelation 实例对象
     * @return 实例对象
     */
    PmsCategoryBrandRelation insert(PmsCategoryBrandRelation pmsCategoryBrandRelation);

    /**
     * 修改数据
     *
     * @param pmsCategoryBrandRelation 实例对象
     * @return 实例对象
     */
    PmsCategoryBrandRelation update(PmsCategoryBrandRelation pmsCategoryBrandRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
