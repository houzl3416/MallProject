package com.project.mall.product.dao;

import com.project.mall.product.entity.PmsAttrGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 属性分组(PmsAttrGroup)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public interface PmsAttrGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    PmsAttrGroup queryById(Long attrGroupId);

    /**
     * 查询指定行数据
     *
     * @param pmsAttrGroup 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<PmsAttrGroup> queryAllByLimit(PmsAttrGroup pmsAttrGroup, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param pmsAttrGroup 查询条件
     * @return 总行数
     */
    long count(PmsAttrGroup pmsAttrGroup);

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 影响行数
     */
    int insert(PmsAttrGroup pmsAttrGroup);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttrGroup> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PmsAttrGroup> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PmsAttrGroup> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PmsAttrGroup> entities);

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 影响行数
     */
    int update(PmsAttrGroup pmsAttrGroup);

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 影响行数
     */
    int deleteById(Long attrGroupId);

}

