package com.lzx.generator.model;

public class EcsPostman {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.postman_id
     *
     * @mbg.generated
     */
    private Short postmanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.postman_name
     *
     * @mbg.generated
     */
    private String postmanName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.region_id
     *
     * @mbg.generated
     */
    private Integer regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.postman_id
     *
     * @return the value of ecs_postman.postman_id
     *
     * @mbg.generated
     */
    public Short getPostmanId() {
        return postmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.postman_id
     *
     * @param postmanId the value for ecs_postman.postman_id
     *
     * @mbg.generated
     */
    public void setPostmanId(Short postmanId) {
        this.postmanId = postmanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.postman_name
     *
     * @return the value of ecs_postman.postman_name
     *
     * @mbg.generated
     */
    public String getPostmanName() {
        return postmanName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.postman_name
     *
     * @param postmanName the value for ecs_postman.postman_name
     *
     * @mbg.generated
     */
    public void setPostmanName(String postmanName) {
        this.postmanName = postmanName == null ? null : postmanName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.region_id
     *
     * @return the value of ecs_postman.region_id
     *
     * @mbg.generated
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.region_id
     *
     * @param regionId the value for ecs_postman.region_id
     *
     * @mbg.generated
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.mobile
     *
     * @return the value of ecs_postman.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.mobile
     *
     * @param mobile the value for ecs_postman.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}