package generator.dao;

import generator.model.EcsAffiliateLog;
import generator.model.EcsAffiliateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsAffiliateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    long countByExample(EcsAffiliateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int deleteByExample(EcsAffiliateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int insert(EcsAffiliateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int insertSelective(EcsAffiliateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    List<EcsAffiliateLog> selectByExample(EcsAffiliateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    EcsAffiliateLog selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsAffiliateLog record, @Param("example") EcsAffiliateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsAffiliateLog record, @Param("example") EcsAffiliateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsAffiliateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_affiliate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAffiliateLog record);
}