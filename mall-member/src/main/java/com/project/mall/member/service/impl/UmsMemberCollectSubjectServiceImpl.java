package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberCollectSubject;
import com.project.mall.member.dao.UmsMemberCollectSubjectDao;
import com.project.mall.member.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService {
    @Resource
    private UmsMemberCollectSubjectDao umsMemberCollectSubjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject queryById(Long id) {
        return this.umsMemberCollectSubjectDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberCollectSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberCollectSubject> queryByPage(UmsMemberCollectSubject umsMemberCollectSubject, PageRequest pageRequest) {
        long total = this.umsMemberCollectSubjectDao.count(umsMemberCollectSubject);
        return new PageImpl<>(this.umsMemberCollectSubjectDao.queryAllByLimit(umsMemberCollectSubject, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject insert(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectDao.insert(umsMemberCollectSubject);
        return umsMemberCollectSubject;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject update(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectDao.update(umsMemberCollectSubject);
        return this.queryById(umsMemberCollectSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSubjectDao.deleteById(id) > 0;
    }
}
