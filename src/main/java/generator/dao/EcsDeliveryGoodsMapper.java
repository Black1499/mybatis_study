package generator.dao;

import generator.model.EcsDeliveryGoods;
import generator.model.EcsDeliveryGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsDeliveryGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int insert(EcsDeliveryGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsDeliveryGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    List<EcsDeliveryGoods> selectByExampleWithBLOBs(EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    List<EcsDeliveryGoods> selectByExample(EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    EcsDeliveryGoods selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsDeliveryGoods record, @Param("example") EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsDeliveryGoods record, @Param("example") EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsDeliveryGoods record, @Param("example") EcsDeliveryGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsDeliveryGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsDeliveryGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsDeliveryGoods record);
}