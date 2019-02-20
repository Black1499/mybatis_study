package generator.dao;

import generator.model.EcsTemplate;
import generator.model.EcsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    long countByExample(EcsTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    int deleteByExample(EcsTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    int insert(EcsTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    int insertSelective(EcsTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    List<EcsTemplate> selectByExample(EcsTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsTemplate record, @Param("example") EcsTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_template
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsTemplate record, @Param("example") EcsTemplateExample example);
}