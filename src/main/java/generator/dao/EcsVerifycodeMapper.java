package generator.dao;

import generator.model.EcsVerifycode;
import generator.model.EcsVerifycodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsVerifycodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    long countByExample(EcsVerifycodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int deleteByExample(EcsVerifycodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int insert(EcsVerifycode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int insertSelective(EcsVerifycode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    List<EcsVerifycode> selectByExample(EcsVerifycodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    EcsVerifycode selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsVerifycode record, @Param("example") EcsVerifycodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsVerifycode record, @Param("example") EcsVerifycodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsVerifycode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVerifycode record);
}