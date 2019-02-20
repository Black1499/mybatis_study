package generator.model;

public class EcsGoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    private Short catId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    private String catName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    private byte[] enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    private String attrGroup;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.cat_id
     *
     * @return the value of ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    public Short getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.cat_id
     *
     * @param catId the value for ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Short catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.cat_name
     *
     * @return the value of ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    public String getCatName() {
        return catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.cat_name
     *
     * @param catName the value for ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.enabled
     *
     * @return the value of ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    public byte[] getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.enabled
     *
     * @param enabled the value for ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(byte[] enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.attr_group
     *
     * @return the value of ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    public String getAttrGroup() {
        return attrGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.attr_group
     *
     * @param attrGroup the value for ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    public void setAttrGroup(String attrGroup) {
        this.attrGroup = attrGroup == null ? null : attrGroup.trim();
    }
}