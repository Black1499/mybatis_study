package com.lzx.generator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EcsWeixinActlistExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public EcsWeixinActlistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
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
     * This method corresponds to the database table ecs_weixin_actlist
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
     * This method corresponds to the database table ecs_weixin_actlist
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_actlist
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
     * This class corresponds to the database table ecs_weixin_actlist
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

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAwardnameIsNull() {
            addCriterion("awardname is null");
            return (Criteria) this;
        }

        public Criteria andAwardnameIsNotNull() {
            addCriterion("awardname is not null");
            return (Criteria) this;
        }

        public Criteria andAwardnameEqualTo(String value) {
            addCriterion("awardname =", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotEqualTo(String value) {
            addCriterion("awardname <>", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameGreaterThan(String value) {
            addCriterion("awardname >", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameGreaterThanOrEqualTo(String value) {
            addCriterion("awardname >=", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLessThan(String value) {
            addCriterion("awardname <", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLessThanOrEqualTo(String value) {
            addCriterion("awardname <=", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameLike(String value) {
            addCriterion("awardname like", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotLike(String value) {
            addCriterion("awardname not like", value, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameIn(List<String> values) {
            addCriterion("awardname in", values, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotIn(List<String> values) {
            addCriterion("awardname not in", values, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameBetween(String value1, String value2) {
            addCriterion("awardname between", value1, value2, "awardname");
            return (Criteria) this;
        }

        public Criteria andAwardnameNotBetween(String value1, String value2) {
            addCriterion("awardname not between", value1, value2, "awardname");
            return (Criteria) this;
        }

        public Criteria andRandnumIsNull() {
            addCriterion("randnum is null");
            return (Criteria) this;
        }

        public Criteria andRandnumIsNotNull() {
            addCriterion("randnum is not null");
            return (Criteria) this;
        }

        public Criteria andRandnumEqualTo(BigDecimal value) {
            addCriterion("randnum =", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumNotEqualTo(BigDecimal value) {
            addCriterion("randnum <>", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumGreaterThan(BigDecimal value) {
            addCriterion("randnum >", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("randnum >=", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumLessThan(BigDecimal value) {
            addCriterion("randnum <", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("randnum <=", value, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumIn(List<BigDecimal> values) {
            addCriterion("randnum in", values, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumNotIn(List<BigDecimal> values) {
            addCriterion("randnum not in", values, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("randnum between", value1, value2, "randnum");
            return (Criteria) this;
        }

        public Criteria andRandnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("randnum not between", value1, value2, "randnum");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNum2IsNull() {
            addCriterion("num2 is null");
            return (Criteria) this;
        }

        public Criteria andNum2IsNotNull() {
            addCriterion("num2 is not null");
            return (Criteria) this;
        }

        public Criteria andNum2EqualTo(Integer value) {
            addCriterion("num2 =", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotEqualTo(Integer value) {
            addCriterion("num2 <>", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThan(Integer value) {
            addCriterion("num2 >", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("num2 >=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThan(Integer value) {
            addCriterion("num2 <", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2LessThanOrEqualTo(Integer value) {
            addCriterion("num2 <=", value, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2In(List<Integer> values) {
            addCriterion("num2 in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotIn(List<Integer> values) {
            addCriterion("num2 not in", values, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2Between(Integer value1, Integer value2) {
            addCriterion("num2 between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("num2 not between", value1, value2, "num2");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNull() {
            addCriterion("isopen is null");
            return (Criteria) this;
        }

        public Criteria andIsopenIsNotNull() {
            addCriterion("isopen is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenEqualTo(byte[] value) {
            addCriterion("isopen =", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotEqualTo(byte[] value) {
            addCriterion("isopen <>", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThan(byte[] value) {
            addCriterion("isopen >", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenGreaterThanOrEqualTo(byte[] value) {
            addCriterion("isopen >=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThan(byte[] value) {
            addCriterion("isopen <", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenLessThanOrEqualTo(byte[] value) {
            addCriterion("isopen <=", value, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenIn(List<byte[]> values) {
            addCriterion("isopen in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotIn(List<byte[]> values) {
            addCriterion("isopen not in", values, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenBetween(byte[] value1, byte[] value2) {
            addCriterion("isopen between", value1, value2, "isopen");
            return (Criteria) this;
        }

        public Criteria andIsopenNotBetween(byte[] value1, byte[] value2) {
            addCriterion("isopen not between", value1, value2, "isopen");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_weixin_actlist
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
     * This class corresponds to the database table ecs_weixin_actlist
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