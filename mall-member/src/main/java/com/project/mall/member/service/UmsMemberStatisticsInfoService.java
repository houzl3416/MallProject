package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMemberStatisticsInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberStatisticsInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberStatisticsInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMemberStatisticsInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMemberStatisticsInfo> queryByPage(UmsMemberStatisticsInfo umsMemberStatisticsInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    UmsMemberStatisticsInfo insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    UmsMemberStatisticsInfo update(UmsMemberStatisticsInfo umsMemberStatisticsInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
