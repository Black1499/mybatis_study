package generator.model;

public class EcsGroupGoodsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_group_goods.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_group_goods.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_group_goods.admin_id
     *
     * @mbg.generated
     */
    private Byte adminId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_group_goods.parent_id
     *
     * @return the value of ecs_group_goods.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_group_goods.parent_id
     *
     * @param parentId the value for ecs_group_goods.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_group_goods.goods_id
     *
     * @return the value of ecs_group_goods.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_group_goods.goods_id
     *
     * @param goodsId the value for ecs_group_goods.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_group_goods.admin_id
     *
     * @return the value of ecs_group_goods.admin_id
     *
     * @mbg.generated
     */
    public Byte getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_group_goods.admin_id
     *
     * @param adminId the value for ecs_group_goods.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}