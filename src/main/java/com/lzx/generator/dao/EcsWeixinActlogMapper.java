package com.lzx.generator.dao;

import com.lzx.generator.model.EcsWeixinActlog;
import com.lzx.generator.model.EcsWeixinActlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinActlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinActlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinActlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int insert(EcsWeixinActlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinActlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    List<EcsWeixinActlog> selectByExample(EcsWeixinActlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    EcsWeixinActlog selectByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinActlog record, @Param("example") EcsWeixinActlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinActlog record, @Param("example") EcsWeixinActlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinActlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinActlog record);
}