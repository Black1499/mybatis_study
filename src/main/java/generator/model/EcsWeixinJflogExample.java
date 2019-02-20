package generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EcsWeixinJflogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public EcsWeixinJflogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
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
     * This method corresponds to the database table ecs_weixin_jflog
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
     * This method corresponds to the database table ecs_weixin_jflog
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_jflog
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
     * This class corresponds to the database table ecs_weixin_jflog
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFakeIdIsNull() {
            addCriterion("fake_id is null");
            return (Criteria) this;
        }

        public Criteria andFakeIdIsNotNull() {
            addCriterion("fake_id is not null");
            return (Criteria) this;
        }

        public Criteria andFakeIdEqualTo(String value) {
            addCriterion("fake_id =", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdNotEqualTo(String value) {
            addCriterion("fake_id <>", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdGreaterThan(String value) {
            addCriterion("fake_id >", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdGreaterThanOrEqualTo(String value) {
            addCriterion("fake_id >=", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdLessThan(String value) {
            addCriterion("fake_id <", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdLessThanOrEqualTo(String value) {
            addCriterion("fake_id <=", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdLike(String value) {
            addCriterion("fake_id like", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdNotLike(String value) {
            addCriterion("fake_id not like", value, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdIn(List<String> values) {
            addCriterion("fake_id in", values, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdNotIn(List<String> values) {
            addCriterion("fake_id not in", values, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdBetween(String value1, String value2) {
            addCriterion("fake_id between", value1, value2, "fakeId");
            return (Criteria) this;
        }

        public Criteria andFakeIdNotBetween(String value1, String value2) {
            addCriterion("fake_id not between", value1, value2, "fakeId");
            return (Criteria) this;
        }

        public Criteria andJfTypeIsNull() {
            addCriterion("jf_type is null");
            return (Criteria) this;
        }

        public Criteria andJfTypeIsNotNull() {
            addCriterion("jf_type is not null");
            return (Criteria) this;
        }

        public Criteria andJfTypeEqualTo(Integer value) {
            addCriterion("jf_type =", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeNotEqualTo(Integer value) {
            addCriterion("jf_type <>", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeGreaterThan(Integer value) {
            addCriterion("jf_type >", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jf_type >=", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeLessThan(Integer value) {
            addCriterion("jf_type <", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeLessThanOrEqualTo(Integer value) {
            addCriterion("jf_type <=", value, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeIn(List<Integer> values) {
            addCriterion("jf_type in", values, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeNotIn(List<Integer> values) {
            addCriterion("jf_type not in", values, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeBetween(Integer value1, Integer value2) {
            addCriterion("jf_type between", value1, value2, "jfType");
            return (Criteria) this;
        }

        public Criteria andJfTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("jf_type not between", value1, value2, "jfType");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNull() {
            addCriterion("key_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("key_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(Integer value) {
            addCriterion("key_id =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(Integer value) {
            addCriterion("key_id <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(Integer value) {
            addCriterion("key_id >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_id >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(Integer value) {
            addCriterion("key_id <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(Integer value) {
            addCriterion("key_id <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<Integer> values) {
            addCriterion("key_id in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<Integer> values) {
            addCriterion("key_id not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(Integer value1, Integer value2) {
            addCriterion("key_id between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("key_id not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateymdIsNull() {
            addCriterion("createymd is null");
            return (Criteria) this;
        }

        public Criteria andCreateymdIsNotNull() {
            addCriterion("createymd is not null");
            return (Criteria) this;
        }

        public Criteria andCreateymdEqualTo(Date value) {
            addCriterionForJDBCDate("createymd =", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdNotEqualTo(Date value) {
            addCriterionForJDBCDate("createymd <>", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdGreaterThan(Date value) {
            addCriterionForJDBCDate("createymd >", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createymd >=", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdLessThan(Date value) {
            addCriterionForJDBCDate("createymd <", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createymd <=", value, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdIn(List<Date> values) {
            addCriterionForJDBCDate("createymd in", values, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdNotIn(List<Date> values) {
            addCriterionForJDBCDate("createymd not in", values, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createymd between", value1, value2, "createymd");
            return (Criteria) this;
        }

        public Criteria andCreateymdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createymd not between", value1, value2, "createymd");
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

        public Criteria andNumEqualTo(Byte value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Byte value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Byte value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Byte value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Byte value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Byte> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Byte> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Byte value1, Byte value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Byte value1, Byte value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_weixin_jflog
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
     * This class corresponds to the database table ecs_weixin_jflog
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