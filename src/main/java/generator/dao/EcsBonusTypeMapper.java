package generator.dao;

import generator.model.EcsBonusType;
import generator.model.EcsBonusTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsBonusTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    long countByExample(EcsBonusTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int deleteByExample(EcsBonusTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int insert(EcsBonusType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int insertSelective(EcsBonusType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    List<EcsBonusType> selectByExample(EcsBonusTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    EcsBonusType selectByPrimaryKey(Short typeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsBonusType record, @Param("example") EcsBonusTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsBonusType record, @Param("example") EcsBonusTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsBonusType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsBonusType record);
}