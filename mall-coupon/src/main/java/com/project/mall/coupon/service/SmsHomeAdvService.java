package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsHomeAdv;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 首页轮播广告(SmsHomeAdv)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsHomeAdvService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeAdv queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsHomeAdv 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsHomeAdv> queryByPage(SmsHomeAdv smsHomeAdv, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    SmsHomeAdv insert(SmsHomeAdv smsHomeAdv);

    /**
     * 修改数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    SmsHomeAdv update(SmsHomeAdv smsHomeAdv);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
