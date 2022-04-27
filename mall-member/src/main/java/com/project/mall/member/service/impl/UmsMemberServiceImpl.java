package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMember;
import com.project.mall.member.dao.UmsMemberDao;
import com.project.mall.member.service.UmsMemberService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl implements UmsMemberService {
    @Resource
    private UmsMemberDao umsMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMember queryById(Long id) {
        return this.umsMemberDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMember 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMember> queryByPage(UmsMember umsMember, PageRequest pageRequest) {
        long total = this.umsMemberDao.count(umsMember);
        return new PageImpl<>(this.umsMemberDao.queryAllByLimit(umsMember, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember insert(UmsMember umsMember) {
        this.umsMemberDao.insert(umsMember);
        return umsMember;
    }

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember update(UmsMember umsMember) {
        this.umsMemberDao.update(umsMember);
        return this.queryById(umsMember.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberDao.deleteById(id) > 0;
    }
}
