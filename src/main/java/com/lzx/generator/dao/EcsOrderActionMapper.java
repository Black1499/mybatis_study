package com.lzx.generator.dao;

import com.lzx.generator.model.EcsOrderAction;
import com.lzx.generator.model.EcsOrderActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    long countByExample(EcsOrderActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int deleteByExample(EcsOrderActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int insert(EcsOrderAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int insertSelective(EcsOrderAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    List<EcsOrderAction> selectByExample(EcsOrderActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    EcsOrderAction selectByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsOrderAction record, @Param("example") EcsOrderActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsOrderAction record, @Param("example") EcsOrderActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsOrderAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderAction record);
}