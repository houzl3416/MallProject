package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsPurchaseDetail;
import com.project.mall.ware.dao.WmsPurchaseDetailDao;
import com.project.mall.ware.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (WmsPurchaseDetail)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService {
    @Resource
    private WmsPurchaseDetailDao wmsPurchaseDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail queryById(Long id) {
        return this.wmsPurchaseDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsPurchaseDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsPurchaseDetail> queryByPage(WmsPurchaseDetail wmsPurchaseDetail, PageRequest pageRequest) {
        long total = this.wmsPurchaseDetailDao.count(wmsPurchaseDetail);
        return new PageImpl<>(this.wmsPurchaseDetailDao.queryAllByLimit(wmsPurchaseDetail, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail insert(WmsPurchaseDetail wmsPurchaseDetail) {
        this.wmsPurchaseDetailDao.insert(wmsPurchaseDetail);
        return wmsPurchaseDetail;
    }

    /**
     * 修改数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail update(WmsPurchaseDetail wmsPurchaseDetail) {
        this.wmsPurchaseDetailDao.update(wmsPurchaseDetail);
        return this.queryById(wmsPurchaseDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsPurchaseDetailDao.deleteById(id) > 0;
    }
}
