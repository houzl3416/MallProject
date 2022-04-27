package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsPaymentInfo;
import com.project.mall.order.dao.OmsPaymentInfoDao;
import com.project.mall.order.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 支付信息表(OmsPaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService {
    @Resource
    private OmsPaymentInfoDao omsPaymentInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo queryById(Long id) {
        return this.omsPaymentInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsPaymentInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsPaymentInfo> queryByPage(OmsPaymentInfo omsPaymentInfo, PageRequest pageRequest) {
        long total = this.omsPaymentInfoDao.count(omsPaymentInfo);
        return new PageImpl<>(this.omsPaymentInfoDao.queryAllByLimit(omsPaymentInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo insert(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoDao.insert(omsPaymentInfo);
        return omsPaymentInfo;
    }

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo update(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoDao.update(omsPaymentInfo);
        return this.queryById(omsPaymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsPaymentInfoDao.deleteById(id) > 0;
    }
}
