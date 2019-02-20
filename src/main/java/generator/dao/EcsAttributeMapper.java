package generator.dao;

import generator.model.EcsAttribute;
import generator.model.EcsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    long countByExample(EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int deleteByExample(EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int insert(EcsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int insertSelective(EcsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    List<EcsAttribute> selectByExampleWithBLOBs(EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    List<EcsAttribute> selectByExample(EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    EcsAttribute selectByPrimaryKey(Short attrId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsAttribute record, @Param("example") EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsAttribute record, @Param("example") EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsAttribute record, @Param("example") EcsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAttribute record);
}