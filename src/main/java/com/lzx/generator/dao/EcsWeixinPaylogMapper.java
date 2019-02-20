package com.lzx.generator.dao;

import com.lzx.generator.model.EcsWeixinPaylog;
import com.lzx.generator.model.EcsWeixinPaylogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinPaylogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int insert(EcsWeixinPaylog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinPaylog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    List<EcsWeixinPaylog> selectByExampleWithBLOBs(EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    List<EcsWeixinPaylog> selectByExample(EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    EcsWeixinPaylog selectByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinPaylog record, @Param("example") EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsWeixinPaylog record, @Param("example") EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinPaylog record, @Param("example") EcsWeixinPaylogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinPaylog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsWeixinPaylog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_paylog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinPaylog record);
}