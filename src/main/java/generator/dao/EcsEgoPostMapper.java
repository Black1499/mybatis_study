package generator.dao;

import generator.model.EcsEgoPost;
import generator.model.EcsEgoPostExample;
import generator.model.EcsEgoPostWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEgoPostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    long countByExample(EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int insert(EcsEgoPostWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int insertSelective(EcsEgoPostWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    List<EcsEgoPostWithBLOBs> selectByExampleWithBLOBs(EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    List<EcsEgoPost> selectByExample(EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    EcsEgoPostWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEgoPostWithBLOBs record, @Param("example") EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") EcsEgoPostWithBLOBs record, @Param("example") EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEgoPost record, @Param("example") EcsEgoPostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEgoPostWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(EcsEgoPostWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_post
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoPost record);
}