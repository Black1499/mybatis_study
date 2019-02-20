package com.lzx.generator.dao;

import com.lzx.generator.model.EcsSupplierCategory;
import com.lzx.generator.model.EcsSupplierCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSupplierCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    long countByExample(EcsSupplierCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSupplierCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int insert(EcsSupplierCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int insertSelective(EcsSupplierCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    List<EcsSupplierCategory> selectByExample(EcsSupplierCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    EcsSupplierCategory selectByPrimaryKey(Short catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSupplierCategory record, @Param("example") EcsSupplierCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSupplierCategory record, @Param("example") EcsSupplierCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsSupplierCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierCategory record);
}