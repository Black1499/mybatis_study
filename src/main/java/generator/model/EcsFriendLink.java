package generator.model;

public class EcsFriendLink {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_friend_link.link_id
     *
     * @mbg.generated
     */
    private Short linkId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_friend_link.link_name
     *
     * @mbg.generated
     */
    private String linkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_friend_link.link_url
     *
     * @mbg.generated
     */
    private String linkUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_friend_link.link_logo
     *
     * @mbg.generated
     */
    private String linkLogo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_friend_link.show_order
     *
     * @mbg.generated
     */
    private Byte showOrder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_friend_link.link_id
     *
     * @return the value of ecs_friend_link.link_id
     *
     * @mbg.generated
     */
    public Short getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_friend_link.link_id
     *
     * @param linkId the value for ecs_friend_link.link_id
     *
     * @mbg.generated
     */
    public void setLinkId(Short linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_friend_link.link_name
     *
     * @return the value of ecs_friend_link.link_name
     *
     * @mbg.generated
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_friend_link.link_name
     *
     * @param linkName the value for ecs_friend_link.link_name
     *
     * @mbg.generated
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_friend_link.link_url
     *
     * @return the value of ecs_friend_link.link_url
     *
     * @mbg.generated
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_friend_link.link_url
     *
     * @param linkUrl the value for ecs_friend_link.link_url
     *
     * @mbg.generated
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_friend_link.link_logo
     *
     * @return the value of ecs_friend_link.link_logo
     *
     * @mbg.generated
     */
    public String getLinkLogo() {
        return linkLogo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_friend_link.link_logo
     *
     * @param linkLogo the value for ecs_friend_link.link_logo
     *
     * @mbg.generated
     */
    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo == null ? null : linkLogo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_friend_link.show_order
     *
     * @return the value of ecs_friend_link.show_order
     *
     * @mbg.generated
     */
    public Byte getShowOrder() {
        return showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_friend_link.show_order
     *
     * @param showOrder the value for ecs_friend_link.show_order
     *
     * @mbg.generated
     */
    public void setShowOrder(Byte showOrder) {
        this.showOrder = showOrder;
    }
}