package generator.model;

import java.util.ArrayList;
import java.util.List;

public class EcsChatCustomerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public EcsChatCustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
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
     * This method corresponds to the database table ecs_chat_customer
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
     * This method corresponds to the database table ecs_chat_customer
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_chat_customer
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
     * This class corresponds to the database table ecs_chat_customer
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

        public Criteria andCusIdIsNull() {
            addCriterion("cus_id is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("cus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Integer value) {
            addCriterion("cus_id =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Integer value) {
            addCriterion("cus_id <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Integer value) {
            addCriterion("cus_id >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_id >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Integer value) {
            addCriterion("cus_id <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Integer value) {
            addCriterion("cus_id <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Integer> values) {
            addCriterion("cus_id in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Integer> values) {
            addCriterion("cus_id not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Integer value1, Integer value2) {
            addCriterion("cus_id between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_id not between", value1, value2, "cusId");
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

        public Criteria andOfUsernameIsNull() {
            addCriterion("of_username is null");
            return (Criteria) this;
        }

        public Criteria andOfUsernameIsNotNull() {
            addCriterion("of_username is not null");
            return (Criteria) this;
        }

        public Criteria andOfUsernameEqualTo(String value) {
            addCriterion("of_username =", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameNotEqualTo(String value) {
            addCriterion("of_username <>", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameGreaterThan(String value) {
            addCriterion("of_username >", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("of_username >=", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameLessThan(String value) {
            addCriterion("of_username <", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameLessThanOrEqualTo(String value) {
            addCriterion("of_username <=", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameLike(String value) {
            addCriterion("of_username like", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameNotLike(String value) {
            addCriterion("of_username not like", value, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameIn(List<String> values) {
            addCriterion("of_username in", values, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameNotIn(List<String> values) {
            addCriterion("of_username not in", values, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameBetween(String value1, String value2) {
            addCriterion("of_username between", value1, value2, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andOfUsernameNotBetween(String value1, String value2) {
            addCriterion("of_username not between", value1, value2, "ofUsername");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNull() {
            addCriterion("supp_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNotNull() {
            addCriterion("supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIdEqualTo(Integer value) {
            addCriterion("supp_id =", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotEqualTo(Integer value) {
            addCriterion("supp_id <>", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThan(Integer value) {
            addCriterion("supp_id >", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supp_id >=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThan(Integer value) {
            addCriterion("supp_id <", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThanOrEqualTo(Integer value) {
            addCriterion("supp_id <=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIn(List<Integer> values) {
            addCriterion("supp_id in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotIn(List<Integer> values) {
            addCriterion("supp_id not in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdBetween(Integer value1, Integer value2) {
            addCriterion("supp_id between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supp_id not between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNull() {
            addCriterion("cus_type is null");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNotNull() {
            addCriterion("cus_type is not null");
            return (Criteria) this;
        }

        public Criteria andCusTypeEqualTo(Integer value) {
            addCriterion("cus_type =", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotEqualTo(Integer value) {
            addCriterion("cus_type <>", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThan(Integer value) {
            addCriterion("cus_type >", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_type >=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThan(Integer value) {
            addCriterion("cus_type <", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cus_type <=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeIn(List<Integer> values) {
            addCriterion("cus_type in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotIn(List<Integer> values) {
            addCriterion("cus_type not in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeBetween(Integer value1, Integer value2) {
            addCriterion("cus_type between", value1, value2, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_type not between", value1, value2, "cusType");
            return (Criteria) this;
        }

        public Criteria andSessionCountIsNull() {
            addCriterion("session_count is null");
            return (Criteria) this;
        }

        public Criteria andSessionCountIsNotNull() {
            addCriterion("session_count is not null");
            return (Criteria) this;
        }

        public Criteria andSessionCountEqualTo(Integer value) {
            addCriterion("session_count =", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotEqualTo(Integer value) {
            addCriterion("session_count <>", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountGreaterThan(Integer value) {
            addCriterion("session_count >", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_count >=", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountLessThan(Integer value) {
            addCriterion("session_count <", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountLessThanOrEqualTo(Integer value) {
            addCriterion("session_count <=", value, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountIn(List<Integer> values) {
            addCriterion("session_count in", values, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotIn(List<Integer> values) {
            addCriterion("session_count not in", values, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountBetween(Integer value1, Integer value2) {
            addCriterion("session_count between", value1, value2, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andSessionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("session_count not between", value1, value2, "sessionCount");
            return (Criteria) this;
        }

        public Criteria andTalkTimeIsNull() {
            addCriterion("talk_time is null");
            return (Criteria) this;
        }

        public Criteria andTalkTimeIsNotNull() {
            addCriterion("talk_time is not null");
            return (Criteria) this;
        }

        public Criteria andTalkTimeEqualTo(Integer value) {
            addCriterion("talk_time =", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeNotEqualTo(Integer value) {
            addCriterion("talk_time <>", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeGreaterThan(Integer value) {
            addCriterion("talk_time >", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("talk_time >=", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeLessThan(Integer value) {
            addCriterion("talk_time <", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeLessThanOrEqualTo(Integer value) {
            addCriterion("talk_time <=", value, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeIn(List<Integer> values) {
            addCriterion("talk_time in", values, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeNotIn(List<Integer> values) {
            addCriterion("talk_time not in", values, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeBetween(Integer value1, Integer value2) {
            addCriterion("talk_time between", value1, value2, "talkTime");
            return (Criteria) this;
        }

        public Criteria andTalkTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("talk_time not between", value1, value2, "talkTime");
            return (Criteria) this;
        }

        public Criteria andCusDegreeIsNull() {
            addCriterion("cus_degree is null");
            return (Criteria) this;
        }

        public Criteria andCusDegreeIsNotNull() {
            addCriterion("cus_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCusDegreeEqualTo(Integer value) {
            addCriterion("cus_degree =", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeNotEqualTo(Integer value) {
            addCriterion("cus_degree <>", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeGreaterThan(Integer value) {
            addCriterion("cus_degree >", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_degree >=", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeLessThan(Integer value) {
            addCriterion("cus_degree <", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("cus_degree <=", value, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeIn(List<Integer> values) {
            addCriterion("cus_degree in", values, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeNotIn(List<Integer> values) {
            addCriterion("cus_degree not in", values, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeBetween(Integer value1, Integer value2) {
            addCriterion("cus_degree between", value1, value2, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_degree not between", value1, value2, "cusDegree");
            return (Criteria) this;
        }

        public Criteria andCusEnableIsNull() {
            addCriterion("cus_enable is null");
            return (Criteria) this;
        }

        public Criteria andCusEnableIsNotNull() {
            addCriterion("cus_enable is not null");
            return (Criteria) this;
        }

        public Criteria andCusEnableEqualTo(Integer value) {
            addCriterion("cus_enable =", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableNotEqualTo(Integer value) {
            addCriterion("cus_enable <>", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableGreaterThan(Integer value) {
            addCriterion("cus_enable >", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_enable >=", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableLessThan(Integer value) {
            addCriterion("cus_enable <", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableLessThanOrEqualTo(Integer value) {
            addCriterion("cus_enable <=", value, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableIn(List<Integer> values) {
            addCriterion("cus_enable in", values, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableNotIn(List<Integer> values) {
            addCriterion("cus_enable not in", values, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableBetween(Integer value1, Integer value2) {
            addCriterion("cus_enable between", value1, value2, "cusEnable");
            return (Criteria) this;
        }

        public Criteria andCusEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_enable not between", value1, value2, "cusEnable");
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
     * This class corresponds to the database table ecs_chat_customer
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
     * This class corresponds to the database table ecs_chat_customer
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