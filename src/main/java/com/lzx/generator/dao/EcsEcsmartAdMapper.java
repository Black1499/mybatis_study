package com.lzx.generator.dao;

import com.lzx.generator.model.EcsEcsmartAd;
import com.lzx.generator.model.EcsEcsmartAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEcsmartAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    long countByExample(EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short adId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int insertSelective(EcsEcsmartAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    List<EcsEcsmartAd> selectByExampleWithBLOBs(EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    List<EcsEcsmartAd> selectByExample(EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    EcsEcsmartAd selectByPrimaryKey(Short adId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEcsmartAd record, @Param("example") EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEcsmartAd record, @Param("example") EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEcsmartAd record, @Param("example") EcsEcsmartAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEcsmartAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEcsmartAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartAd record);
}