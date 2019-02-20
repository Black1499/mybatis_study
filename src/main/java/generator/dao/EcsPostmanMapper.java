package generator.dao;

import generator.model.EcsPostman;
import generator.model.EcsPostmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPostmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    long countByExample(EcsPostmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int deleteByExample(EcsPostmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short postmanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int insert(EcsPostman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int insertSelective(EcsPostman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    List<EcsPostman> selectByExample(EcsPostmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    EcsPostman selectByPrimaryKey(Short postmanId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsPostman record, @Param("example") EcsPostmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsPostman record, @Param("example") EcsPostmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsPostman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_postman
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPostman record);
}