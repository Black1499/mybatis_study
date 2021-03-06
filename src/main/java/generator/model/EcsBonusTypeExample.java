package generator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EcsBonusTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public EcsBonusTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Short value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Short value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Short value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Short value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Short value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Short> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Short> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Short value1, Short value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Short value1, Short value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIsNull() {
            addCriterion("type_money is null");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIsNotNull() {
            addCriterion("type_money is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyEqualTo(BigDecimal value) {
            addCriterion("type_money =", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("type_money <>", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyGreaterThan(BigDecimal value) {
            addCriterion("type_money >", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_money >=", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyLessThan(BigDecimal value) {
            addCriterion("type_money <", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_money <=", value, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyIn(List<BigDecimal> values) {
            addCriterion("type_money in", values, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("type_money not in", values, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_money between", value1, value2, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andTypeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_money not between", value1, value2, "typeMoney");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Byte value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Byte value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Byte value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Byte value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Byte value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Byte> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Byte> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Byte value1, Byte value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNull() {
            addCriterion("min_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNotNull() {
            addCriterion("min_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinAmountEqualTo(BigDecimal value) {
            addCriterion("min_amount =", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotEqualTo(BigDecimal value) {
            addCriterion("min_amount <>", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThan(BigDecimal value) {
            addCriterion("min_amount >", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amount >=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThan(BigDecimal value) {
            addCriterion("min_amount <", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_amount <=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountIn(List<BigDecimal> values) {
            addCriterion("min_amount in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotIn(List<BigDecimal> values) {
            addCriterion("min_amount not in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amount between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_amount not between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNull() {
            addCriterion("max_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNotNull() {
            addCriterion("max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountEqualTo(BigDecimal value) {
            addCriterion("max_amount =", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("max_amount <>", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThan(BigDecimal value) {
            addCriterion("max_amount >", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_amount >=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThan(BigDecimal value) {
            addCriterion("max_amount <", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_amount <=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIn(List<BigDecimal> values) {
            addCriterion("max_amount in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("max_amount not in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_amount between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_amount not between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andSendStartDateIsNull() {
            addCriterion("send_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSendStartDateIsNotNull() {
            addCriterion("send_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendStartDateEqualTo(Integer value) {
            addCriterion("send_start_date =", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateNotEqualTo(Integer value) {
            addCriterion("send_start_date <>", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateGreaterThan(Integer value) {
            addCriterion("send_start_date >", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_start_date >=", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateLessThan(Integer value) {
            addCriterion("send_start_date <", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("send_start_date <=", value, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateIn(List<Integer> values) {
            addCriterion("send_start_date in", values, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateNotIn(List<Integer> values) {
            addCriterion("send_start_date not in", values, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateBetween(Integer value1, Integer value2) {
            addCriterion("send_start_date between", value1, value2, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("send_start_date not between", value1, value2, "sendStartDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateIsNull() {
            addCriterion("send_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSendEndDateIsNotNull() {
            addCriterion("send_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendEndDateEqualTo(Integer value) {
            addCriterion("send_end_date =", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateNotEqualTo(Integer value) {
            addCriterion("send_end_date <>", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateGreaterThan(Integer value) {
            addCriterion("send_end_date >", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_end_date >=", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateLessThan(Integer value) {
            addCriterion("send_end_date <", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("send_end_date <=", value, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateIn(List<Integer> values) {
            addCriterion("send_end_date in", values, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateNotIn(List<Integer> values) {
            addCriterion("send_end_date not in", values, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateBetween(Integer value1, Integer value2) {
            addCriterion("send_end_date between", value1, value2, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andSendEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("send_end_date not between", value1, value2, "sendEndDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNull() {
            addCriterion("use_start_date is null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIsNotNull() {
            addCriterion("use_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartDateEqualTo(Integer value) {
            addCriterion("use_start_date =", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotEqualTo(Integer value) {
            addCriterion("use_start_date <>", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThan(Integer value) {
            addCriterion("use_start_date >", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_start_date >=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThan(Integer value) {
            addCriterion("use_start_date <", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("use_start_date <=", value, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateIn(List<Integer> values) {
            addCriterion("use_start_date in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotIn(List<Integer> values) {
            addCriterion("use_start_date not in", values, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateBetween(Integer value1, Integer value2) {
            addCriterion("use_start_date between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("use_start_date not between", value1, value2, "useStartDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateIsNull() {
            addCriterion("use_end_date is null");
            return (Criteria) this;
        }

        public Criteria andUseEndDateIsNotNull() {
            addCriterion("use_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndDateEqualTo(Integer value) {
            addCriterion("use_end_date =", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateNotEqualTo(Integer value) {
            addCriterion("use_end_date <>", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateGreaterThan(Integer value) {
            addCriterion("use_end_date >", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_end_date >=", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateLessThan(Integer value) {
            addCriterion("use_end_date <", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("use_end_date <=", value, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateIn(List<Integer> values) {
            addCriterion("use_end_date in", values, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateNotIn(List<Integer> values) {
            addCriterion("use_end_date not in", values, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateBetween(Integer value1, Integer value2) {
            addCriterion("use_end_date between", value1, value2, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andUseEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("use_end_date not between", value1, value2, "useEndDate");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIsNull() {
            addCriterion("min_goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIsNotNull() {
            addCriterion("min_goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount =", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount <>", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("min_goods_amount >", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount >=", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountLessThan(BigDecimal value) {
            addCriterion("min_goods_amount <", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_goods_amount <=", value, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("min_goods_amount in", values, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("min_goods_amount not in", values, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_goods_amount between", value1, value2, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andMinGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_goods_amount not between", value1, value2, "minGoodsAmount");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andBonusCodeIsNull() {
            addCriterion("bonus_code is null");
            return (Criteria) this;
        }

        public Criteria andBonusCodeIsNotNull() {
            addCriterion("bonus_code is not null");
            return (Criteria) this;
        }

        public Criteria andBonusCodeEqualTo(String value) {
            addCriterion("bonus_code =", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeNotEqualTo(String value) {
            addCriterion("bonus_code <>", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeGreaterThan(String value) {
            addCriterion("bonus_code >", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bonus_code >=", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeLessThan(String value) {
            addCriterion("bonus_code <", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeLessThanOrEqualTo(String value) {
            addCriterion("bonus_code <=", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeLike(String value) {
            addCriterion("bonus_code like", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeNotLike(String value) {
            addCriterion("bonus_code not like", value, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeIn(List<String> values) {
            addCriterion("bonus_code in", values, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeNotIn(List<String> values) {
            addCriterion("bonus_code not in", values, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeBetween(String value1, String value2) {
            addCriterion("bonus_code between", value1, value2, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andBonusCodeNotBetween(String value1, String value2) {
            addCriterion("bonus_code not between", value1, value2, "bonusCode");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxIsNull() {
            addCriterion("user_bonus_max is null");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxIsNotNull() {
            addCriterion("user_bonus_max is not null");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxEqualTo(Integer value) {
            addCriterion("user_bonus_max =", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxNotEqualTo(Integer value) {
            addCriterion("user_bonus_max <>", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxGreaterThan(Integer value) {
            addCriterion("user_bonus_max >", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_bonus_max >=", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxLessThan(Integer value) {
            addCriterion("user_bonus_max <", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxLessThanOrEqualTo(Integer value) {
            addCriterion("user_bonus_max <=", value, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxIn(List<Integer> values) {
            addCriterion("user_bonus_max in", values, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxNotIn(List<Integer> values) {
            addCriterion("user_bonus_max not in", values, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxBetween(Integer value1, Integer value2) {
            addCriterion("user_bonus_max between", value1, value2, "userBonusMax");
            return (Criteria) this;
        }

        public Criteria andUserBonusMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("user_bonus_max not between", value1, value2, "userBonusMax");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_bonus_type
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}