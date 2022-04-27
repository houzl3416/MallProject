package com.project.mall.product.service;

import com.project.mall.product.entity.PmsAttrGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 属性分组(PmsAttrGroup)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsAttrGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    PmsAttrGroup queryById(Long attrGroupId);

    /**
     * 分页查询
     *
     * @param pmsAttrGroup 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsAttrGroup> queryByPage(PmsAttrGroup pmsAttrGroup, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    PmsAttrGroup insert(PmsAttrGroup pmsAttrGroup);

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    PmsAttrGroup update(PmsAttrGroup pmsAttrGroup);

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrGroupId);

}
