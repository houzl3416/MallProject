package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsOrderReturnReason;
import com.project.mall.order.dao.OmsOrderReturnReasonDao;
import com.project.mall.order.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 退货原因(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {
    @Resource
    private OmsOrderReturnReasonDao omsOrderReturnReasonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason queryById(Long id) {
        return this.omsOrderReturnReasonDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsOrderReturnReason 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsOrderReturnReason> queryByPage(OmsOrderReturnReason omsOrderReturnReason, PageRequest pageRequest) {
        long total = this.omsOrderReturnReasonDao.count(omsOrderReturnReason);
        return new PageImpl<>(this.omsOrderReturnReasonDao.queryAllByLimit(omsOrderReturnReason, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason insert(OmsOrderReturnReason omsOrderReturnReason) {
        this.omsOrderReturnReasonDao.insert(omsOrderReturnReason);
        return omsOrderReturnReason;
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason update(OmsOrderReturnReason omsOrderReturnReason) {
        this.omsOrderReturnReasonDao.update(omsOrderReturnReason);
        return this.queryById(omsOrderReturnReason.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderReturnReasonDao.deleteById(id) > 0;
    }
}
