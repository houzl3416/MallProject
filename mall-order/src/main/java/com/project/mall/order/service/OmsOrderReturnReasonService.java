package com.project.mall.order.service;

import com.project.mall.order.entity.OmsOrderReturnReason;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 退货原因(OmsOrderReturnReason)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderReturnReasonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderReturnReason queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsOrderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsOrderReturnReason> queryByPage(OmsOrderReturnReason omsOrderReturnReason, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    OmsOrderReturnReason insert(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    OmsOrderReturnReason update(OmsOrderReturnReason omsOrderReturnReason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
