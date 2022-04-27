package com.project.mall.order.service;

import com.project.mall.order.entity.OmsPaymentInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 支付信息表(OmsPaymentInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsPaymentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsPaymentInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsPaymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsPaymentInfo> queryByPage(OmsPaymentInfo omsPaymentInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    OmsPaymentInfo insert(OmsPaymentInfo omsPaymentInfo);

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    OmsPaymentInfo update(OmsPaymentInfo omsPaymentInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
