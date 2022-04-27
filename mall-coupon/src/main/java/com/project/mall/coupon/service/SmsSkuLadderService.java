package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsSkuLadder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSkuLadderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSkuLadder queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsSkuLadder 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsSkuLadder> queryByPage(SmsSkuLadder smsSkuLadder, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    SmsSkuLadder insert(SmsSkuLadder smsSkuLadder);

    /**
     * 修改数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    SmsSkuLadder update(SmsSkuLadder smsSkuLadder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
