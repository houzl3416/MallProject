package com.project.mall.order.service;

import com.project.mall.order.entity.OmsOrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单项信息(OmsOrderItem)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderItem queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsOrderItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsOrderItem> queryByPage(OmsOrderItem omsOrderItem, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    OmsOrderItem insert(OmsOrderItem omsOrderItem);

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    OmsOrderItem update(OmsOrderItem omsOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
