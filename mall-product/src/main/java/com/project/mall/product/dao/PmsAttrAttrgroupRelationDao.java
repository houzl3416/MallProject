package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsAttrAttrgroupRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsAttrAttrgroupRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsAttrAttrgroupRelation queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param pmsAttrAttrgroupRelation 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsAttrAttrgroupRelation> queryAllByLimit(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsAttrAttrgroupRelation 查询条件
     * @return 总行数
     */
    long count(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 影响行数
     */
    int insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttrAttrgroupRelation> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsAttrAttrgroupRelation> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttrAttrgroupRelation> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsAttrAttrgroupRelation> entities);

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 影响行数
     */
    int update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

