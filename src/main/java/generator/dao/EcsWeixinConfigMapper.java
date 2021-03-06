package generator.dao;

import generator.model.EcsWeixinConfig;
import generator.model.EcsWeixinConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsWeixinConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    long countByExample(EcsWeixinConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int deleteByExample(EcsWeixinConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int insert(EcsWeixinConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int insertSelective(EcsWeixinConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    List<EcsWeixinConfig> selectByExample(EcsWeixinConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    EcsWeixinConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsWeixinConfig record, @Param("example") EcsWeixinConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsWeixinConfig record, @Param("example") EcsWeixinConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsWeixinConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinConfig record);
}