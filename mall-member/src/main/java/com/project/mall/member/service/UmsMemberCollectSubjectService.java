package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMemberCollectSubject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberCollectSubjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberCollectSubject queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMemberCollectSubject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMemberCollectSubject> queryByPage(UmsMemberCollectSubject umsMemberCollectSubject, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSubject insert(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSubject update(UmsMemberCollectSubject umsMemberCollectSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
