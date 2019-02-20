package com.lzx.generator.dao;

import com.lzx.generator.model.EcsShaidan;
import com.lzx.generator.model.EcsShaidanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsShaidanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    long countByExample(EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int deleteByExample(EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer shaidanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int insert(EcsShaidan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int insertSelective(EcsShaidan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    List<EcsShaidan> selectByExampleWithBLOBs(EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    List<EcsShaidan> selectByExample(EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    EcsShaidan selectByPrimaryKey(Integer shaidanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsShaidan record, @Param("example") EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsShaidan record, @Param("example") EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsShaidan record, @Param("example") EcsShaidanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsShaidan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsShaidan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsShaidan record);
}