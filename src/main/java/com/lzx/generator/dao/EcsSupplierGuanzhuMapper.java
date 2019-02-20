package com.lzx.generator.dao;

import com.lzx.generator.model.EcsSupplierGuanzhu;
import com.lzx.generator.model.EcsSupplierGuanzhuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSupplierGuanzhuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    long countByExample(EcsSupplierGuanzhuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSupplierGuanzhuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int insert(EcsSupplierGuanzhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int insertSelective(EcsSupplierGuanzhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    List<EcsSupplierGuanzhu> selectByExample(EcsSupplierGuanzhuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    EcsSupplierGuanzhu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSupplierGuanzhu record, @Param("example") EcsSupplierGuanzhuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSupplierGuanzhu record, @Param("example") EcsSupplierGuanzhuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsSupplierGuanzhu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_guanzhu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierGuanzhu record);
}