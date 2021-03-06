package generator.dao;

import generator.model.EcsBookingGoods;
import generator.model.EcsBookingGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsBookingGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsBookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsBookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int insert(EcsBookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsBookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    List<EcsBookingGoods> selectByExample(EcsBookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    EcsBookingGoods selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsBookingGoods record, @Param("example") EcsBookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsBookingGoods record, @Param("example") EcsBookingGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsBookingGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsBookingGoods record);
}