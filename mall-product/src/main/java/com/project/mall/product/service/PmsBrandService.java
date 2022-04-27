package com.project.mall.product.service;

import com.project.mall.product.entity.PmsBrand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 品牌(PmsBrand)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsBrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    PmsBrand queryById(Long brandId);

    /**
     * 分页查询
     *
     * @param pmsBrand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PmsBrand> queryByPage(PmsBrand pmsBrand, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    PmsBrand insert(PmsBrand pmsBrand);

    /**
     * 修改数据
     *
     * @param pmsBrand 实例对象
     * @return 实例对象
     */
    PmsBrand update(PmsBrand pmsBrand);

    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 是否成功
     */
    boolean deleteById(Long brandId);

}
