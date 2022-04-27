package com.project.mall.ware.service;

import com.project.mall.ware.entity.WmsPurchase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 采购信息(WmsPurchase)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:48
 */
public interface WmsPurchaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsPurchase queryById(Long id);

    /**
     * 分页查询
     *
     * @param wmsPurchase 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<WmsPurchase> queryByPage(WmsPurchase wmsPurchase, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    WmsPurchase insert(WmsPurchase wmsPurchase);

    /**
     * 修改数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    WmsPurchase update(WmsPurchase wmsPurchase);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
