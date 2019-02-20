package com.lzx.generator.model;

public class EcsSupplierArticleCat {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.cat_id
     *
     * @mbg.generated
     */
    private Integer catId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.cat_name
     *
     * @mbg.generated
     */
    private String catName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.cat_type
     *
     * @mbg.generated
     */
    private byte[] catType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.keywords
     *
     * @mbg.generated
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.cat_desc
     *
     * @mbg.generated
     */
    private String catDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.sort_order
     *
     * @mbg.generated
     */
    private Byte sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.show_in_nav
     *
     * @mbg.generated
     */
    private byte[] showInNav;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_article_cat.parent_id
     *
     * @mbg.generated
     */
    private Short parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.cat_id
     *
     * @return the value of ecs_supplier_article_cat.cat_id
     *
     * @mbg.generated
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.cat_id
     *
     * @param catId the value for ecs_supplier_article_cat.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.cat_name
     *
     * @return the value of ecs_supplier_article_cat.cat_name
     *
     * @mbg.generated
     */
    public String getCatName() {
        return catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.cat_name
     *
     * @param catName the value for ecs_supplier_article_cat.cat_name
     *
     * @mbg.generated
     */
    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.cat_type
     *
     * @return the value of ecs_supplier_article_cat.cat_type
     *
     * @mbg.generated
     */
    public byte[] getCatType() {
        return catType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.cat_type
     *
     * @param catType the value for ecs_supplier_article_cat.cat_type
     *
     * @mbg.generated
     */
    public void setCatType(byte[] catType) {
        this.catType = catType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.keywords
     *
     * @return the value of ecs_supplier_article_cat.keywords
     *
     * @mbg.generated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.keywords
     *
     * @param keywords the value for ecs_supplier_article_cat.keywords
     *
     * @mbg.generated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.cat_desc
     *
     * @return the value of ecs_supplier_article_cat.cat_desc
     *
     * @mbg.generated
     */
    public String getCatDesc() {
        return catDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.cat_desc
     *
     * @param catDesc the value for ecs_supplier_article_cat.cat_desc
     *
     * @mbg.generated
     */
    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.sort_order
     *
     * @return the value of ecs_supplier_article_cat.sort_order
     *
     * @mbg.generated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.sort_order
     *
     * @param sortOrder the value for ecs_supplier_article_cat.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.show_in_nav
     *
     * @return the value of ecs_supplier_article_cat.show_in_nav
     *
     * @mbg.generated
     */
    public byte[] getShowInNav() {
        return showInNav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.show_in_nav
     *
     * @param showInNav the value for ecs_supplier_article_cat.show_in_nav
     *
     * @mbg.generated
     */
    public void setShowInNav(byte[] showInNav) {
        this.showInNav = showInNav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_article_cat.parent_id
     *
     * @return the value of ecs_supplier_article_cat.parent_id
     *
     * @mbg.generated
     */
    public Short getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_article_cat.parent_id
     *
     * @param parentId the value for ecs_supplier_article_cat.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}