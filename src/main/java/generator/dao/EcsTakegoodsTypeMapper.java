package generator.dao;

import generator.model.EcsTakegoodsType;
import generator.model.EcsTakegoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTakegoodsTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    long countByExample(EcsTakegoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int deleteByExample(EcsTakegoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int insert(EcsTakegoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int insertSelective(EcsTakegoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    List<EcsTakegoodsType> selectByExample(EcsTakegoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    EcsTakegoodsType selectByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsTakegoodsType record, @Param("example") EcsTakegoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsTakegoodsType record, @Param("example") EcsTakegoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsTakegoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsTakegoodsType record);
}