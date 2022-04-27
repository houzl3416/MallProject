package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsOrderOperateHistory;
import com.project.mall.order.dao.OmsOrderOperateHistoryDao;
import com.project.mall.order.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {
    @Resource
    private OmsOrderOperateHistoryDao omsOrderOperateHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory queryById(Long id) {
        return this.omsOrderOperateHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsOrderOperateHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsOrderOperateHistory> queryByPage(OmsOrderOperateHistory omsOrderOperateHistory, PageRequest pageRequest) {
        long total = this.omsOrderOperateHistoryDao.count(omsOrderOperateHistory);
        return new PageImpl<>(this.omsOrderOperateHistoryDao.queryAllByLimit(omsOrderOperateHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory insert(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryDao.insert(omsOrderOperateHistory);
        return omsOrderOperateHistory;
    }

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory update(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryDao.update(omsOrderOperateHistory);
        return this.queryById(omsOrderOperateHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderOperateHistoryDao.deleteById(id) > 0;
    }
}
