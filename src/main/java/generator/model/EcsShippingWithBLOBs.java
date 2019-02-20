package generator.model;

public class EcsShippingWithBLOBs extends EcsShipping {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shipping.shipping_print
     *
     * @mbg.generated
     */
    private String shippingPrint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shipping.config_lable
     *
     * @mbg.generated
     */
    private String configLable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shipping.shipping_print
     *
     * @return the value of ecs_shipping.shipping_print
     *
     * @mbg.generated
     */
    public String getShippingPrint() {
        return shippingPrint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shipping.shipping_print
     *
     * @param shippingPrint the value for ecs_shipping.shipping_print
     *
     * @mbg.generated
     */
    public void setShippingPrint(String shippingPrint) {
        this.shippingPrint = shippingPrint == null ? null : shippingPrint.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shipping.config_lable
     *
     * @return the value of ecs_shipping.config_lable
     *
     * @mbg.generated
     */
    public String getConfigLable() {
        return configLable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shipping.config_lable
     *
     * @param configLable the value for ecs_shipping.config_lable
     *
     * @mbg.generated
     */
    public void setConfigLable(String configLable) {
        this.configLable = configLable == null ? null : configLable.trim();
    }
}