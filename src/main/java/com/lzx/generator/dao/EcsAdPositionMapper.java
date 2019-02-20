package com.lzx.generator.dao;

import com.lzx.generator.model.EcsAdPosition;
import com.lzx.generator.model.EcsAdPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAdPositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    long countByExample(EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int deleteByExample(EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int insert(EcsAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int insertSelective(EcsAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    List<EcsAdPosition> selectByExampleWithBLOBs(EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    List<EcsAdPosition> selectByExample(EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    EcsAdPosition selectByPrimaryKey(Byte positionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsAdPosition record, @Param("example") EcsAdPositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsAdPosition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAdPosition record);
}