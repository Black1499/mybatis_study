package generator.model;

import java.util.Date;

public class EcsEgoPost {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.cover_id
     *
     * @mbg.generated
     */
    private String coverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.keywords
     *
     * @mbg.generated
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.term_id
     *
     * @mbg.generated
     */
    private Long termId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.tags_id
     *
     * @mbg.generated
     */
    private String tagsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.read_times
     *
     * @mbg.generated
     */
    private Integer readTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.upvote_times
     *
     * @mbg.generated
     */
    private Integer upvoteTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.favor_times
     *
     * @mbg.generated
     */
    private Integer favorTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.share_times
     *
     * @mbg.generated
     */
    private Integer shareTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.comment_times
     *
     * @mbg.generated
     */
    private Integer commentTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.comment_status
     *
     * @mbg.generated
     */
    private String commentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.userhost
     *
     * @mbg.generated
     */
    private String userhost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.useragent
     *
     * @mbg.generated
     */
    private String useragent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.userloc
     *
     * @mbg.generated
     */
    private String userloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.deleted_at
     *
     * @mbg.generated
     */
    private Date deletedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.id
     *
     * @return the value of ecs_ego_post.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.id
     *
     * @param id the value for ecs_ego_post.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.title
     *
     * @return the value of ecs_ego_post.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.title
     *
     * @param title the value for ecs_ego_post.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.cover_id
     *
     * @return the value of ecs_ego_post.cover_id
     *
     * @mbg.generated
     */
    public String getCoverId() {
        return coverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.cover_id
     *
     * @param coverId the value for ecs_ego_post.cover_id
     *
     * @mbg.generated
     */
    public void setCoverId(String coverId) {
        this.coverId = coverId == null ? null : coverId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.keywords
     *
     * @return the value of ecs_ego_post.keywords
     *
     * @mbg.generated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.keywords
     *
     * @param keywords the value for ecs_ego_post.keywords
     *
     * @mbg.generated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.status
     *
     * @return the value of ecs_ego_post.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.status
     *
     * @param status the value for ecs_ego_post.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.user_id
     *
     * @return the value of ecs_ego_post.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.user_id
     *
     * @param userId the value for ecs_ego_post.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.term_id
     *
     * @return the value of ecs_ego_post.term_id
     *
     * @mbg.generated
     */
    public Long getTermId() {
        return termId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.term_id
     *
     * @param termId the value for ecs_ego_post.term_id
     *
     * @mbg.generated
     */
    public void setTermId(Long termId) {
        this.termId = termId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.tags_id
     *
     * @return the value of ecs_ego_post.tags_id
     *
     * @mbg.generated
     */
    public String getTagsId() {
        return tagsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.tags_id
     *
     * @param tagsId the value for ecs_ego_post.tags_id
     *
     * @mbg.generated
     */
    public void setTagsId(String tagsId) {
        this.tagsId = tagsId == null ? null : tagsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.read_times
     *
     * @return the value of ecs_ego_post.read_times
     *
     * @mbg.generated
     */
    public Integer getReadTimes() {
        return readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.read_times
     *
     * @param readTimes the value for ecs_ego_post.read_times
     *
     * @mbg.generated
     */
    public void setReadTimes(Integer readTimes) {
        this.readTimes = readTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.upvote_times
     *
     * @return the value of ecs_ego_post.upvote_times
     *
     * @mbg.generated
     */
    public Integer getUpvoteTimes() {
        return upvoteTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.upvote_times
     *
     * @param upvoteTimes the value for ecs_ego_post.upvote_times
     *
     * @mbg.generated
     */
    public void setUpvoteTimes(Integer upvoteTimes) {
        this.upvoteTimes = upvoteTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.favor_times
     *
     * @return the value of ecs_ego_post.favor_times
     *
     * @mbg.generated
     */
    public Integer getFavorTimes() {
        return favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.favor_times
     *
     * @param favorTimes the value for ecs_ego_post.favor_times
     *
     * @mbg.generated
     */
    public void setFavorTimes(Integer favorTimes) {
        this.favorTimes = favorTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.share_times
     *
     * @return the value of ecs_ego_post.share_times
     *
     * @mbg.generated
     */
    public Integer getShareTimes() {
        return shareTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.share_times
     *
     * @param shareTimes the value for ecs_ego_post.share_times
     *
     * @mbg.generated
     */
    public void setShareTimes(Integer shareTimes) {
        this.shareTimes = shareTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.comment_times
     *
     * @return the value of ecs_ego_post.comment_times
     *
     * @mbg.generated
     */
    public Integer getCommentTimes() {
        return commentTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.comment_times
     *
     * @param commentTimes the value for ecs_ego_post.comment_times
     *
     * @mbg.generated
     */
    public void setCommentTimes(Integer commentTimes) {
        this.commentTimes = commentTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.comment_status
     *
     * @return the value of ecs_ego_post.comment_status
     *
     * @mbg.generated
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.comment_status
     *
     * @param commentStatus the value for ecs_ego_post.comment_status
     *
     * @mbg.generated
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.userhost
     *
     * @return the value of ecs_ego_post.userhost
     *
     * @mbg.generated
     */
    public String getUserhost() {
        return userhost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.userhost
     *
     * @param userhost the value for ecs_ego_post.userhost
     *
     * @mbg.generated
     */
    public void setUserhost(String userhost) {
        this.userhost = userhost == null ? null : userhost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.useragent
     *
     * @return the value of ecs_ego_post.useragent
     *
     * @mbg.generated
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.useragent
     *
     * @param useragent the value for ecs_ego_post.useragent
     *
     * @mbg.generated
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.userloc
     *
     * @return the value of ecs_ego_post.userloc
     *
     * @mbg.generated
     */
    public String getUserloc() {
        return userloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.userloc
     *
     * @param userloc the value for ecs_ego_post.userloc
     *
     * @mbg.generated
     */
    public void setUserloc(String userloc) {
        this.userloc = userloc == null ? null : userloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.deleted_at
     *
     * @return the value of ecs_ego_post.deleted_at
     *
     * @mbg.generated
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.deleted_at
     *
     * @param deletedAt the value for ecs_ego_post.deleted_at
     *
     * @mbg.generated
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.updated_at
     *
     * @return the value of ecs_ego_post.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.updated_at
     *
     * @param updatedAt the value for ecs_ego_post.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.created_at
     *
     * @return the value of ecs_ego_post.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.created_at
     *
     * @param createdAt the value for ecs_ego_post.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}