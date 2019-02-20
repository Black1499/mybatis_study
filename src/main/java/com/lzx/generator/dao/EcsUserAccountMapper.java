package com.lzx.generator.dao;

import com.lzx.generator.model.EcsUserAccount;
import com.lzx.generator.model.EcsUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsUserAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    long countByExample(EcsUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int deleteByExample(EcsUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int insert(EcsUserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int insertSelective(EcsUserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    List<EcsUserAccount> selectByExample(EcsUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    EcsUserAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsUserAccount record, @Param("example") EcsUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsUserAccount record, @Param("example") EcsUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsUserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUserAccount record);
}