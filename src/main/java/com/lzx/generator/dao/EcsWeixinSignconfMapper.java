package com.lzx.generator.dao;

import com.lzx.generator.model.EcsWeixinSignconf;
import com.lzx.generator.model.EcsWeixinSignconfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinSignconfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinSignconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinSignconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int insert(EcsWeixinSignconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinSignconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    List<EcsWeixinSignconf> selectByExample(EcsWeixinSignconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    EcsWeixinSignconf selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinSignconf record, @Param("example") EcsWeixinSignconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinSignconf record, @Param("example") EcsWeixinSignconfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinSignconf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_signconf
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinSignconf record);
}