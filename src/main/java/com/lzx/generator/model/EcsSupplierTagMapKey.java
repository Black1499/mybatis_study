package com.lzx.generator.model;

public class EcsSupplierTagMapKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_tag_map.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_tag_map.supplier_id
     *
     * @mbg.generated
     */
    private Integer supplierId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_tag_map.tag_id
     *
     * @return the value of ecs_supplier_tag_map.tag_id
     *
     * @mbg.generated
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_tag_map.tag_id
     *
     * @param tagId the value for ecs_supplier_tag_map.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_tag_map.supplier_id
     *
     * @return the value of ecs_supplier_tag_map.supplier_id
     *
     * @mbg.generated
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_tag_map.supplier_id
     *
     * @param supplierId the value for ecs_supplier_tag_map.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}