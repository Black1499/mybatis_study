package generator.model;

import java.util.Date;

public class EcsKeywordsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keywords.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keywords.searchengine
     *
     * @mbg.generated
     */
    private String searchengine;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keywords.keyword
     *
     * @mbg.generated
     */
    private String keyword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keywords.date
     *
     * @return the value of ecs_keywords.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keywords.date
     *
     * @param date the value for ecs_keywords.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keywords.searchengine
     *
     * @return the value of ecs_keywords.searchengine
     *
     * @mbg.generated
     */
    public String getSearchengine() {
        return searchengine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keywords.searchengine
     *
     * @param searchengine the value for ecs_keywords.searchengine
     *
     * @mbg.generated
     */
    public void setSearchengine(String searchengine) {
        this.searchengine = searchengine == null ? null : searchengine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keywords.keyword
     *
     * @return the value of ecs_keywords.keyword
     *
     * @mbg.generated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keywords.keyword
     *
     * @param keyword the value for ecs_keywords.keyword
     *
     * @mbg.generated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}