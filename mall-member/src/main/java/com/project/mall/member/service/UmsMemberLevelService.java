package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMemberLevel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员等级(UmsMemberLevel)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberLevelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberLevel queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMemberLevel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMemberLevel> queryByPage(UmsMemberLevel umsMemberLevel, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    UmsMemberLevel insert(UmsMemberLevel umsMemberLevel);

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    UmsMemberLevel update(UmsMemberLevel umsMemberLevel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
