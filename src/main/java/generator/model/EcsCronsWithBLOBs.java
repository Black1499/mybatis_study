package generator.model;

public class EcsCronsWithBLOBs extends EcsCrons {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    private String cronDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_crons.cron_config
     *
     * @mbg.generated
     */
    private String cronConfig;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_crons.cron_desc
     *
     * @return the value of ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    public String getCronDesc() {
        return cronDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_crons.cron_desc
     *
     * @param cronDesc the value for ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    public void setCronDesc(String cronDesc) {
        this.cronDesc = cronDesc == null ? null : cronDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_crons.cron_config
     *
     * @return the value of ecs_crons.cron_config
     *
     * @mbg.generated
     */
    public String getCronConfig() {
        return cronConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_crons.cron_config
     *
     * @param cronConfig the value for ecs_crons.cron_config
     *
     * @mbg.generated
     */
    public void setCronConfig(String cronConfig) {
        this.cronConfig = cronConfig == null ? null : cronConfig.trim();
    }
}