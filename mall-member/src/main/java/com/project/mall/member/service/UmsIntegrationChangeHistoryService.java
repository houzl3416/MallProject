package com.project.mall.member.service;

import com.project.mall.member.entity.UmsIntegrationChangeHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsIntegrationChangeHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsIntegrationChangeHistory queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsIntegrationChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsIntegrationChangeHistory> queryByPage(UmsIntegrationChangeHistory umsIntegrationChangeHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    UmsIntegrationChangeHistory insert(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    UmsIntegrationChangeHistory update(UmsIntegrationChangeHistory umsIntegrationChangeHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
