package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSkuSaleAttrValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSkuSaleAttrValueService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSkuSaleAttrValue queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsSkuSaleAttrValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSkuSaleAttrValue> queryByPage(PmsSkuSaleAttrValue pmsSkuSaleAttrValue, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
