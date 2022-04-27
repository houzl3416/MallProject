package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsWareInfo;
import com.project.mall.ware.dao.WmsWareInfoDao;
import com.project.mall.ware.service.WmsWareInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 仓库信息(WmsWareInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl implements WmsWareInfoService {
    @Resource
    private WmsWareInfoDao wmsWareInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareInfo queryById(Long id) {
        return this.wmsWareInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsWareInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsWareInfo> queryByPage(WmsWareInfo wmsWareInfo, PageRequest pageRequest) {
        long total = this.wmsWareInfoDao.count(wmsWareInfo);
        return new PageImpl<>(this.wmsWareInfoDao.queryAllByLimit(wmsWareInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo insert(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoDao.insert(wmsWareInfo);
        return wmsWareInfo;
    }

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo update(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoDao.update(wmsWareInfo);
        return this.queryById(wmsWareInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareInfoDao.deleteById(id) > 0;
    }
}
