package com.lzx.generator.dao;

import com.lzx.generator.model.EcsBackAction;
import com.lzx.generator.model.EcsBackActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsBackActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    long countByExample(EcsBackActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int deleteByExample(EcsBackActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int insert(EcsBackAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int insertSelective(EcsBackAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    List<EcsBackAction> selectByExample(EcsBackActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    EcsBackAction selectByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsBackAction record, @Param("example") EcsBackActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsBackAction record, @Param("example") EcsBackActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsBackAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsBackAction record);
}