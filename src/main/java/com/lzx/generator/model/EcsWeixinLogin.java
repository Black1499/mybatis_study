package com.lzx.generator.model;

public class EcsWeixinLogin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.createtime
     *
     * @mbg.generated
     */
    private Integer createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.token
     *
     * @mbg.generated
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_login.value
     *
     * @mbg.generated
     */
    private Integer value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.id
     *
     * @return the value of ecs_weixin_login.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.id
     *
     * @param id the value for ecs_weixin_login.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.createtime
     *
     * @return the value of ecs_weixin_login.createtime
     *
     * @mbg.generated
     */
    public Integer getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.createtime
     *
     * @param createtime the value for ecs_weixin_login.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.uid
     *
     * @return the value of ecs_weixin_login.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.uid
     *
     * @param uid the value for ecs_weixin_login.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.token
     *
     * @return the value of ecs_weixin_login.token
     *
     * @mbg.generated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.token
     *
     * @param token the value for ecs_weixin_login.token
     *
     * @mbg.generated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.ip
     *
     * @return the value of ecs_weixin_login.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.ip
     *
     * @param ip the value for ecs_weixin_login.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_login.value
     *
     * @return the value of ecs_weixin_login.value
     *
     * @mbg.generated
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_login.value
     *
     * @param value the value for ecs_weixin_login.value
     *
     * @mbg.generated
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}