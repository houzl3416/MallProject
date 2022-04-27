package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberLevel;
import com.project.mall.member.dao.UmsMemberLevelDao;
import com.project.mall.member.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员等级(UmsMemberLevel)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Resource
    private UmsMemberLevelDao umsMemberLevelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel queryById(Long id) {
        return this.umsMemberLevelDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberLevel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberLevel> queryByPage(UmsMemberLevel umsMemberLevel, PageRequest pageRequest) {
        long total = this.umsMemberLevelDao.count(umsMemberLevel);
        return new PageImpl<>(this.umsMemberLevelDao.queryAllByLimit(umsMemberLevel, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel insert(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelDao.insert(umsMemberLevel);
        return umsMemberLevel;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel update(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelDao.update(umsMemberLevel);
        return this.queryById(umsMemberLevel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLevelDao.deleteById(id) > 0;
    }
}
