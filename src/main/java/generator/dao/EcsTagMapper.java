package generator.dao;

import generator.model.EcsTag;
import generator.model.EcsTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    long countByExample(EcsTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int deleteByExample(EcsTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int insert(EcsTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int insertSelective(EcsTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    List<EcsTag> selectByExample(EcsTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    EcsTag selectByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsTag record, @Param("example") EcsTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsTag record, @Param("example") EcsTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsTag record);
}