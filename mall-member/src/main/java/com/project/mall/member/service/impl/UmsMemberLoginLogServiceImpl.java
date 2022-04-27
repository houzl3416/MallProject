package com.project.mall.member.service.impl;

import com.project.mall.member.entity.UmsMemberLoginLog;
import com.project.mall.member.dao.UmsMemberLoginLogDao;
import com.project.mall.member.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {
    @Resource
    private UmsMemberLoginLogDao umsMemberLoginLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog queryById(Long id) {
        return this.umsMemberLoginLogDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param umsMemberLoginLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UmsMemberLoginLog> queryByPage(UmsMemberLoginLog umsMemberLoginLog, PageRequest pageRequest) {
        long total = this.umsMemberLoginLogDao.count(umsMemberLoginLog);
        return new PageImpl<>(this.umsMemberLoginLogDao.queryAllByLimit(umsMemberLoginLog, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog insert(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogDao.insert(umsMemberLoginLog);
        return umsMemberLoginLog;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog update(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogDao.update(umsMemberLoginLog);
        return this.queryById(umsMemberLoginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLoginLogDao.deleteById(id) > 0;
    }
}
