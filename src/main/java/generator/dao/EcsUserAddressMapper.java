package generator.dao;

import generator.model.EcsUserAddress;
import generator.model.EcsUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsUserAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    long countByExample(EcsUserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int deleteByExample(EcsUserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer addressId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int insert(EcsUserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int insertSelective(EcsUserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    List<EcsUserAddress> selectByExample(EcsUserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    EcsUserAddress selectByPrimaryKey(Integer addressId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EcsUserAddress record, @Param("example") EcsUserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EcsUserAddress record, @Param("example") EcsUserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EcsUserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUserAddress record);
}