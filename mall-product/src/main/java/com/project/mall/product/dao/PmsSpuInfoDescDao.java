package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsSpuInfoDesc;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * spu信息介绍(PmsSpuInfoDesc)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuInfoDescDao {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    PmsSpuInfoDesc queryById(Long spuId);

    /**
     * 查询指定行数据
     *
     * @param pmsSpuInfoDesc 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsSpuInfoDesc> queryAllByLimit(PmsSpuInfoDesc pmsSpuInfoDesc, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsSpuInfoDesc 查询条件
     * @return 总行数
     */
    long count(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 影响行数
     */
    int insert(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSpuInfoDesc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsSpuInfoDesc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSpuInfoDesc> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsSpuInfoDesc> entities);

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 影响行数
     */
    int update(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 影响行数
     */
    int deleteById(Long spuId);

}

