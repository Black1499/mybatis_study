package com.lzx.generator.dao;

import com.lzx.generator.model.EcsUserBonus;
import com.lzx.generator.model.EcsUserBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsUserBonusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    long countByExample(EcsUserBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int deleteByExample(EcsUserBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int insert(EcsUserBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int insertSelective(EcsUserBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    List<EcsUserBonus> selectByExample(EcsUserBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    EcsUserBonus selectByPrimaryKey(Integer bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsUserBonus record, @Param("example") EcsUserBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsUserBonus record, @Param("example") EcsUserBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsUserBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUserBonus record);
}