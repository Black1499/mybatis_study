package com.lzx.generator.dao;

import com.lzx.generator.model.EcsTopic;
import com.lzx.generator.model.EcsTopicExample;
import com.lzx.generator.model.EcsTopicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    long countByExample(EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int deleteByExample(EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int insert(EcsTopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int insertSelective(EcsTopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    List<EcsTopicWithBLOBs> selectByExampleWithBLOBs(EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    List<EcsTopic> selectByExample(EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsTopicWithBLOBs record, @Param("example") EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsTopicWithBLOBs record, @Param("example") EcsTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsTopic record, @Param("example") EcsTopicExample example);
}