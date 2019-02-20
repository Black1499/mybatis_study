package com.lzx.generator.model;

import java.math.BigDecimal;

public class EcsPack {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_id
     *
     * @mbg.generated
     */
    private Byte packId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_name
     *
     * @mbg.generated
     */
    private String packName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_img
     *
     * @mbg.generated
     */
    private String packImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    private BigDecimal packFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.free_money
     *
     * @mbg.generated
     */
    private Short freeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    private String packDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_id
     *
     * @return the value of ecs_pack.pack_id
     *
     * @mbg.generated
     */
    public Byte getPackId() {
        return packId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_id
     *
     * @param packId the value for ecs_pack.pack_id
     *
     * @mbg.generated
     */
    public void setPackId(Byte packId) {
        this.packId = packId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_name
     *
     * @return the value of ecs_pack.pack_name
     *
     * @mbg.generated
     */
    public String getPackName() {
        return packName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_name
     *
     * @param packName the value for ecs_pack.pack_name
     *
     * @mbg.generated
     */
    public void setPackName(String packName) {
        this.packName = packName == null ? null : packName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_img
     *
     * @return the value of ecs_pack.pack_img
     *
     * @mbg.generated
     */
    public String getPackImg() {
        return packImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_img
     *
     * @param packImg the value for ecs_pack.pack_img
     *
     * @mbg.generated
     */
    public void setPackImg(String packImg) {
        this.packImg = packImg == null ? null : packImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_fee
     *
     * @return the value of ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    public BigDecimal getPackFee() {
        return packFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_fee
     *
     * @param packFee the value for ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.free_money
     *
     * @return the value of ecs_pack.free_money
     *
     * @mbg.generated
     */
    public Short getFreeMoney() {
        return freeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.free_money
     *
     * @param freeMoney the value for ecs_pack.free_money
     *
     * @mbg.generated
     */
    public void setFreeMoney(Short freeMoney) {
        this.freeMoney = freeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_desc
     *
     * @return the value of ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    public String getPackDesc() {
        return packDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_desc
     *
     * @param packDesc the value for ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    public void setPackDesc(String packDesc) {
        this.packDesc = packDesc == null ? null : packDesc.trim();
    }
}