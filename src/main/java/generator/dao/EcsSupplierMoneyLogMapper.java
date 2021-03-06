package generator.dao;

import generator.model.EcsSupplierMoneyLog;
import generator.model.EcsSupplierMoneyLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSupplierMoneyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    long countByExample(EcsSupplierMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSupplierMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int insert(EcsSupplierMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int insertSelective(EcsSupplierMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    List<EcsSupplierMoneyLog> selectByExample(EcsSupplierMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    EcsSupplierMoneyLog selectByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSupplierMoneyLog record, @Param("example") EcsSupplierMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSupplierMoneyLog record, @Param("example") EcsSupplierMoneyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsSupplierMoneyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_money_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierMoneyLog record);
}