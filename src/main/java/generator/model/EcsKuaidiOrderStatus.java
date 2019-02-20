package generator.model;

public class EcsKuaidiOrderStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.rec_id
     *
     * @mbg.generated
     */
    private Short recId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.status_id
     *
     * @mbg.generated
     */
    private byte[] statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.status_name
     *
     * @mbg.generated
     */
    private String statusName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.status_type
     *
     * @mbg.generated
     */
    private byte[] statusType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.status_display
     *
     * @mbg.generated
     */
    private byte[] statusDisplay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_kuaidi_order_status.status_time
     *
     * @mbg.generated
     */
    private Integer statusTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.rec_id
     *
     * @return the value of ecs_kuaidi_order_status.rec_id
     *
     * @mbg.generated
     */
    public Short getRecId() {
        return recId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.rec_id
     *
     * @param recId the value for ecs_kuaidi_order_status.rec_id
     *
     * @mbg.generated
     */
    public void setRecId(Short recId) {
        this.recId = recId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.order_id
     *
     * @return the value of ecs_kuaidi_order_status.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.order_id
     *
     * @param orderId the value for ecs_kuaidi_order_status.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.status_id
     *
     * @return the value of ecs_kuaidi_order_status.status_id
     *
     * @mbg.generated
     */
    public byte[] getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.status_id
     *
     * @param statusId the value for ecs_kuaidi_order_status.status_id
     *
     * @mbg.generated
     */
    public void setStatusId(byte[] statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.status_name
     *
     * @return the value of ecs_kuaidi_order_status.status_name
     *
     * @mbg.generated
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.status_name
     *
     * @param statusName the value for ecs_kuaidi_order_status.status_name
     *
     * @mbg.generated
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.status_type
     *
     * @return the value of ecs_kuaidi_order_status.status_type
     *
     * @mbg.generated
     */
    public byte[] getStatusType() {
        return statusType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.status_type
     *
     * @param statusType the value for ecs_kuaidi_order_status.status_type
     *
     * @mbg.generated
     */
    public void setStatusType(byte[] statusType) {
        this.statusType = statusType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.status_display
     *
     * @return the value of ecs_kuaidi_order_status.status_display
     *
     * @mbg.generated
     */
    public byte[] getStatusDisplay() {
        return statusDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.status_display
     *
     * @param statusDisplay the value for ecs_kuaidi_order_status.status_display
     *
     * @mbg.generated
     */
    public void setStatusDisplay(byte[] statusDisplay) {
        this.statusDisplay = statusDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_kuaidi_order_status.status_time
     *
     * @return the value of ecs_kuaidi_order_status.status_time
     *
     * @mbg.generated
     */
    public Integer getStatusTime() {
        return statusTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_kuaidi_order_status.status_time
     *
     * @param statusTime the value for ecs_kuaidi_order_status.status_time
     *
     * @mbg.generated
     */
    public void setStatusTime(Integer statusTime) {
        this.statusTime = statusTime;
    }
}