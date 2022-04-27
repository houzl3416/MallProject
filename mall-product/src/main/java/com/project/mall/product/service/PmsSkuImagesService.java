package com.project.mall.product.service;

import com.project.mall.product.entity.PmsSkuImages;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * sku图片(PmsSkuImages)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSkuImagesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSkuImages queryById(Long id);

    /**
     * 分页查询
     *
     * @param pmsSkuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsSkuImages> queryByPage(PmsSkuImages pmsSkuImages, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    PmsSkuImages insert(PmsSkuImages pmsSkuImages);

    /**
     * 修改数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    PmsSkuImages update(PmsSkuImages pmsSkuImages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
