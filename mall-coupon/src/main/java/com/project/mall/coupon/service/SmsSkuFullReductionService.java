package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSkuFullReduction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSkuFullReductionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSkuFullReduction queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSkuFullReduction 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSkuFullReduction> queryByPage(SmsSkuFullReduction smsSkuFullReduction, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    SmsSkuFullReduction insert(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    SmsSkuFullReduction update(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
