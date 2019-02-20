package com.lzx.generator.dao;

import com.lzx.generator.model.EcsStats;
import com.lzx.generator.model.EcsStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    long countByExample(EcsStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    int deleteByExample(EcsStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    int insert(EcsStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    int insertSelective(EcsStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    List<EcsStats> selectByExample(EcsStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsStats record, @Param("example") EcsStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsStats record, @Param("example") EcsStatsExample example);
}