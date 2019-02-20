package generator.dao;

import generator.model.EcsEcsmartShopConfig;
import generator.model.EcsEcsmartShopConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEcsmartShopConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    long countByExample(EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int insertSelective(EcsEcsmartShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    List<EcsEcsmartShopConfig> selectByExampleWithBLOBs(EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    List<EcsEcsmartShopConfig> selectByExample(EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    EcsEcsmartShopConfig selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEcsmartShopConfig record, @Param("example") EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEcsmartShopConfig record, @Param("example") EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEcsmartShopConfig record, @Param("example") EcsEcsmartShopConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEcsmartShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEcsmartShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartShopConfig record);
}