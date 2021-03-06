package generator.model;

public class EcsTag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_tag.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_tag.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_tag.goods_id
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_tag.tag_words
     *
     * @mbg.generated
     */
    private String tagWords;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_tag.tag_id
     *
     * @return the value of ecs_tag.tag_id
     *
     * @mbg.generated
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_tag.tag_id
     *
     * @param tagId the value for ecs_tag.tag_id
     *
     * @mbg.generated
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_tag.user_id
     *
     * @return the value of ecs_tag.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_tag.user_id
     *
     * @param userId the value for ecs_tag.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_tag.goods_id
     *
     * @return the value of ecs_tag.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_tag.goods_id
     *
     * @param goodsId the value for ecs_tag.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_tag.tag_words
     *
     * @return the value of ecs_tag.tag_words
     *
     * @mbg.generated
     */
    public String getTagWords() {
        return tagWords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_tag.tag_words
     *
     * @param tagWords the value for ecs_tag.tag_words
     *
     * @mbg.generated
     */
    public void setTagWords(String tagWords) {
        this.tagWords = tagWords == null ? null : tagWords.trim();
    }
}