package com.lzx.generator.dao;

import com.lzx.generator.model.EcsShopConfig;
import com.lzx.generator.model.EcsShopConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsShopConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    long countByExample(EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int deleteByExample(EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int insert(EcsShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int insertSelective(EcsShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    List<EcsShopConfig> selectByExampleWithBLOBs(EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    List<EcsShopConfig> selectByExample(EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    EcsShopConfig selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsShopConfig record, @Param("example") EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsShopConfig record, @Param("example") EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsShopConfig record, @Param("example") EcsShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsShopConfig record);
}