package com.lzx.generator.model;

import java.util.ArrayList;
import java.util.List;

public class EcsVerifycodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public EcsVerifycodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
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
     * This method corresponds to the database table ecs_verifycode
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
     * This method corresponds to the database table ecs_verifycode
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_verifycode
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
     * This class corresponds to the database table ecs_verifycode
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andGetipIsNull() {
            addCriterion("getip is null");
            return (Criteria) this;
        }

        public Criteria andGetipIsNotNull() {
            addCriterion("getip is not null");
            return (Criteria) this;
        }

        public Criteria andGetipEqualTo(String value) {
            addCriterion("getip =", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipNotEqualTo(String value) {
            addCriterion("getip <>", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipGreaterThan(String value) {
            addCriterion("getip >", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipGreaterThanOrEqualTo(String value) {
            addCriterion("getip >=", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipLessThan(String value) {
            addCriterion("getip <", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipLessThanOrEqualTo(String value) {
            addCriterion("getip <=", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipLike(String value) {
            addCriterion("getip like", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipNotLike(String value) {
            addCriterion("getip not like", value, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipIn(List<String> values) {
            addCriterion("getip in", values, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipNotIn(List<String> values) {
            addCriterion("getip not in", values, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipBetween(String value1, String value2) {
            addCriterion("getip between", value1, value2, "getip");
            return (Criteria) this;
        }

        public Criteria andGetipNotBetween(String value1, String value2) {
            addCriterion("getip not between", value1, value2, "getip");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIsNull() {
            addCriterion("verifycode is null");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIsNotNull() {
            addCriterion("verifycode is not null");
            return (Criteria) this;
        }

        public Criteria andVerifycodeEqualTo(String value) {
            addCriterion("verifycode =", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotEqualTo(String value) {
            addCriterion("verifycode <>", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeGreaterThan(String value) {
            addCriterion("verifycode >", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeGreaterThanOrEqualTo(String value) {
            addCriterion("verifycode >=", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLessThan(String value) {
            addCriterion("verifycode <", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLessThanOrEqualTo(String value) {
            addCriterion("verifycode <=", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeLike(String value) {
            addCriterion("verifycode like", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotLike(String value) {
            addCriterion("verifycode not like", value, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeIn(List<String> values) {
            addCriterion("verifycode in", values, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotIn(List<String> values) {
            addCriterion("verifycode not in", values, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeBetween(String value1, String value2) {
            addCriterion("verifycode between", value1, value2, "verifycode");
            return (Criteria) this;
        }

        public Criteria andVerifycodeNotBetween(String value1, String value2) {
            addCriterion("verifycode not between", value1, value2, "verifycode");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNull() {
            addCriterion("dateline is null");
            return (Criteria) this;
        }

        public Criteria andDatelineIsNotNull() {
            addCriterion("dateline is not null");
            return (Criteria) this;
        }

        public Criteria andDatelineEqualTo(Integer value) {
            addCriterion("dateline =", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotEqualTo(Integer value) {
            addCriterion("dateline <>", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThan(Integer value) {
            addCriterion("dateline >", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineGreaterThanOrEqualTo(Integer value) {
            addCriterion("dateline >=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThan(Integer value) {
            addCriterion("dateline <", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineLessThanOrEqualTo(Integer value) {
            addCriterion("dateline <=", value, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineIn(List<Integer> values) {
            addCriterion("dateline in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotIn(List<Integer> values) {
            addCriterion("dateline not in", values, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineBetween(Integer value1, Integer value2) {
            addCriterion("dateline between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andDatelineNotBetween(Integer value1, Integer value2) {
            addCriterion("dateline not between", value1, value2, "dateline");
            return (Criteria) this;
        }

        public Criteria andReguidIsNull() {
            addCriterion("reguid is null");
            return (Criteria) this;
        }

        public Criteria andReguidIsNotNull() {
            addCriterion("reguid is not null");
            return (Criteria) this;
        }

        public Criteria andReguidEqualTo(Integer value) {
            addCriterion("reguid =", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidNotEqualTo(Integer value) {
            addCriterion("reguid <>", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidGreaterThan(Integer value) {
            addCriterion("reguid >", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reguid >=", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidLessThan(Integer value) {
            addCriterion("reguid <", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidLessThanOrEqualTo(Integer value) {
            addCriterion("reguid <=", value, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidIn(List<Integer> values) {
            addCriterion("reguid in", values, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidNotIn(List<Integer> values) {
            addCriterion("reguid not in", values, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidBetween(Integer value1, Integer value2) {
            addCriterion("reguid between", value1, value2, "reguid");
            return (Criteria) this;
        }

        public Criteria andReguidNotBetween(Integer value1, Integer value2) {
            addCriterion("reguid not between", value1, value2, "reguid");
            return (Criteria) this;
        }

        public Criteria andRegdatelineIsNull() {
            addCriterion("regdateline is null");
            return (Criteria) this;
        }

        public Criteria andRegdatelineIsNotNull() {
            addCriterion("regdateline is not null");
            return (Criteria) this;
        }

        public Criteria andRegdatelineEqualTo(Integer value) {
            addCriterion("regdateline =", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineNotEqualTo(Integer value) {
            addCriterion("regdateline <>", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineGreaterThan(Integer value) {
            addCriterion("regdateline >", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineGreaterThanOrEqualTo(Integer value) {
            addCriterion("regdateline >=", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineLessThan(Integer value) {
            addCriterion("regdateline <", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineLessThanOrEqualTo(Integer value) {
            addCriterion("regdateline <=", value, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineIn(List<Integer> values) {
            addCriterion("regdateline in", values, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineNotIn(List<Integer> values) {
            addCriterion("regdateline not in", values, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineBetween(Integer value1, Integer value2) {
            addCriterion("regdateline between", value1, value2, "regdateline");
            return (Criteria) this;
        }

        public Criteria andRegdatelineNotBetween(Integer value1, Integer value2) {
            addCriterion("regdateline not between", value1, value2, "regdateline");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(byte[] value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(byte[] value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(byte[] value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(byte[] value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(byte[] value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(byte[] value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<byte[]> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<byte[]> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(byte[] value1, byte[] value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(byte[] value1, byte[] value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_verifycode
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
     * This class corresponds to the database table ecs_verifycode
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