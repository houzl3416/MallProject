package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsGrowthChangeHistory;
import com.project.mall.member.dao.UmsGrowthChangeHistoryDao;
import com.project.mall.member.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {
    @Resource
    private UmsGrowthChangeHistoryDao umsGrowthChangeHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory queryById(Long id) {
        return this.umsGrowthChangeHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsGrowthChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsGrowthChangeHistory> queryByPage(UmsGrowthChangeHistory umsGrowthChangeHistory, PageRequest pageRequest) {
        long total = this.umsGrowthChangeHistoryDao.count(umsGrowthChangeHistory);
        return new PageImpl<>(this.umsGrowthChangeHistoryDao.queryAllByLimit(umsGrowthChangeHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryDao.insert(umsGrowthChangeHistory);
        return umsGrowthChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryDao.update(umsGrowthChangeHistory);
        return this.queryById(umsGrowthChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsGrowthChangeHistoryDao.deleteById(id) > 0;
    }
}
