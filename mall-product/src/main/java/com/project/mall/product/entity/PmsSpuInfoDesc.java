package com.project.mall.product.entity;

import java.io.Serializable;

/**
 * spu信息介绍(PmsSpuInfoDesc)实体类
 *
 * @author makejava
 * @since 2022-04-27 16:47:41
 */
public class PmsSpuInfoDesc implements Serializable {
    private static final long serialVersionUID = -86717371039202404L;
    /**
     * 商品id
     */
    private Long spuId;
    /**
     * 商品介绍
     */
    private String decript;


    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

}

