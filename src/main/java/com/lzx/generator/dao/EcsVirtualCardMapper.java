package com.lzx.generator.dao;

import com.lzx.generator.model.EcsVirtualCard;
import com.lzx.generator.model.EcsVirtualCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsVirtualCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    long countByExample(EcsVirtualCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int deleteByExample(EcsVirtualCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int insert(EcsVirtualCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int insertSelective(EcsVirtualCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    List<EcsVirtualCard> selectByExample(EcsVirtualCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    EcsVirtualCard selectByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsVirtualCard record, @Param("example") EcsVirtualCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsVirtualCard record, @Param("example") EcsVirtualCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsVirtualCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_virtual_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVirtualCard record);
}