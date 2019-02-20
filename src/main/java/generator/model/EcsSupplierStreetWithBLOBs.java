package generator.model;

public class EcsSupplierStreetWithBLOBs extends EcsSupplierStreet {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_street.supplier_desc
     *
     * @mbg.generated
     */
    private String supplierDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_street.supplier_notice
     *
     * @mbg.generated
     */
    private String supplierNotice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_street.supplier_desc
     *
     * @return the value of ecs_supplier_street.supplier_desc
     *
     * @mbg.generated
     */
    public String getSupplierDesc() {
        return supplierDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_street.supplier_desc
     *
     * @param supplierDesc the value for ecs_supplier_street.supplier_desc
     *
     * @mbg.generated
     */
    public void setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc == null ? null : supplierDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_street.supplier_notice
     *
     * @return the value of ecs_supplier_street.supplier_notice
     *
     * @mbg.generated
     */
    public String getSupplierNotice() {
        return supplierNotice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_street.supplier_notice
     *
     * @param supplierNotice the value for ecs_supplier_street.supplier_notice
     *
     * @mbg.generated
     */
    public void setSupplierNotice(String supplierNotice) {
        this.supplierNotice = supplierNotice == null ? null : supplierNotice.trim();
    }
}