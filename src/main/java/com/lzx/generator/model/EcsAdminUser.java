package com.lzx.generator.model;

public class EcsAdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.user_id
     *
     * @mbg.generated
     */
    private Short userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.ec_salt
     *
     * @mbg.generated
     */
    private String ecSalt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.add_time
     *
     * @mbg.generated
     */
    private Integer addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.last_login
     *
     * @mbg.generated
     */
    private Integer lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.last_ip
     *
     * @mbg.generated
     */
    private String lastIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.lang_type
     *
     * @mbg.generated
     */
    private String langType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.agency_id
     *
     * @mbg.generated
     */
    private Short agencyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.suppliers_id
     *
     * @mbg.generated
     */
    private Short suppliersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_user.role_id
     *
     * @mbg.generated
     */
    private Short roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.user_id
     *
     * @return the value of ecs_admin_user.user_id
     *
     * @mbg.generated
     */
    public Short getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.user_id
     *
     * @param userId the value for ecs_admin_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.user_name
     *
     * @return the value of ecs_admin_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.user_name
     *
     * @param userName the value for ecs_admin_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.email
     *
     * @return the value of ecs_admin_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.email
     *
     * @param email the value for ecs_admin_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.password
     *
     * @return the value of ecs_admin_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.password
     *
     * @param password the value for ecs_admin_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.ec_salt
     *
     * @return the value of ecs_admin_user.ec_salt
     *
     * @mbg.generated
     */
    public String getEcSalt() {
        return ecSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.ec_salt
     *
     * @param ecSalt the value for ecs_admin_user.ec_salt
     *
     * @mbg.generated
     */
    public void setEcSalt(String ecSalt) {
        this.ecSalt = ecSalt == null ? null : ecSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.add_time
     *
     * @return the value of ecs_admin_user.add_time
     *
     * @mbg.generated
     */
    public Integer getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.add_time
     *
     * @param addTime the value for ecs_admin_user.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.last_login
     *
     * @return the value of ecs_admin_user.last_login
     *
     * @mbg.generated
     */
    public Integer getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.last_login
     *
     * @param lastLogin the value for ecs_admin_user.last_login
     *
     * @mbg.generated
     */
    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.last_ip
     *
     * @return the value of ecs_admin_user.last_ip
     *
     * @mbg.generated
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.last_ip
     *
     * @param lastIp the value for ecs_admin_user.last_ip
     *
     * @mbg.generated
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.lang_type
     *
     * @return the value of ecs_admin_user.lang_type
     *
     * @mbg.generated
     */
    public String getLangType() {
        return langType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.lang_type
     *
     * @param langType the value for ecs_admin_user.lang_type
     *
     * @mbg.generated
     */
    public void setLangType(String langType) {
        this.langType = langType == null ? null : langType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.agency_id
     *
     * @return the value of ecs_admin_user.agency_id
     *
     * @mbg.generated
     */
    public Short getAgencyId() {
        return agencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.agency_id
     *
     * @param agencyId the value for ecs_admin_user.agency_id
     *
     * @mbg.generated
     */
    public void setAgencyId(Short agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.suppliers_id
     *
     * @return the value of ecs_admin_user.suppliers_id
     *
     * @mbg.generated
     */
    public Short getSuppliersId() {
        return suppliersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.suppliers_id
     *
     * @param suppliersId the value for ecs_admin_user.suppliers_id
     *
     * @mbg.generated
     */
    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_user.role_id
     *
     * @return the value of ecs_admin_user.role_id
     *
     * @mbg.generated
     */
    public Short getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_user.role_id
     *
     * @param roleId the value for ecs_admin_user.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }
}