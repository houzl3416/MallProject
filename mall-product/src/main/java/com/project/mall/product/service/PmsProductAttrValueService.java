package com.project.mall.product.service;

import com.project.mall.product.entity.PmsProductAttrValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * spu属性值(PmsProductAttrValue)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsProductAttrValueService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttrValue queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsProductAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsProductAttrValue> queryByPage(PmsProductAttrValue pmsProductAttrValue, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    PmsProductAttrValue insert(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 修改数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    PmsProductAttrValue update(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
