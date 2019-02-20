package com.lzx.generator.dao;

import com.lzx.generator.model.EcsWeixinMenu;
import com.lzx.generator.model.EcsWeixinMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int insert(EcsWeixinMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    List<EcsWeixinMenu> selectByExample(EcsWeixinMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    EcsWeixinMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinMenu record, @Param("example") EcsWeixinMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinMenu record, @Param("example") EcsWeixinMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinMenu record);
}