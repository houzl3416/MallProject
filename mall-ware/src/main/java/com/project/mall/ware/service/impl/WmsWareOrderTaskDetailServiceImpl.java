package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsWareOrderTaskDetail;
import com.project.mall.ware.dao.WmsWareOrderTaskDetailDao;
import com.project.mall.ware.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService {
    @Resource
    private WmsWareOrderTaskDetailDao wmsWareOrderTaskDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail queryById(Long id) {
        return this.wmsWareOrderTaskDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsWareOrderTaskDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsWareOrderTaskDetail> queryByPage(WmsWareOrderTaskDetail wmsWareOrderTaskDetail, PageRequest pageRequest) {
        long total = this.wmsWareOrderTaskDetailDao.count(wmsWareOrderTaskDetail);
        return new PageImpl<>(this.wmsWareOrderTaskDetailDao.queryAllByLimit(wmsWareOrderTaskDetail, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailDao.insert(wmsWareOrderTaskDetail);
        return wmsWareOrderTaskDetail;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailDao.update(wmsWareOrderTaskDetail);
        return this.queryById(wmsWareOrderTaskDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskDetailDao.deleteById(id) > 0;
    }
}
