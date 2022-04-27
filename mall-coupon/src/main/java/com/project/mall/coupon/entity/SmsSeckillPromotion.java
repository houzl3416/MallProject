package com.project.mall.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 秒杀活动(SmsSeckillPromotion)实体类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public class SmsSeckillPromotion implements Serializable {
    private static final long serialVersionUID = 832309447899157009L;
    /**
     * id
     */
    private Long id;
    /**
     * 活动标题
     */
    private String title;
    /**
     * 开始日期
     */
    private Date startTime;
    /**
     * 结束日期
     */
    private Date endTime;
    /**
     * 上下线状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}

