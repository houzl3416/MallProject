package com.project.mall.order.service;

import com.project.mall.order.entity.OmsOrderReturnApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderReturnApplyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderReturnApply queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsOrderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsOrderReturnApply> queryByPage(OmsOrderReturnApply omsOrderReturnApply, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    OmsOrderReturnApply insert(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * 修改数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    OmsOrderReturnApply update(OmsOrderReturnApply omsOrderReturnApply);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
