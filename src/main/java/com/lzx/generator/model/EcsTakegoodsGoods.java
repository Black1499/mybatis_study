package com.lzx.generator.model;

public class EcsTakegoodsGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    private Integer tgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    private String goodsIds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_goods.tg_id
     *
     * @return the value of ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    public Integer getTgId() {
        return tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_goods.tg_id
     *
     * @param tgId the value for ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    public void setTgId(Integer tgId) {
        this.tgId = tgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_goods.goods_ids
     *
     * @return the value of ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    public String getGoodsIds() {
        return goodsIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_goods.goods_ids
     *
     * @param goodsIds the value for ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds == null ? null : goodsIds.trim();
    }
}