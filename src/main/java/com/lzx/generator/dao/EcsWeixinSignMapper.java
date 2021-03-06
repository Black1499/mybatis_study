package com.lzx.generator.dao;

import com.lzx.generator.model.EcsWeixinSign;
import com.lzx.generator.model.EcsWeixinSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinSignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int insert(EcsWeixinSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    List<EcsWeixinSign> selectByExample(EcsWeixinSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    EcsWeixinSign selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinSign record, @Param("example") EcsWeixinSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinSign record, @Param("example") EcsWeixinSignExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinSign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_sign
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinSign record);
}