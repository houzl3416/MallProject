package com.project.mall.product.service;

import com.project.mall.product.entity.PmsAttrAttrgroupRelation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsAttrAttrgroupRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsAttrAttrgroupRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsAttrAttrgroupRelation> queryByPage(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
