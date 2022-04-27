package com.project.mall.coupon.entity;

import java.io.Serializable;

/**
 * 商品满减信息(SmsSkuFullReduction)实体类
 *
 * @author makejava
 * @since 2022-04-27 17:02:04
 */
public class SmsSkuFullReduction implements Serializable {
    private static final long serialVersionUID = -54791236052745272L;
    /**
     * id
     */
    private Long id;
    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满多少
     */
    private Double fullPrice;
    /**
     * 减多少
     */
    private Double reducePrice;
    /**
     * 是否参与其他优惠
     */
    private Integer addOther;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Double getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(Double reducePrice) {
        this.reducePrice = reducePrice;
    }

    public Integer getAddOther() {
        return addOther;
    }

    public void setAddOther(Integer addOther) {
        this.addOther = addOther;
    }

}

