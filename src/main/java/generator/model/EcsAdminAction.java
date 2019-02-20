package generator.model;

public class EcsAdminAction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    private Integer actionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    private String actionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    private String relevance;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.action_id
     *
     * @return the value of ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.action_id
     *
     * @param actionId the value for ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.parent_id
     *
     * @return the value of ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.parent_id
     *
     * @param parentId the value for ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.action_code
     *
     * @return the value of ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.action_code
     *
     * @param actionCode the value for ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode == null ? null : actionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.relevance
     *
     * @return the value of ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    public String getRelevance() {
        return relevance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.relevance
     *
     * @param relevance the value for ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance == null ? null : relevance.trim();
    }
}