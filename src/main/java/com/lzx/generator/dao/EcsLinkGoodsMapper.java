package com.lzx.generator.dao;

import com.lzx.generator.model.EcsLinkGoods;
import com.lzx.generator.model.EcsLinkGoodsExample;
import com.lzx.generator.model.EcsLinkGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsLinkGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsLinkGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsLinkGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsLinkGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int insert(EcsLinkGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsLinkGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    List<EcsLinkGoods> selectByExample(EcsLinkGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    EcsLinkGoods selectByPrimaryKey(EcsLinkGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsLinkGoods record, @Param("example") EcsLinkGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsLinkGoods record, @Param("example") EcsLinkGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsLinkGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsLinkGoods record);
}