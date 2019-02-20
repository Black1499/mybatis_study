package com.lzx.generator.dao;

import com.lzx.generator.model.EcsPayLog;
import com.lzx.generator.model.EcsPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPayLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    long countByExample(EcsPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int deleteByExample(EcsPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int insert(EcsPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int insertSelective(EcsPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    List<EcsPayLog> selectByExample(EcsPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    EcsPayLog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsPayLog record, @Param("example") EcsPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsPayLog record, @Param("example") EcsPayLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsPayLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_pay_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPayLog record);
}