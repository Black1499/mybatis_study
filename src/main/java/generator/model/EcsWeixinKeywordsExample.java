package generator.model;

import java.util.ArrayList;
import java.util.List;

public class EcsWeixinKeywordsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public EcsWeixinKeywordsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
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
     * This method corresponds to the database table ecs_weixin_keywords
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
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
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
     * This class corresponds to the database table ecs_weixin_keywords
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

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeysIsNull() {
            addCriterion("keys is null");
            return (Criteria) this;
        }

        public Criteria andKeysIsNotNull() {
            addCriterion("keys is not null");
            return (Criteria) this;
        }

        public Criteria andKeysEqualTo(String value) {
            addCriterion("keys =", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotEqualTo(String value) {
            addCriterion("keys <>", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysGreaterThan(String value) {
            addCriterion("keys >", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysGreaterThanOrEqualTo(String value) {
            addCriterion("keys >=", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLessThan(String value) {
            addCriterion("keys <", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLessThanOrEqualTo(String value) {
            addCriterion("keys <=", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysLike(String value) {
            addCriterion("keys like", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotLike(String value) {
            addCriterion("keys not like", value, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysIn(List<String> values) {
            addCriterion("keys in", values, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotIn(List<String> values) {
            addCriterion("keys not in", values, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysBetween(String value1, String value2) {
            addCriterion("keys between", value1, value2, "keys");
            return (Criteria) this;
        }

        public Criteria andKeysNotBetween(String value1, String value2) {
            addCriterion("keys not between", value1, value2, "keys");
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

        public Criteria andJfNumIsNull() {
            addCriterion("jf_num is null");
            return (Criteria) this;
        }

        public Criteria andJfNumIsNotNull() {
            addCriterion("jf_num is not null");
            return (Criteria) this;
        }

        public Criteria andJfNumEqualTo(Integer value) {
            addCriterion("jf_num =", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumNotEqualTo(Integer value) {
            addCriterion("jf_num <>", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumGreaterThan(Integer value) {
            addCriterion("jf_num >", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("jf_num >=", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumLessThan(Integer value) {
            addCriterion("jf_num <", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumLessThanOrEqualTo(Integer value) {
            addCriterion("jf_num <=", value, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumIn(List<Integer> values) {
            addCriterion("jf_num in", values, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumNotIn(List<Integer> values) {
            addCriterion("jf_num not in", values, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumBetween(Integer value1, Integer value2) {
            addCriterion("jf_num between", value1, value2, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfNumNotBetween(Integer value1, Integer value2) {
            addCriterion("jf_num not between", value1, value2, "jfNum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumIsNull() {
            addCriterion("jf_maxnum is null");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumIsNotNull() {
            addCriterion("jf_maxnum is not null");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumEqualTo(Integer value) {
            addCriterion("jf_maxnum =", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumNotEqualTo(Integer value) {
            addCriterion("jf_maxnum <>", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumGreaterThan(Integer value) {
            addCriterion("jf_maxnum >", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("jf_maxnum >=", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumLessThan(Integer value) {
            addCriterion("jf_maxnum <", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("jf_maxnum <=", value, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumIn(List<Integer> values) {
            addCriterion("jf_maxnum in", values, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumNotIn(List<Integer> values) {
            addCriterion("jf_maxnum not in", values, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("jf_maxnum between", value1, value2, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andJfMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("jf_maxnum not between", value1, value2, "jfMaxnum");
            return (Criteria) this;
        }

        public Criteria andKeynameIsNull() {
            addCriterion("keyname is null");
            return (Criteria) this;
        }

        public Criteria andKeynameIsNotNull() {
            addCriterion("keyname is not null");
            return (Criteria) this;
        }

        public Criteria andKeynameEqualTo(String value) {
            addCriterion("keyname =", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameNotEqualTo(String value) {
            addCriterion("keyname <>", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameGreaterThan(String value) {
            addCriterion("keyname >", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameGreaterThanOrEqualTo(String value) {
            addCriterion("keyname >=", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameLessThan(String value) {
            addCriterion("keyname <", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameLessThanOrEqualTo(String value) {
            addCriterion("keyname <=", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameLike(String value) {
            addCriterion("keyname like", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameNotLike(String value) {
            addCriterion("keyname not like", value, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameIn(List<String> values) {
            addCriterion("keyname in", values, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameNotIn(List<String> values) {
            addCriterion("keyname not in", values, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameBetween(String value1, String value2) {
            addCriterion("keyname between", value1, value2, "keyname");
            return (Criteria) this;
        }

        public Criteria andKeynameNotBetween(String value1, String value2) {
            addCriterion("keyname not between", value1, value2, "keyname");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andDiyTypeIsNull() {
            addCriterion("diy_type is null");
            return (Criteria) this;
        }

        public Criteria andDiyTypeIsNotNull() {
            addCriterion("diy_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiyTypeEqualTo(Integer value) {
            addCriterion("diy_type =", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeNotEqualTo(Integer value) {
            addCriterion("diy_type <>", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeGreaterThan(Integer value) {
            addCriterion("diy_type >", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("diy_type >=", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeLessThan(Integer value) {
            addCriterion("diy_type <", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("diy_type <=", value, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeIn(List<Integer> values) {
            addCriterion("diy_type in", values, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeNotIn(List<Integer> values) {
            addCriterion("diy_type not in", values, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeBetween(Integer value1, Integer value2) {
            addCriterion("diy_type between", value1, value2, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("diy_type not between", value1, value2, "diyType");
            return (Criteria) this;
        }

        public Criteria andDiyValueIsNull() {
            addCriterion("diy_value is null");
            return (Criteria) this;
        }

        public Criteria andDiyValueIsNotNull() {
            addCriterion("diy_value is not null");
            return (Criteria) this;
        }

        public Criteria andDiyValueEqualTo(String value) {
            addCriterion("diy_value =", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueNotEqualTo(String value) {
            addCriterion("diy_value <>", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueGreaterThan(String value) {
            addCriterion("diy_value >", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueGreaterThanOrEqualTo(String value) {
            addCriterion("diy_value >=", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueLessThan(String value) {
            addCriterion("diy_value <", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueLessThanOrEqualTo(String value) {
            addCriterion("diy_value <=", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueLike(String value) {
            addCriterion("diy_value like", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueNotLike(String value) {
            addCriterion("diy_value not like", value, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueIn(List<String> values) {
            addCriterion("diy_value in", values, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueNotIn(List<String> values) {
            addCriterion("diy_value not in", values, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueBetween(String value1, String value2) {
            addCriterion("diy_value between", value1, value2, "diyValue");
            return (Criteria) this;
        }

        public Criteria andDiyValueNotBetween(String value1, String value2) {
            addCriterion("diy_value not between", value1, value2, "diyValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_weixin_keywords
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
     * This class corresponds to the database table ecs_weixin_keywords
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