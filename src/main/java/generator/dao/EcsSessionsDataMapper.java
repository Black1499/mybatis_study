package generator.dao;

import generator.model.EcsSessionsData;
import generator.model.EcsSessionsDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsSessionsDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    long countByExample(EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int deleteByExample(EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String sesskey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int insert(EcsSessionsData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int insertSelective(EcsSessionsData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    List<EcsSessionsData> selectByExampleWithBLOBs(EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    List<EcsSessionsData> selectByExample(EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    EcsSessionsData selectByPrimaryKey(String sesskey);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsSessionsData record, @Param("example") EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsSessionsData record, @Param("example") EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsSessionsData record, @Param("example") EcsSessionsDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsSessionsData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsSessionsData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_sessions_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSessionsData record);
}