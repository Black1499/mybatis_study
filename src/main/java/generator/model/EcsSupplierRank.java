package generator.model;

public class EcsSupplierRank {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_rank.rank_id
     *
     * @mbg.generated
     */
    private Byte rankId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_rank.rank_name
     *
     * @mbg.generated
     */
    private String rankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_rank.sort_order
     *
     * @mbg.generated
     */
    private Byte sortOrder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_rank.rank_id
     *
     * @return the value of ecs_supplier_rank.rank_id
     *
     * @mbg.generated
     */
    public Byte getRankId() {
        return rankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_rank.rank_id
     *
     * @param rankId the value for ecs_supplier_rank.rank_id
     *
     * @mbg.generated
     */
    public void setRankId(Byte rankId) {
        this.rankId = rankId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_rank.rank_name
     *
     * @return the value of ecs_supplier_rank.rank_name
     *
     * @mbg.generated
     */
    public String getRankName() {
        return rankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_rank.rank_name
     *
     * @param rankName the value for ecs_supplier_rank.rank_name
     *
     * @mbg.generated
     */
    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_rank.sort_order
     *
     * @return the value of ecs_supplier_rank.sort_order
     *
     * @mbg.generated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_rank.sort_order
     *
     * @param sortOrder the value for ecs_supplier_rank.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }
}