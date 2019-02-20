package generator.model;

public class EcsValuecardType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.type_id
     *
     * @mbg.generated
     */
    private Short typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.type_money
     *
     * @mbg.generated
     */
    private Integer typeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.use_start_date
     *
     * @mbg.generated
     */
    private Integer useStartDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.use_end_date
     *
     * @mbg.generated
     */
    private Integer useEndDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_valuecard_type.send_count
     *
     * @mbg.generated
     */
    private Integer sendCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.type_id
     *
     * @return the value of ecs_valuecard_type.type_id
     *
     * @mbg.generated
     */
    public Short getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.type_id
     *
     * @param typeId the value for ecs_valuecard_type.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.type_name
     *
     * @return the value of ecs_valuecard_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.type_name
     *
     * @param typeName the value for ecs_valuecard_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.type_money
     *
     * @return the value of ecs_valuecard_type.type_money
     *
     * @mbg.generated
     */
    public Integer getTypeMoney() {
        return typeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.type_money
     *
     * @param typeMoney the value for ecs_valuecard_type.type_money
     *
     * @mbg.generated
     */
    public void setTypeMoney(Integer typeMoney) {
        this.typeMoney = typeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.use_start_date
     *
     * @return the value of ecs_valuecard_type.use_start_date
     *
     * @mbg.generated
     */
    public Integer getUseStartDate() {
        return useStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.use_start_date
     *
     * @param useStartDate the value for ecs_valuecard_type.use_start_date
     *
     * @mbg.generated
     */
    public void setUseStartDate(Integer useStartDate) {
        this.useStartDate = useStartDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.use_end_date
     *
     * @return the value of ecs_valuecard_type.use_end_date
     *
     * @mbg.generated
     */
    public Integer getUseEndDate() {
        return useEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.use_end_date
     *
     * @param useEndDate the value for ecs_valuecard_type.use_end_date
     *
     * @mbg.generated
     */
    public void setUseEndDate(Integer useEndDate) {
        this.useEndDate = useEndDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_valuecard_type.send_count
     *
     * @return the value of ecs_valuecard_type.send_count
     *
     * @mbg.generated
     */
    public Integer getSendCount() {
        return sendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_valuecard_type.send_count
     *
     * @param sendCount the value for ecs_valuecard_type.send_count
     *
     * @mbg.generated
     */
    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }
}