package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMemberLoginLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberLoginLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberLoginLog queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMemberLoginLog 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMemberLoginLog> queryByPage(UmsMemberLoginLog umsMemberLoginLog, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    UmsMemberLoginLog insert(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * 修改数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    UmsMemberLoginLog update(UmsMemberLoginLog umsMemberLoginLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
