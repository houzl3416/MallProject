package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsOrderItem;
import com.project.mall.order.dao.OmsOrderItemDao;
import com.project.mall.order.service.OmsOrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单项信息(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl implements OmsOrderItemService {
    @Resource
    private OmsOrderItemDao omsOrderItemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderItem queryById(Long id) {
        return this.omsOrderItemDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsOrderItem 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsOrderItem> queryByPage(OmsOrderItem omsOrderItem, PageRequest pageRequest) {
        long total = this.omsOrderItemDao.count(omsOrderItem);
        return new PageImpl<>(this.omsOrderItemDao.queryAllByLimit(omsOrderItem, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem insert(OmsOrderItem omsOrderItem) {
        this.omsOrderItemDao.insert(omsOrderItem);
        return omsOrderItem;
    }

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem update(OmsOrderItem omsOrderItem) {
        this.omsOrderItemDao.update(omsOrderItem);
        return this.queryById(omsOrderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderItemDao.deleteById(id) > 0;
    }
}
