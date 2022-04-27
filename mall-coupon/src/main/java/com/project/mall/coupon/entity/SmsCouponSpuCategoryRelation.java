package com.project.mall.coupon.entity;

import java.io.Serializable;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)实体类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public class SmsCouponSpuCategoryRelation implements Serializable {
    private static final long serialVersionUID = 353450686573329080L;
    /**
     * id
     */
    private Long id;
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 产品分类id
     */
    private Long categoryId;
    /**
     * 产品分类名称
     */
    private String categoryName;


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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}

