package com.project.mall.coupon.service.impl;

import com.project.mall.coupon.entity.SmsSeckillSession;
import com.project.mall.coupon.dao.SmsSeckillSessionDao;
import com.project.mall.coupon.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService {
    @Resource
    private SmsSeckillSessionDao smsSeckillSessionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession queryById(Long id) {
        return this.smsSeckillSessionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param smsSeckillSession 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SmsSeckillSession> queryByPage(SmsSeckillSession smsSeckillSession, PageRequest pageRequest) {
        long total = this.smsSeckillSessionDao.count(smsSeckillSession);
        return new PageImpl<>(this.smsSeckillSessionDao.queryAllByLimit(smsSeckillSession, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession insert(SmsSeckillSession smsSeckillSession) {
        this.smsSeckillSessionDao.insert(smsSeckillSession);
        return smsSeckillSession;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession update(SmsSeckillSession smsSeckillSession) {
        this.smsSeckillSessionDao.update(smsSeckillSession);
        return this.queryById(smsSeckillSession.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSessionDao.deleteById(id) > 0;
    }
}
