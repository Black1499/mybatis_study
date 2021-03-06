package com.lzx.generator.dao;

import com.lzx.generator.model.EcsVoteOption;
import com.lzx.generator.model.EcsVoteOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsVoteOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    long countByExample(EcsVoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int deleteByExample(EcsVoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short optionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int insert(EcsVoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int insertSelective(EcsVoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    List<EcsVoteOption> selectByExample(EcsVoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    EcsVoteOption selectByPrimaryKey(Short optionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsVoteOption record, @Param("example") EcsVoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsVoteOption record, @Param("example") EcsVoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsVoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_option
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVoteOption record);
}