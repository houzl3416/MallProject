package com.project.mall.member.service;

import com.project.mall.member.entity.UmsMemberCollectSpu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberCollectSpuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberCollectSpu queryById(Long id);

    /**
     * 分页查询
     *
     * @param umsMemberCollectSpu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UmsMemberCollectSpu> queryByPage(UmsMemberCollectSpu umsMemberCollectSpu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSpu insert(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    UmsMemberCollectSpu update(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
