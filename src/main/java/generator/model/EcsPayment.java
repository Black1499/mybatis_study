package generator.model;

public class EcsPayment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.pay_id
     *
     * @mbg.generated
     */
    private Byte payId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.pay_code
     *
     * @mbg.generated
     */
    private String payCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.pay_name
     *
     * @mbg.generated
     */
    private String payName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.pay_fee
     *
     * @mbg.generated
     */
    private String payFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.pay_order
     *
     * @mbg.generated
     */
    private Byte payOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.enabled
     *
     * @mbg.generated
     */
    private byte[] enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.is_cod
     *
     * @mbg.generated
     */
    private byte[] isCod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.is_online
     *
     * @mbg.generated
     */
    private byte[] isOnline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_payment.is_pickup
     *
     * @mbg.generated
     */
    private byte[] isPickup;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.pay_id
     *
     * @return the value of ecs_payment.pay_id
     *
     * @mbg.generated
     */
    public Byte getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.pay_id
     *
     * @param payId the value for ecs_payment.pay_id
     *
     * @mbg.generated
     */
    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.pay_code
     *
     * @return the value of ecs_payment.pay_code
     *
     * @mbg.generated
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.pay_code
     *
     * @param payCode the value for ecs_payment.pay_code
     *
     * @mbg.generated
     */
    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.pay_name
     *
     * @return the value of ecs_payment.pay_name
     *
     * @mbg.generated
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.pay_name
     *
     * @param payName the value for ecs_payment.pay_name
     *
     * @mbg.generated
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.pay_fee
     *
     * @return the value of ecs_payment.pay_fee
     *
     * @mbg.generated
     */
    public String getPayFee() {
        return payFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.pay_fee
     *
     * @param payFee the value for ecs_payment.pay_fee
     *
     * @mbg.generated
     */
    public void setPayFee(String payFee) {
        this.payFee = payFee == null ? null : payFee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.pay_order
     *
     * @return the value of ecs_payment.pay_order
     *
     * @mbg.generated
     */
    public Byte getPayOrder() {
        return payOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.pay_order
     *
     * @param payOrder the value for ecs_payment.pay_order
     *
     * @mbg.generated
     */
    public void setPayOrder(Byte payOrder) {
        this.payOrder = payOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.enabled
     *
     * @return the value of ecs_payment.enabled
     *
     * @mbg.generated
     */
    public byte[] getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.enabled
     *
     * @param enabled the value for ecs_payment.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(byte[] enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.is_cod
     *
     * @return the value of ecs_payment.is_cod
     *
     * @mbg.generated
     */
    public byte[] getIsCod() {
        return isCod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.is_cod
     *
     * @param isCod the value for ecs_payment.is_cod
     *
     * @mbg.generated
     */
    public void setIsCod(byte[] isCod) {
        this.isCod = isCod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.is_online
     *
     * @return the value of ecs_payment.is_online
     *
     * @mbg.generated
     */
    public byte[] getIsOnline() {
        return isOnline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.is_online
     *
     * @param isOnline the value for ecs_payment.is_online
     *
     * @mbg.generated
     */
    public void setIsOnline(byte[] isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_payment.is_pickup
     *
     * @return the value of ecs_payment.is_pickup
     *
     * @mbg.generated
     */
    public byte[] getIsPickup() {
        return isPickup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_payment.is_pickup
     *
     * @param isPickup the value for ecs_payment.is_pickup
     *
     * @mbg.generated
     */
    public void setIsPickup(byte[] isPickup) {
        this.isPickup = isPickup;
    }
}