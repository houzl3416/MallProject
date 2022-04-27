package com.project.mall.ware.service.impl;

import com.project.mall.ware.entity.WmsWareOrderTask;
import com.project.mall.ware.dao.WmsWareOrderTaskDao;
import com.project.mall.ware.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 库存工作单(WmsWareOrderTask)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:49
 */
@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService {
    @Resource
    private WmsWareOrderTaskDao wmsWareOrderTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask queryById(Long id) {
        return this.wmsWareOrderTaskDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param wmsWareOrderTask 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<WmsWareOrderTask> queryByPage(WmsWareOrderTask wmsWareOrderTask, PageRequest pageRequest) {
        long total = this.wmsWareOrderTaskDao.count(wmsWareOrderTask);
        return new PageImpl<>(this.wmsWareOrderTaskDao.queryAllByLimit(wmsWareOrderTask, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskDao.insert(wmsWareOrderTask);
        return wmsWareOrderTask;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskDao.update(wmsWareOrderTask);
        return this.queryById(wmsWareOrderTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskDao.deleteById(id) > 0;
    }
}
