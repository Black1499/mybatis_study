package com.lzx.generator.model;

import java.util.ArrayList;
import java.util.List;

public class EcsValuecardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public EcsValuecardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
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
     * This method corresponds to the database table ecs_valuecard
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
     * This method corresponds to the database table ecs_valuecard
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_valuecard
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
     * This class corresponds to the database table ecs_valuecard
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

        public Criteria andVcIdIsNull() {
            addCriterion("vc_id is null");
            return (Criteria) this;
        }

        public Criteria andVcIdIsNotNull() {
            addCriterion("vc_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdEqualTo(Integer value) {
            addCriterion("vc_id =", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotEqualTo(Integer value) {
            addCriterion("vc_id <>", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdGreaterThan(Integer value) {
            addCriterion("vc_id >", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_id >=", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdLessThan(Integer value) {
            addCriterion("vc_id <", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdLessThanOrEqualTo(Integer value) {
            addCriterion("vc_id <=", value, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdIn(List<Integer> values) {
            addCriterion("vc_id in", values, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotIn(List<Integer> values) {
            addCriterion("vc_id not in", values, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdBetween(Integer value1, Integer value2) {
            addCriterion("vc_id between", value1, value2, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_id not between", value1, value2, "vcId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdIsNull() {
            addCriterion("vc_type_id is null");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdIsNotNull() {
            addCriterion("vc_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdEqualTo(Byte value) {
            addCriterion("vc_type_id =", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdNotEqualTo(Byte value) {
            addCriterion("vc_type_id <>", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdGreaterThan(Byte value) {
            addCriterion("vc_type_id >", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("vc_type_id >=", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdLessThan(Byte value) {
            addCriterion("vc_type_id <", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("vc_type_id <=", value, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdIn(List<Byte> values) {
            addCriterion("vc_type_id in", values, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdNotIn(List<Byte> values) {
            addCriterion("vc_type_id not in", values, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("vc_type_id between", value1, value2, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("vc_type_id not between", value1, value2, "vcTypeId");
            return (Criteria) this;
        }

        public Criteria andVcSnIsNull() {
            addCriterion("vc_sn is null");
            return (Criteria) this;
        }

        public Criteria andVcSnIsNotNull() {
            addCriterion("vc_sn is not null");
            return (Criteria) this;
        }

        public Criteria andVcSnEqualTo(Long value) {
            addCriterion("vc_sn =", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnNotEqualTo(Long value) {
            addCriterion("vc_sn <>", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnGreaterThan(Long value) {
            addCriterion("vc_sn >", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnGreaterThanOrEqualTo(Long value) {
            addCriterion("vc_sn >=", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnLessThan(Long value) {
            addCriterion("vc_sn <", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnLessThanOrEqualTo(Long value) {
            addCriterion("vc_sn <=", value, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnIn(List<Long> values) {
            addCriterion("vc_sn in", values, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnNotIn(List<Long> values) {
            addCriterion("vc_sn not in", values, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnBetween(Long value1, Long value2) {
            addCriterion("vc_sn between", value1, value2, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcSnNotBetween(Long value1, Long value2) {
            addCriterion("vc_sn not between", value1, value2, "vcSn");
            return (Criteria) this;
        }

        public Criteria andVcPwdIsNull() {
            addCriterion("vc_pwd is null");
            return (Criteria) this;
        }

        public Criteria andVcPwdIsNotNull() {
            addCriterion("vc_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andVcPwdEqualTo(String value) {
            addCriterion("vc_pwd =", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdNotEqualTo(String value) {
            addCriterion("vc_pwd <>", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdGreaterThan(String value) {
            addCriterion("vc_pwd >", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_pwd >=", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdLessThan(String value) {
            addCriterion("vc_pwd <", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdLessThanOrEqualTo(String value) {
            addCriterion("vc_pwd <=", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdLike(String value) {
            addCriterion("vc_pwd like", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdNotLike(String value) {
            addCriterion("vc_pwd not like", value, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdIn(List<String> values) {
            addCriterion("vc_pwd in", values, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdNotIn(List<String> values) {
            addCriterion("vc_pwd not in", values, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdBetween(String value1, String value2) {
            addCriterion("vc_pwd between", value1, value2, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andVcPwdNotBetween(String value1, String value2) {
            addCriterion("vc_pwd not between", value1, value2, "vcPwd");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNull() {
            addCriterion("used_time is null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNotNull() {
            addCriterion("used_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeEqualTo(Integer value) {
            addCriterion("used_time =", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotEqualTo(Integer value) {
            addCriterion("used_time <>", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThan(Integer value) {
            addCriterion("used_time >", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_time >=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThan(Integer value) {
            addCriterion("used_time <", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("used_time <=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIn(List<Integer> values) {
            addCriterion("used_time in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotIn(List<Integer> values) {
            addCriterion("used_time not in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeBetween(Integer value1, Integer value2) {
            addCriterion("used_time between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("used_time not between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_valuecard
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
     * This class corresponds to the database table ecs_valuecard
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