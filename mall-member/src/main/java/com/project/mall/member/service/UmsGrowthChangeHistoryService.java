package com.project.mall.member.service;

import com.project.mall.member.entity.UmsGrowthChangeHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsGrowthChangeHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsGrowthChangeHistory queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsGrowthChangeHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsGrowthChangeHistory> queryByPage(UmsGrowthChangeHistory umsGrowthChangeHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
