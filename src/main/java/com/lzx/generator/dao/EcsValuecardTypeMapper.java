package com.lzx.generator.dao;

import com.lzx.generator.model.EcsValuecardType;
import com.lzx.generator.model.EcsValuecardTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsValuecardTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    long countByExample(EcsValuecardTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int deleteByExample(EcsValuecardTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int insert(EcsValuecardType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int insertSelective(EcsValuecardType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    List<EcsValuecardType> selectByExample(EcsValuecardTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    EcsValuecardType selectByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsValuecardType record, @Param("example") EcsValuecardTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsValuecardType record, @Param("example") EcsValuecardTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsValuecardType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsValuecardType record);
}