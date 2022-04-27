package com.project.mall.member.dao;

import com.project.mall.member.entity.UmsMemberCollectSpu;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsMemberCollectSpuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberCollectSpu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param umsMemberCollectSpu 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UmsMemberCollectSpu> queryAllByLimit(UmsMemberCollectSpu umsMemberCollectSpu, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param umsMemberCollectSpu 查询条件
     * @return 总行数
     */
    long count(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 影响行数
     */
    int insert(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsMemberCollectSpu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UmsMemberCollectSpu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsMemberCollectSpu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UmsMemberCollectSpu> entities);

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 影响行数
     */
    int update(UmsMemberCollectSpu umsMemberCollectSpu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

