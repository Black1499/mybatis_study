package generator.dao;

import generator.model.EcsMemberPrice;
import generator.model.EcsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsMemberPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    long countByExample(EcsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int deleteByExample(EcsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer priceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int insert(EcsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int insertSelective(EcsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    List<EcsMemberPrice> selectByExample(EcsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    EcsMemberPrice selectByPrimaryKey(Integer priceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsMemberPrice record, @Param("example") EcsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsMemberPrice record, @Param("example") EcsMemberPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsMemberPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_member_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsMemberPrice record);
}