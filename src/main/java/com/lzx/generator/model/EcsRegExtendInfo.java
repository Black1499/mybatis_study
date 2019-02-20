package com.lzx.generator.model;

public class EcsRegExtendInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_reg_extend_info.Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_reg_extend_info.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_reg_extend_info.reg_field_id
     *
     * @mbg.generated
     */
    private Integer regFieldId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_reg_extend_info.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_reg_extend_info.Id
     *
     * @return the value of ecs_reg_extend_info.Id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_reg_extend_info.Id
     *
     * @param id the value for ecs_reg_extend_info.Id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_reg_extend_info.user_id
     *
     * @return the value of ecs_reg_extend_info.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_reg_extend_info.user_id
     *
     * @param userId the value for ecs_reg_extend_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_reg_extend_info.reg_field_id
     *
     * @return the value of ecs_reg_extend_info.reg_field_id
     *
     * @mbg.generated
     */
    public Integer getRegFieldId() {
        return regFieldId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_reg_extend_info.reg_field_id
     *
     * @param regFieldId the value for ecs_reg_extend_info.reg_field_id
     *
     * @mbg.generated
     */
    public void setRegFieldId(Integer regFieldId) {
        this.regFieldId = regFieldId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_reg_extend_info.content
     *
     * @return the value of ecs_reg_extend_info.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_reg_extend_info.content
     *
     * @param content the value for ecs_reg_extend_info.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}