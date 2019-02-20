package com.lzx.generator.model;

import java.math.BigDecimal;

public class EcsAuctionLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    private Integer logId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    private Integer actId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    private Integer bidUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    private BigDecimal bidPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    private Integer bidTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.log_id
     *
     * @return the value of ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.log_id
     *
     * @param logId the value for ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.act_id
     *
     * @return the value of ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    public Integer getActId() {
        return actId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.act_id
     *
     * @param actId the value for ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    public void setActId(Integer actId) {
        this.actId = actId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_user
     *
     * @return the value of ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    public Integer getBidUser() {
        return bidUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_user
     *
     * @param bidUser the value for ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    public void setBidUser(Integer bidUser) {
        this.bidUser = bidUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_price
     *
     * @return the value of ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_price
     *
     * @param bidPrice the value for ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_time
     *
     * @return the value of ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    public Integer getBidTime() {
        return bidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_time
     *
     * @param bidTime the value for ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    public void setBidTime(Integer bidTime) {
        this.bidTime = bidTime;
    }
}