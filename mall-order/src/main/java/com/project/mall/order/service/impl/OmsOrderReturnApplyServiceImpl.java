package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsOrderReturnApply;
import com.project.mall.order.dao.OmsOrderReturnApplyDao;
import com.project.mall.order.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:54
 */
@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Resource
    private OmsOrderReturnApplyDao omsOrderReturnApplyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply queryById(Long id) {
        return this.omsOrderReturnApplyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsOrderReturnApply 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsOrderReturnApply> queryByPage(OmsOrderReturnApply omsOrderReturnApply, PageRequest pageRequest) {
        long total = this.omsOrderReturnApplyDao.count(omsOrderReturnApply);
        return new PageImpl<>(this.omsOrderReturnApplyDao.queryAllByLimit(omsOrderReturnApply, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply insert(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyDao.insert(omsOrderReturnApply);
        return omsOrderReturnApply;
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply update(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyDao.update(omsOrderReturnApply);
        return this.queryById(omsOrderReturnApply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderReturnApplyDao.deleteById(id) > 0;
    }
}
