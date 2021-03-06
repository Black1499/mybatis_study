package generator.dao;

import generator.model.EcsBackOrder;
import generator.model.EcsBackOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsBackOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    long countByExample(EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int deleteByExample(EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer backId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int insert(EcsBackOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int insertSelective(EcsBackOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    List<EcsBackOrder> selectByExampleWithBLOBs(EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    List<EcsBackOrder> selectByExample(EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    EcsBackOrder selectByPrimaryKey(Integer backId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsBackOrder record, @Param("example") EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsBackOrder record, @Param("example") EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsBackOrder record, @Param("example") EcsBackOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsBackOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsBackOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_back_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsBackOrder record);
}