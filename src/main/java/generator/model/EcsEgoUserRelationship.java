package generator.model;

import java.util.Date;

public class EcsEgoUserRelationship {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.follower_id
     *
     * @mbg.generated
     */
    private Long followerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.followed_id
     *
     * @mbg.generated
     */
    private Long followedId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.deleted_at
     *
     * @mbg.generated
     */
    private Date deletedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_user_relationship.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.id
     *
     * @return the value of ecs_ego_user_relationship.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.id
     *
     * @param id the value for ecs_ego_user_relationship.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.follower_id
     *
     * @return the value of ecs_ego_user_relationship.follower_id
     *
     * @mbg.generated
     */
    public Long getFollowerId() {
        return followerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.follower_id
     *
     * @param followerId the value for ecs_ego_user_relationship.follower_id
     *
     * @mbg.generated
     */
    public void setFollowerId(Long followerId) {
        this.followerId = followerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.followed_id
     *
     * @return the value of ecs_ego_user_relationship.followed_id
     *
     * @mbg.generated
     */
    public Long getFollowedId() {
        return followedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.followed_id
     *
     * @param followedId the value for ecs_ego_user_relationship.followed_id
     *
     * @mbg.generated
     */
    public void setFollowedId(Long followedId) {
        this.followedId = followedId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.deleted_at
     *
     * @return the value of ecs_ego_user_relationship.deleted_at
     *
     * @mbg.generated
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.deleted_at
     *
     * @param deletedAt the value for ecs_ego_user_relationship.deleted_at
     *
     * @mbg.generated
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.updated_at
     *
     * @return the value of ecs_ego_user_relationship.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.updated_at
     *
     * @param updatedAt the value for ecs_ego_user_relationship.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_user_relationship.created_at
     *
     * @return the value of ecs_ego_user_relationship.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_user_relationship.created_at
     *
     * @param createdAt the value for ecs_ego_user_relationship.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}