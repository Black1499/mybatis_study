package generator.dao;

import generator.model.EcsTakegoodsGoods;
import generator.model.EcsTakegoodsGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTakegoodsGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsTakegoodsGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsTakegoodsGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int insert(EcsTakegoodsGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsTakegoodsGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    List<EcsTakegoodsGoods> selectByExample(EcsTakegoodsGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    EcsTakegoodsGoods selectByPrimaryKey(Integer tgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsTakegoodsGoods record, @Param("example") EcsTakegoodsGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsTakegoodsGoods record, @Param("example") EcsTakegoodsGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsTakegoodsGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsTakegoodsGoods record);
}