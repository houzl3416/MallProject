package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsIntegrationChangeHistory;
import com.project.mall.member.dao.UmsIntegrationChangeHistoryDao;
import com.project.mall.member.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {
    @Resource
    private UmsIntegrationChangeHistoryDao umsIntegrationChangeHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory queryById(Long id) {
        return this.umsIntegrationChangeHistoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsIntegrationChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsIntegrationChangeHistory> queryByPage(UmsIntegrationChangeHistory umsIntegrationChangeHistory, PageRequest pageRequest) {
        long total = this.umsIntegrationChangeHistoryDao.count(umsIntegrationChangeHistory);
        return new PageImpl<>(this.umsIntegrationChangeHistoryDao.queryAllByLimit(umsIntegrationChangeHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory insert(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryDao.insert(umsIntegrationChangeHistory);
        return umsIntegrationChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory update(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryDao.update(umsIntegrationChangeHistory);
        return this.queryById(umsIntegrationChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsIntegrationChangeHistoryDao.deleteById(id) > 0;
    }
}
