package com.project.mall.member.dao;

import com.project.mall.member.entity.UmsGrowthChangeHistory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:03:04
 */
public interface UmsGrowthChangeHistoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsGrowthChangeHistory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param umsGrowthChangeHistory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<UmsGrowthChangeHistory> queryAllByLimit(UmsGrowthChangeHistory umsGrowthChangeHistory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param umsGrowthChangeHistory 查询条件
     * @return 总行数
     */
    long count(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 影响行数
     */
    int insert(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsGrowthChangeHistory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UmsGrowthChangeHistory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UmsGrowthChangeHistory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UmsGrowthChangeHistory> entities);

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 影响行数
     */
    int update(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

