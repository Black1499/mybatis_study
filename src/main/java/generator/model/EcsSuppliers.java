package generator.model;

public class EcsSuppliers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_suppliers.suppliers_id
     *
     * @mbg.generated
     */
    private Short suppliersId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_suppliers.suppliers_name
     *
     * @mbg.generated
     */
    private String suppliersName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_suppliers.is_check
     *
     * @mbg.generated
     */
    private byte[] isCheck;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_suppliers.suppliers_desc
     *
     * @mbg.generated
     */
    private String suppliersDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_suppliers.suppliers_id
     *
     * @return the value of ecs_suppliers.suppliers_id
     *
     * @mbg.generated
     */
    public Short getSuppliersId() {
        return suppliersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_suppliers.suppliers_id
     *
     * @param suppliersId the value for ecs_suppliers.suppliers_id
     *
     * @mbg.generated
     */
    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_suppliers.suppliers_name
     *
     * @return the value of ecs_suppliers.suppliers_name
     *
     * @mbg.generated
     */
    public String getSuppliersName() {
        return suppliersName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_suppliers.suppliers_name
     *
     * @param suppliersName the value for ecs_suppliers.suppliers_name
     *
     * @mbg.generated
     */
    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName == null ? null : suppliersName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_suppliers.is_check
     *
     * @return the value of ecs_suppliers.is_check
     *
     * @mbg.generated
     */
    public byte[] getIsCheck() {
        return isCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_suppliers.is_check
     *
     * @param isCheck the value for ecs_suppliers.is_check
     *
     * @mbg.generated
     */
    public void setIsCheck(byte[] isCheck) {
        this.isCheck = isCheck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_suppliers.suppliers_desc
     *
     * @return the value of ecs_suppliers.suppliers_desc
     *
     * @mbg.generated
     */
    public String getSuppliersDesc() {
        return suppliersDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_suppliers.suppliers_desc
     *
     * @param suppliersDesc the value for ecs_suppliers.suppliers_desc
     *
     * @mbg.generated
     */
    public void setSuppliersDesc(String suppliersDesc) {
        this.suppliersDesc = suppliersDesc == null ? null : suppliersDesc.trim();
    }
}