package com.lzx.generator.dao;

import com.lzx.generator.model.EcsEgoTerm;
import com.lzx.generator.model.EcsEgoTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEgoTermMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    long countByExample(EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int insert(EcsEgoTerm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int insertSelective(EcsEgoTerm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    List<EcsEgoTerm> selectByExampleWithBLOBs(EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    List<EcsEgoTerm> selectByExample(EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    EcsEgoTerm selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEgoTerm record, @Param("example") EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEgoTerm record, @Param("example") EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEgoTerm record, @Param("example") EcsEgoTermExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEgoTerm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEgoTerm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoTerm record);
}