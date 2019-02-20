package com.lzx.generator.model;

public class EcsBrand {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.brand_id
     *
     * @mbg.generated
     */
    private Short brandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.brand_name
     *
     * @mbg.generated
     */
    private String brandName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.brand_logo
     *
     * @mbg.generated
     */
    private String brandLogo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.brand_img
     *
     * @mbg.generated
     */
    private String brandImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.site_url
     *
     * @mbg.generated
     */
    private String siteUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.sort_order
     *
     * @mbg.generated
     */
    private Byte sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_brand.is_show
     *
     * @mbg.generated
     */
    private byte[] isShow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.brand_id
     *
     * @return the value of ecs_brand.brand_id
     *
     * @mbg.generated
     */
    public Short getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.brand_id
     *
     * @param brandId the value for ecs_brand.brand_id
     *
     * @mbg.generated
     */
    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.brand_name
     *
     * @return the value of ecs_brand.brand_name
     *
     * @mbg.generated
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.brand_name
     *
     * @param brandName the value for ecs_brand.brand_name
     *
     * @mbg.generated
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.brand_logo
     *
     * @return the value of ecs_brand.brand_logo
     *
     * @mbg.generated
     */
    public String getBrandLogo() {
        return brandLogo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.brand_logo
     *
     * @param brandLogo the value for ecs_brand.brand_logo
     *
     * @mbg.generated
     */
    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.brand_img
     *
     * @return the value of ecs_brand.brand_img
     *
     * @mbg.generated
     */
    public String getBrandImg() {
        return brandImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.brand_img
     *
     * @param brandImg the value for ecs_brand.brand_img
     *
     * @mbg.generated
     */
    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg == null ? null : brandImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.site_url
     *
     * @return the value of ecs_brand.site_url
     *
     * @mbg.generated
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.site_url
     *
     * @param siteUrl the value for ecs_brand.site_url
     *
     * @mbg.generated
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.sort_order
     *
     * @return the value of ecs_brand.sort_order
     *
     * @mbg.generated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.sort_order
     *
     * @param sortOrder the value for ecs_brand.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_brand.is_show
     *
     * @return the value of ecs_brand.is_show
     *
     * @mbg.generated
     */
    public byte[] getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_brand.is_show
     *
     * @param isShow the value for ecs_brand.is_show
     *
     * @mbg.generated
     */
    public void setIsShow(byte[] isShow) {
        this.isShow = isShow;
    }
}