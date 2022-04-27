package com.project.mall.coupon.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 优惠券领取历史记录(SmsCouponHistory)实体类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public class SmsCouponHistory implements Serializable {
    private static final long serialVersionUID = 785909096686502559L;
    /**
     * id
     */
    private Long id;
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 会员名字
     */
    private String memberNickName;
    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    private Integer getType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    private Integer useType;
    /**
     * 使用时间
     */
    private Date useTime;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 订单号
     */
    private Long orderSn;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

}

