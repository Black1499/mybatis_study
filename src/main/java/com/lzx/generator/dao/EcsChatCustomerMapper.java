package com.lzx.generator.dao;

import com.lzx.generator.model.EcsChatCustomer;
import com.lzx.generator.model.EcsChatCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsChatCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    long countByExample(EcsChatCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int deleteByExample(EcsChatCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int insert(EcsChatCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int insertSelective(EcsChatCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    List<EcsChatCustomer> selectByExample(EcsChatCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    EcsChatCustomer selectByPrimaryKey(Integer cusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsChatCustomer record, @Param("example") EcsChatCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsChatCustomer record, @Param("example") EcsChatCustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsChatCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsChatCustomer record);
}