package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSkuInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * sku信息(PmsSkuInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSkuInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    PmsSkuInfo queryById(Long skuId);

    /**
     * 分页查询
     *
     * @param pmsSkuInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSkuInfo> queryByPage(PmsSkuInfo pmsSkuInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo);

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    PmsSkuInfo update(PmsSkuInfo pmsSkuInfo);

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long skuId);

}
