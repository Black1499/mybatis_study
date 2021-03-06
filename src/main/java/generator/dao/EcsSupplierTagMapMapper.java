package generator.dao;

import generator.model.EcsSupplierTagMapExample;
import generator.model.EcsSupplierTagMapKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSupplierTagMapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    long countByExample(EcsSupplierTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSupplierTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsSupplierTagMapKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int insert(EcsSupplierTagMapKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int insertSelective(EcsSupplierTagMapKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    List<EcsSupplierTagMapKey> selectByExample(EcsSupplierTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSupplierTagMapKey record, @Param("example") EcsSupplierTagMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_tag_map
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSupplierTagMapKey record, @Param("example") EcsSupplierTagMapExample example);
}