package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsCommentReplay;
import com.project.mall.product.dao.PmsCommentReplayDao;
import com.project.mall.product.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService {
    @Resource
    private PmsCommentReplayDao pmsCommentReplayDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay queryById(Long id) {
        return this.pmsCommentReplayDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsCommentReplay 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsCommentReplay> queryByPage(PmsCommentReplay pmsCommentReplay, PageRequest pageRequest) {
        long total = this.pmsCommentReplayDao.count(pmsCommentReplay);
        return new PageImpl<>(this.pmsCommentReplayDao.queryAllByLimit(pmsCommentReplay, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayDao.insert(pmsCommentReplay);
        return pmsCommentReplay;
    }

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay update(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayDao.update(pmsCommentReplay);
        return this.queryById(pmsCommentReplay.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsCommentReplayDao.deleteById(id) > 0;
    }
}
