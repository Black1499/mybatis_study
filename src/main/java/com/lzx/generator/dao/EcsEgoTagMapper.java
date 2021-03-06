package com.lzx.generator.dao;

import com.lzx.generator.model.EcsEgoTag;
import com.lzx.generator.model.EcsEgoTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEgoTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    long countByExample(EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int insert(EcsEgoTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int insertSelective(EcsEgoTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    List<EcsEgoTag> selectByExampleWithBLOBs(EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    List<EcsEgoTag> selectByExample(EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    EcsEgoTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEgoTag record, @Param("example") EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEgoTag record, @Param("example") EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEgoTag record, @Param("example") EcsEgoTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEgoTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEgoTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoTag record);
}