package com.project.mall.coupon.dao;

import com.project.mall.coupon.entity.SmsHomeSubject;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public interface SmsHomeSubjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubject queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param smsHomeSubject 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SmsHomeSubject> queryAllByLimit(SmsHomeSubject smsHomeSubject, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param smsHomeSubject 查询条件
     * @return 总行数
     */
    long count(SmsHomeSubject smsHomeSubject);

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 影响行数
     */
    int insert(SmsHomeSubject smsHomeSubject);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsHomeSubject> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SmsHomeSubject> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SmsHomeSubject> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SmsHomeSubject> entities);

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 影响行数
     */
    int update(SmsHomeSubject smsHomeSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

