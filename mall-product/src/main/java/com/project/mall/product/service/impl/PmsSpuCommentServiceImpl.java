package com.project.mall.product.service.impl;

import com.project.mall.product.entity.PmsSpuComment;
import com.project.mall.product.dao.PmsSpuCommentDao;
import com.project.mall.product.service.PmsSpuCommentService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 商品评价(PmsSpuComment)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl implements PmsSpuCommentService {
    @Resource
    private PmsSpuCommentDao pmsSpuCommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuComment queryById(Long id) {
        return this.pmsSpuCommentDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pmsSpuComment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PmsSpuComment> queryByPage(PmsSpuComment pmsSpuComment, PageRequest pageRequest) {
        long total = this.pmsSpuCommentDao.count(pmsSpuComment);
        return new PageImpl<>(this.pmsSpuCommentDao.queryAllByLimit(pmsSpuComment, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuComment insert(PmsSpuComment pmsSpuComment) {
        this.pmsSpuCommentDao.insert(pmsSpuComment);
        return pmsSpuComment;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuComment update(PmsSpuComment pmsSpuComment) {
        this.pmsSpuCommentDao.update(pmsSpuComment);
        return this.queryById(pmsSpuComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuCommentDao.deleteById(id) > 0;
    }
}
