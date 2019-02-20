package com.lzx.generator.model;

public class EcsErrorLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_error_log.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_error_log.info
     *
     * @mbg.generated
     */
    private String info;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_error_log.file
     *
     * @mbg.generated
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_error_log.time
     *
     * @mbg.generated
     */
    private Integer time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_error_log.id
     *
     * @return the value of ecs_error_log.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_error_log.id
     *
     * @param id the value for ecs_error_log.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_error_log.info
     *
     * @return the value of ecs_error_log.info
     *
     * @mbg.generated
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_error_log.info
     *
     * @param info the value for ecs_error_log.info
     *
     * @mbg.generated
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_error_log.file
     *
     * @return the value of ecs_error_log.file
     *
     * @mbg.generated
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_error_log.file
     *
     * @param file the value for ecs_error_log.file
     *
     * @mbg.generated
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_error_log.time
     *
     * @return the value of ecs_error_log.time
     *
     * @mbg.generated
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_error_log.time
     *
     * @param time the value for ecs_error_log.time
     *
     * @mbg.generated
     */
    public void setTime(Integer time) {
        this.time = time;
    }
}