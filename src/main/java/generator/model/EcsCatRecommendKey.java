package generator.model;

public class EcsCatRecommendKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    private Short catId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    private byte[] recommendType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_cat_recommend.cat_id
     *
     * @return the value of ecs_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    public Short getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_cat_recommend.cat_id
     *
     * @param catId the value for ecs_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    public void setCatId(Short catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_cat_recommend.recommend_type
     *
     * @return the value of ecs_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    public byte[] getRecommendType() {
        return recommendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_cat_recommend.recommend_type
     *
     * @param recommendType the value for ecs_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    public void setRecommendType(byte[] recommendType) {
        this.recommendType = recommendType;
    }
}