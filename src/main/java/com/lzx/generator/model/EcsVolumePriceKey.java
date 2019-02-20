package com.lzx.generator.model;

public class EcsVolumePriceKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_volume_price.price_type
     *
     * @mbg.generated
     */
    private byte[] priceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_volume_price.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_volume_price.volume_number
     *
     * @mbg.generated
     */
    private Short volumeNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_volume_price.price_type
     *
     * @return the value of ecs_volume_price.price_type
     *
     * @mbg.generated
     */
    public byte[] getPriceType() {
        return priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_volume_price.price_type
     *
     * @param priceType the value for ecs_volume_price.price_type
     *
     * @mbg.generated
     */
    public void setPriceType(byte[] priceType) {
        this.priceType = priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_volume_price.goods_id
     *
     * @return the value of ecs_volume_price.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_volume_price.goods_id
     *
     * @param goodsId the value for ecs_volume_price.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_volume_price.volume_number
     *
     * @return the value of ecs_volume_price.volume_number
     *
     * @mbg.generated
     */
    public Short getVolumeNumber() {
        return volumeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_volume_price.volume_number
     *
     * @param volumeNumber the value for ecs_volume_price.volume_number
     *
     * @mbg.generated
     */
    public void setVolumeNumber(Short volumeNumber) {
        this.volumeNumber = volumeNumber;
    }
}