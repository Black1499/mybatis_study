package generator.model;

public class EcsEgoEvilword {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_evilword.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_evilword.badword
     *
     * @mbg.generated
     */
    private String badword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_evilword.replaceword
     *
     * @mbg.generated
     */
    private String replaceword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_evilword.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_evilword.id
     *
     * @return the value of ecs_ego_evilword.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_evilword.id
     *
     * @param id the value for ecs_ego_evilword.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_evilword.badword
     *
     * @return the value of ecs_ego_evilword.badword
     *
     * @mbg.generated
     */
    public String getBadword() {
        return badword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_evilword.badword
     *
     * @param badword the value for ecs_ego_evilword.badword
     *
     * @mbg.generated
     */
    public void setBadword(String badword) {
        this.badword = badword == null ? null : badword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_evilword.replaceword
     *
     * @return the value of ecs_ego_evilword.replaceword
     *
     * @mbg.generated
     */
    public String getReplaceword() {
        return replaceword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_evilword.replaceword
     *
     * @param replaceword the value for ecs_ego_evilword.replaceword
     *
     * @mbg.generated
     */
    public void setReplaceword(String replaceword) {
        this.replaceword = replaceword == null ? null : replaceword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_evilword.level
     *
     * @return the value of ecs_ego_evilword.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_evilword.level
     *
     * @param level the value for ecs_ego_evilword.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}