package generator.model;

public class EcsGoodsWithBLOBs extends EcsGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods.goods_desc
     *
     * @mbg.generated
     */
    private String goodsDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods.supplier_status_txt
     *
     * @mbg.generated
     */
    private String supplierStatusTxt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods.goods_desc
     *
     * @return the value of ecs_goods.goods_desc
     *
     * @mbg.generated
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods.goods_desc
     *
     * @param goodsDesc the value for ecs_goods.goods_desc
     *
     * @mbg.generated
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods.supplier_status_txt
     *
     * @return the value of ecs_goods.supplier_status_txt
     *
     * @mbg.generated
     */
    public String getSupplierStatusTxt() {
        return supplierStatusTxt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods.supplier_status_txt
     *
     * @param supplierStatusTxt the value for ecs_goods.supplier_status_txt
     *
     * @mbg.generated
     */
    public void setSupplierStatusTxt(String supplierStatusTxt) {
        this.supplierStatusTxt = supplierStatusTxt == null ? null : supplierStatusTxt.trim();
    }
}