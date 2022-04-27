package com.project.mall.order.service;

import com.project.mall.order.entity.OmsOrderSetting;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单配置信息(OmsOrderSetting)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsOrderSettingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderSetting queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsOrderSetting 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsOrderSetting> queryByPage(OmsOrderSetting omsOrderSetting, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting insert(OmsOrderSetting omsOrderSetting);

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting update(OmsOrderSetting omsOrderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
