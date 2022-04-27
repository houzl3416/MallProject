package com.project.mall.coupon.service;

import com.project.mall.coupon.entity.SmsMemberPrice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 商品会员价格(SmsMemberPrice)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsMemberPriceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsMemberPrice queryById(Long id);

    /**
     * 分页查询
     *
     * @param smsMemberPrice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SmsMemberPrice> queryByPage(SmsMemberPrice smsMemberPrice, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    SmsMemberPrice insert(SmsMemberPrice smsMemberPrice);

    /**
     * 修改数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    SmsMemberPrice update(SmsMemberPrice smsMemberPrice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
