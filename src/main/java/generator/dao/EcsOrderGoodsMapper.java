package generator.dao;

import generator.model.EcsOrderGoods;
import generator.model.EcsOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int insert(EcsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    List<EcsOrderGoods> selectByExampleWithBLOBs(EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    List<EcsOrderGoods> selectByExample(EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    EcsOrderGoods selectByPrimaryKey(Integer recId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsOrderGoods record, @Param("example") EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsOrderGoods record, @Param("example") EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsOrderGoods record, @Param("example") EcsOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderGoods record);
}