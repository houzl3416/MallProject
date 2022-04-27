package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMember;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员(UmsMember)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMember queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMember 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMember> queryByPage(UmsMember umsMember, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    UmsMember insert(UmsMember umsMember);

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    UmsMember update(UmsMember umsMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
