package generator.dao;

import generator.model.EcsComment;
import generator.model.EcsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    long countByExample(EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int deleteByExample(EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int insert(EcsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int insertSelective(EcsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    List<EcsComment> selectByExampleWithBLOBs(EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    List<EcsComment> selectByExample(EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    EcsComment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsComment record, @Param("example") EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsComment record, @Param("example") EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsComment record, @Param("example") EcsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsComment record);
}