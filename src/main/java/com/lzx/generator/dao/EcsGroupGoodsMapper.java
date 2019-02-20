package com.lzx.generator.dao;

import com.lzx.generator.model.EcsGroupGoods;
import com.lzx.generator.model.EcsGroupGoodsExample;
import com.lzx.generator.model.EcsGroupGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsGroupGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsGroupGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsGroupGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsGroupGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int insert(EcsGroupGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsGroupGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    List<EcsGroupGoods> selectByExample(EcsGroupGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    EcsGroupGoods selectByPrimaryKey(EcsGroupGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsGroupGoods record, @Param("example") EcsGroupGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsGroupGoods record, @Param("example") EcsGroupGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsGroupGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_group_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsGroupGoods record);
}