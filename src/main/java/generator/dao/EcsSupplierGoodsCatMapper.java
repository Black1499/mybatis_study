package generator.dao;

import generator.model.EcsSupplierGoodsCat;
import generator.model.EcsSupplierGoodsCatExample;
import generator.model.EcsSupplierGoodsCatKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSupplierGoodsCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    long countByExample(EcsSupplierGoodsCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSupplierGoodsCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsSupplierGoodsCatKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int insert(EcsSupplierGoodsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int insertSelective(EcsSupplierGoodsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    List<EcsSupplierGoodsCat> selectByExample(EcsSupplierGoodsCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    EcsSupplierGoodsCat selectByPrimaryKey(EcsSupplierGoodsCatKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSupplierGoodsCat record, @Param("example") EcsSupplierGoodsCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSupplierGoodsCat record, @Param("example") EcsSupplierGoodsCatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsSupplierGoodsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_goods_cat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierGoodsCat record);
}