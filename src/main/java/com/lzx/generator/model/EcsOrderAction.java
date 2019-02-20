package com.lzx.generator.model;

public class EcsOrderAction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.action_id
     *
     * @mbg.generated
     */
    private Integer actionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.action_user
     *
     * @mbg.generated
     */
    private String actionUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.order_status
     *
     * @mbg.generated
     */
    private byte[] orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.shipping_status
     *
     * @mbg.generated
     */
    private byte[] shippingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.pay_status
     *
     * @mbg.generated
     */
    private byte[] payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.action_place
     *
     * @mbg.generated
     */
    private byte[] actionPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.action_note
     *
     * @mbg.generated
     */
    private String actionNote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_order_action.log_time
     *
     * @mbg.generated
     */
    private Integer logTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.action_id
     *
     * @return the value of ecs_order_action.action_id
     *
     * @mbg.generated
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.action_id
     *
     * @param actionId the value for ecs_order_action.action_id
     *
     * @mbg.generated
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.order_id
     *
     * @return the value of ecs_order_action.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.order_id
     *
     * @param orderId the value for ecs_order_action.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.action_user
     *
     * @return the value of ecs_order_action.action_user
     *
     * @mbg.generated
     */
    public String getActionUser() {
        return actionUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.action_user
     *
     * @param actionUser the value for ecs_order_action.action_user
     *
     * @mbg.generated
     */
    public void setActionUser(String actionUser) {
        this.actionUser = actionUser == null ? null : actionUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.order_status
     *
     * @return the value of ecs_order_action.order_status
     *
     * @mbg.generated
     */
    public byte[] getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.order_status
     *
     * @param orderStatus the value for ecs_order_action.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(byte[] orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.shipping_status
     *
     * @return the value of ecs_order_action.shipping_status
     *
     * @mbg.generated
     */
    public byte[] getShippingStatus() {
        return shippingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.shipping_status
     *
     * @param shippingStatus the value for ecs_order_action.shipping_status
     *
     * @mbg.generated
     */
    public void setShippingStatus(byte[] shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.pay_status
     *
     * @return the value of ecs_order_action.pay_status
     *
     * @mbg.generated
     */
    public byte[] getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.pay_status
     *
     * @param payStatus the value for ecs_order_action.pay_status
     *
     * @mbg.generated
     */
    public void setPayStatus(byte[] payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.action_place
     *
     * @return the value of ecs_order_action.action_place
     *
     * @mbg.generated
     */
    public byte[] getActionPlace() {
        return actionPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.action_place
     *
     * @param actionPlace the value for ecs_order_action.action_place
     *
     * @mbg.generated
     */
    public void setActionPlace(byte[] actionPlace) {
        this.actionPlace = actionPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.action_note
     *
     * @return the value of ecs_order_action.action_note
     *
     * @mbg.generated
     */
    public String getActionNote() {
        return actionNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.action_note
     *
     * @param actionNote the value for ecs_order_action.action_note
     *
     * @mbg.generated
     */
    public void setActionNote(String actionNote) {
        this.actionNote = actionNote == null ? null : actionNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_order_action.log_time
     *
     * @return the value of ecs_order_action.log_time
     *
     * @mbg.generated
     */
    public Integer getLogTime() {
        return logTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_order_action.log_time
     *
     * @param logTime the value for ecs_order_action.log_time
     *
     * @mbg.generated
     */
    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }
}