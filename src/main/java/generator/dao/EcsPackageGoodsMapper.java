package generator.dao;

import generator.model.EcsPackageGoods;
import generator.model.EcsPackageGoodsExample;
import generator.model.EcsPackageGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPackageGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    long countByExample(EcsPackageGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int deleteByExample(EcsPackageGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsPackageGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int insert(EcsPackageGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int insertSelective(EcsPackageGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    List<EcsPackageGoods> selectByExample(EcsPackageGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    EcsPackageGoods selectByPrimaryKey(EcsPackageGoodsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsPackageGoods record, @Param("example") EcsPackageGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsPackageGoods record, @Param("example") EcsPackageGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsPackageGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPackageGoods record);
}