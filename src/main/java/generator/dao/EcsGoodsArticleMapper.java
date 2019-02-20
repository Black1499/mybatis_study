package generator.dao;

import generator.model.EcsGoodsArticleExample;
import generator.model.EcsGoodsArticleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsGoodsArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    long countByExample(EcsGoodsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int deleteByExample(EcsGoodsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EcsGoodsArticleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int insert(EcsGoodsArticleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int insertSelective(EcsGoodsArticleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    List<EcsGoodsArticleKey> selectByExample(EcsGoodsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsGoodsArticleKey record, @Param("example") EcsGoodsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_article
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsGoodsArticleKey record, @Param("example") EcsGoodsArticleExample example);
}