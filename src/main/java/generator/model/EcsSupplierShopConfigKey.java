package generator.model;

public class EcsSupplierShopConfigKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_shop_config.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_shop_config.supplier_id
     *
     * @mbg.generated
     */
    private Integer supplierId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_shop_config.id
     *
     * @return the value of ecs_supplier_shop_config.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_shop_config.id
     *
     * @param id the value for ecs_supplier_shop_config.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_shop_config.supplier_id
     *
     * @return the value of ecs_supplier_shop_config.supplier_id
     *
     * @mbg.generated
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_shop_config.supplier_id
     *
     * @param supplierId the value for ecs_supplier_shop_config.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}