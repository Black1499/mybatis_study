package generator.dao;

import generator.model.EcsEgoImage;
import generator.model.EcsEgoImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsEgoImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    long countByExample(EcsEgoImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int deleteByExample(EcsEgoImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int insert(EcsEgoImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int insertSelective(EcsEgoImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    List<EcsEgoImage> selectByExample(EcsEgoImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    EcsEgoImage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsEgoImage record, @Param("example") EcsEgoImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsEgoImage record, @Param("example") EcsEgoImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsEgoImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_image
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoImage record);
}