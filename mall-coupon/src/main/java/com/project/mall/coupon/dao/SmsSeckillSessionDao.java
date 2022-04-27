package com.project.mall.coupon.dao;

import com.project.mall.coupon.entity.SmsSeckillSession;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 秒杀活动场次(SmsSeckillSession)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsSeckillSessionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSession queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param smsSeckillSession 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SmsSeckillSession> queryAllByLimit(SmsSeckillSession smsSeckillSession, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param smsSeckillSession 查询条件
     * @return 总行数
     */
    long count(SmsSeckillSession smsSeckillSession);

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实例对象
     * @return 影响行数
     */
    int insert(SmsSeckillSession smsSeckillSession);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsSeckillSession> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SmsSeckillSession> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsSeckillSession> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SmsSeckillSession> entities);

    /**
     * 修改数据
     *
     * @param smsSeckillSession 实例对象
     * @return 影响行数
     */
    int update(SmsSeckillSession smsSeckillSession);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

