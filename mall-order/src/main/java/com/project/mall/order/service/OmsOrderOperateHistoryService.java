package com.project.mall.order.service;

import com.project.mall.order.entity.OmsOrderOperateHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
public interface OmsOrderOperateHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderOperateHistory queryById(Long id);

    /**
     * 分页查询
     *
     * @param omsOrderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OmsOrderOperateHistory> queryByPage(OmsOrderOperateHistory omsOrderOperateHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    OmsOrderOperateHistory insert(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    OmsOrderOperateHistory update(OmsOrderOperateHistory omsOrderOperateHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
