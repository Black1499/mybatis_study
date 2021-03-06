package com.lzx.generator.model;

public class EcsVoteLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    private Integer logId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    private Short voteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    private String ipAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    private Integer voteTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.log_id
     *
     * @return the value of ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.log_id
     *
     * @param logId the value for ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.vote_id
     *
     * @return the value of ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    public Short getVoteId() {
        return voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.vote_id
     *
     * @param voteId the value for ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    public void setVoteId(Short voteId) {
        this.voteId = voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.ip_address
     *
     * @return the value of ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.ip_address
     *
     * @param ipAddress the value for ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.vote_time
     *
     * @return the value of ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    public Integer getVoteTime() {
        return voteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.vote_time
     *
     * @param voteTime the value for ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    public void setVoteTime(Integer voteTime) {
        this.voteTime = voteTime;
    }
}