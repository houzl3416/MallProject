package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsSpuInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * spu信息(PmsSpuInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsSpuInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param pmsSpuInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsSpuInfo> queryAllByLimit(PmsSpuInfo pmsSpuInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsSpuInfo 查询条件
     * @return 总行数
     */
    long count(PmsSpuInfo pmsSpuInfo);

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 影响行数
     */
    int insert(PmsSpuInfo pmsSpuInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSpuInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsSpuInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsSpuInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsSpuInfo> entities);

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 影响行数
     */
    int update(PmsSpuInfo pmsSpuInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

