package com.lzx.generator.model;

public class EcsGoodsCatKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_cat.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_cat.cat_id
     *
     * @mbg.generated
     */
    private Short catId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_cat.goods_id
     *
     * @return the value of ecs_goods_cat.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_cat.goods_id
     *
     * @param goodsId the value for ecs_goods_cat.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_cat.cat_id
     *
     * @return the value of ecs_goods_cat.cat_id
     *
     * @mbg.generated
     */
    public Short getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_cat.cat_id
     *
     * @param catId the value for ecs_goods_cat.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Short catId) {
        this.catId = catId;
    }
}