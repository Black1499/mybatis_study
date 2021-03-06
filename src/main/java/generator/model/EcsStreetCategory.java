package generator.model;

public class EcsStreetCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.str_id
     *
     * @mbg.generated
     */
    private Short strId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.str_name
     *
     * @mbg.generated
     */
    private String strName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.str_style
     *
     * @mbg.generated
     */
    private String strStyle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.sort_order
     *
     * @mbg.generated
     */
    private byte[] sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.is_groom
     *
     * @mbg.generated
     */
    private byte[] isGroom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_street_category.is_show
     *
     * @mbg.generated
     */
    private byte[] isShow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.str_id
     *
     * @return the value of ecs_street_category.str_id
     *
     * @mbg.generated
     */
    public Short getStrId() {
        return strId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.str_id
     *
     * @param strId the value for ecs_street_category.str_id
     *
     * @mbg.generated
     */
    public void setStrId(Short strId) {
        this.strId = strId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.str_name
     *
     * @return the value of ecs_street_category.str_name
     *
     * @mbg.generated
     */
    public String getStrName() {
        return strName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.str_name
     *
     * @param strName the value for ecs_street_category.str_name
     *
     * @mbg.generated
     */
    public void setStrName(String strName) {
        this.strName = strName == null ? null : strName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.str_style
     *
     * @return the value of ecs_street_category.str_style
     *
     * @mbg.generated
     */
    public String getStrStyle() {
        return strStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.str_style
     *
     * @param strStyle the value for ecs_street_category.str_style
     *
     * @mbg.generated
     */
    public void setStrStyle(String strStyle) {
        this.strStyle = strStyle == null ? null : strStyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.sort_order
     *
     * @return the value of ecs_street_category.sort_order
     *
     * @mbg.generated
     */
    public byte[] getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.sort_order
     *
     * @param sortOrder the value for ecs_street_category.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(byte[] sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.is_groom
     *
     * @return the value of ecs_street_category.is_groom
     *
     * @mbg.generated
     */
    public byte[] getIsGroom() {
        return isGroom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.is_groom
     *
     * @param isGroom the value for ecs_street_category.is_groom
     *
     * @mbg.generated
     */
    public void setIsGroom(byte[] isGroom) {
        this.isGroom = isGroom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_street_category.is_show
     *
     * @return the value of ecs_street_category.is_show
     *
     * @mbg.generated
     */
    public byte[] getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_street_category.is_show
     *
     * @param isShow the value for ecs_street_category.is_show
     *
     * @mbg.generated
     */
    public void setIsShow(byte[] isShow) {
        this.isShow = isShow;
    }
}