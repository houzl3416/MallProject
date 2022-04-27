package com.project.mall.product.service;

import com.project.mall.product.entity.PmsAttr;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品属性(PmsAttr)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsAttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    PmsAttr queryById(Long attrId);

    /**
     * 分页查询
     *
     * @param pmsAttr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsAttr> queryByPage(PmsAttr pmsAttr, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    PmsAttr insert(PmsAttr pmsAttr);

    /**
     * 修改数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    PmsAttr update(PmsAttr pmsAttr);

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrId);

}
