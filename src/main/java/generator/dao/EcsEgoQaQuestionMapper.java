package generator.dao;

import generator.model.EcsEgoQaQuestion;
import generator.model.EcsEgoQaQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEgoQaQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    long countByExample(EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int insert(EcsEgoQaQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int insertSelective(EcsEgoQaQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    List<EcsEgoQaQuestion> selectByExampleWithBLOBs(EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    List<EcsEgoQaQuestion> selectByExample(EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    EcsEgoQaQuestion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEgoQaQuestion record, @Param("example") EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEgoQaQuestion record, @Param("example") EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEgoQaQuestion record, @Param("example") EcsEgoQaQuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEgoQaQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEgoQaQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoQaQuestion record);
}