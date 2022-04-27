package com.project.mall.order.service;

import com.project.mall.order.entity.OmsRefundInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 退款信息(OmsRefundInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
public interface OmsRefundInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsRefundInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsRefundInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsRefundInfo> queryByPage(OmsRefundInfo omsRefundInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    OmsRefundInfo insert(OmsRefundInfo omsRefundInfo);

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    OmsRefundInfo update(OmsRefundInfo omsRefundInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
