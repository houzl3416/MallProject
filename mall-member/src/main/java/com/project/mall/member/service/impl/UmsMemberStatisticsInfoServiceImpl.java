package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberStatisticsInfo;
import com.project.mall.member.dao.UmsMemberStatisticsInfoDao;
import com.project.mall.member.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService {
    @Resource
    private UmsMemberStatisticsInfoDao umsMemberStatisticsInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo queryById(Long id) {
        return this.umsMemberStatisticsInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberStatisticsInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberStatisticsInfo> queryByPage(UmsMemberStatisticsInfo umsMemberStatisticsInfo, PageRequest pageRequest) {
        long total = this.umsMemberStatisticsInfoDao.count(umsMemberStatisticsInfo);
        return new PageImpl<>(this.umsMemberStatisticsInfoDao.queryAllByLimit(umsMemberStatisticsInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoDao.insert(umsMemberStatisticsInfo);
        return umsMemberStatisticsInfo;
    }

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo update(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoDao.update(umsMemberStatisticsInfo);
        return this.queryById(umsMemberStatisticsInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberStatisticsInfoDao.deleteById(id) > 0;
    }
}
