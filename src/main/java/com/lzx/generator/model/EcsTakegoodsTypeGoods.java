package com.lzx.generator.model;

public class EcsTakegoodsTypeGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_type_goods.tg_type_id
     *
     * @mbg.generated
     */
    private Integer tgTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_type_goods.goods_ids
     *
     * @mbg.generated
     */
    private String goodsIds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_type_goods.tg_type_id
     *
     * @return the value of ecs_takegoods_type_goods.tg_type_id
     *
     * @mbg.generated
     */
    public Integer getTgTypeId() {
        return tgTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_type_goods.tg_type_id
     *
     * @param tgTypeId the value for ecs_takegoods_type_goods.tg_type_id
     *
     * @mbg.generated
     */
    public void setTgTypeId(Integer tgTypeId) {
        this.tgTypeId = tgTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_type_goods.goods_ids
     *
     * @return the value of ecs_takegoods_type_goods.goods_ids
     *
     * @mbg.generated
     */
    public String getGoodsIds() {
        return goodsIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_type_goods.goods_ids
     *
     * @param goodsIds the value for ecs_takegoods_type_goods.goods_ids
     *
     * @mbg.generated
     */
    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds == null ? null : goodsIds.trim();
    }
}