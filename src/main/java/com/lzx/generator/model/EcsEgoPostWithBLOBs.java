package com.lzx.generator.model;

public class EcsEgoPostWithBLOBs extends EcsEgoPost {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.excerpt
     *
     * @mbg.generated
     */
    private String excerpt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_post.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.excerpt
     *
     * @return the value of ecs_ego_post.excerpt
     *
     * @mbg.generated
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.excerpt
     *
     * @param excerpt the value for ecs_ego_post.excerpt
     *
     * @mbg.generated
     */
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt == null ? null : excerpt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_post.content
     *
     * @return the value of ecs_ego_post.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_post.content
     *
     * @param content the value for ecs_ego_post.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}