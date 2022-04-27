package com.project.mall.order.service.impl;

import com.project.mall.order.entity.OmsRefundInfo;
import com.project.mall.order.dao.OmsRefundInfoDao;
import com.project.mall.order.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 退款信息(OmsRefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:07:55
 */
@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService {
    @Resource
    private OmsRefundInfoDao omsRefundInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo queryById(Long id) {
        return this.omsRefundInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param omsRefundInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OmsRefundInfo> queryByPage(OmsRefundInfo omsRefundInfo, PageRequest pageRequest) {
        long total = this.omsRefundInfoDao.count(omsRefundInfo);
        return new PageImpl<>(this.omsRefundInfoDao.queryAllByLimit(omsRefundInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo insert(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoDao.insert(omsRefundInfo);
        return omsRefundInfo;
    }

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo update(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoDao.update(omsRefundInfo);
        return this.queryById(omsRefundInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsRefundInfoDao.deleteById(id) > 0;
    }
}
