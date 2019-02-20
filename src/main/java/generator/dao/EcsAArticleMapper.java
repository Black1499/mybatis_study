package generator.dao;

import generator.model.EcsAArticle;
import generator.model.EcsAArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    long countByExample(EcsAArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int deleteByExample(EcsAArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int insert(EcsAArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int insertSelective(EcsAArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    List<EcsAArticle> selectByExample(EcsAArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    EcsAArticle selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsAArticle record, @Param("example") EcsAArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsAArticle record, @Param("example") EcsAArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsAArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_a_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAArticle record);
}