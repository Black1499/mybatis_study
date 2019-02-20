package com.lzx.generator.model;

import java.math.BigDecimal;

public class EcsPricecut {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    private Integer pricecutId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.status
     *
     * @mbg.generated
     */
    private byte[] status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.pricecut_id
     *
     * @return the value of ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    public Integer getPricecutId() {
        return pricecutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.pricecut_id
     *
     * @param pricecutId the value for ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    public void setPricecutId(Integer pricecutId) {
        this.pricecutId = pricecutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.goods_id
     *
     * @return the value of ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.goods_id
     *
     * @param goodsId the value for ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.price
     *
     * @return the value of ecs_pricecut.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.price
     *
     * @param price the value for ecs_pricecut.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.mobile
     *
     * @return the value of ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.mobile
     *
     * @param mobile the value for ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.email
     *
     * @return the value of ecs_pricecut.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.email
     *
     * @param email the value for ecs_pricecut.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.remark
     *
     * @return the value of ecs_pricecut.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.remark
     *
     * @param remark the value for ecs_pricecut.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.add_time
     *
     * @return the value of ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.add_time
     *
     * @param addTime the value for ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.status
     *
     * @return the value of ecs_pricecut.status
     *
     * @mbg.generated
     */
    public byte[] getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.status
     *
     * @param status the value for ecs_pricecut.status
     *
     * @mbg.generated
     */
    public void setStatus(byte[] status) {
        this.status = status;
    }
}