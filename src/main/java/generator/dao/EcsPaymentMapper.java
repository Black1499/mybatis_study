package generator.dao;

import generator.model.EcsPayment;
import generator.model.EcsPaymentExample;
import generator.model.EcsPaymentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    long countByExample(EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int deleteByExample(EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int insert(EcsPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int insertSelective(EcsPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    List<EcsPaymentWithBLOBs> selectByExampleWithBLOBs(EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    List<EcsPayment> selectByExample(EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    EcsPaymentWithBLOBs selectByPrimaryKey(Byte payId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsPaymentWithBLOBs record, @Param("example") EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsPaymentWithBLOBs record, @Param("example") EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsPayment record, @Param("example") EcsPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsPaymentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPayment record);
}