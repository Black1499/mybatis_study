package com.lzx.generator.dao;

import com.lzx.generator.model.EcsEcsmartPayment;
import com.lzx.generator.model.EcsEcsmartPaymentExample;
import com.lzx.generator.model.EcsEcsmartPaymentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEcsmartPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    long countByExample(EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int insertSelective(EcsEcsmartPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    List<EcsEcsmartPaymentWithBLOBs> selectByExampleWithBLOBs(EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    List<EcsEcsmartPayment> selectByExample(EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    EcsEcsmartPaymentWithBLOBs selectByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEcsmartPaymentWithBLOBs record, @Param("example") EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEcsmartPaymentWithBLOBs record, @Param("example") EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEcsmartPayment record, @Param("example") EcsEcsmartPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEcsmartPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEcsmartPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartPayment record);
}