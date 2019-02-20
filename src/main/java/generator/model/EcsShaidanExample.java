package generator.model;

import java.util.ArrayList;
import java.util.List;

public class EcsShaidanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public EcsShaidanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
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
     * This method corresponds to the database table ecs_shaidan
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
     * This method corresponds to the database table ecs_shaidan
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shaidan
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
     * This class corresponds to the database table ecs_shaidan
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

        public Criteria andShaidanIdIsNull() {
            addCriterion("shaidan_id is null");
            return (Criteria) this;
        }

        public Criteria andShaidanIdIsNotNull() {
            addCriterion("shaidan_id is not null");
            return (Criteria) this;
        }

        public Criteria andShaidanIdEqualTo(Integer value) {
            addCriterion("shaidan_id =", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdNotEqualTo(Integer value) {
            addCriterion("shaidan_id <>", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdGreaterThan(Integer value) {
            addCriterion("shaidan_id >", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shaidan_id >=", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdLessThan(Integer value) {
            addCriterion("shaidan_id <", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdLessThanOrEqualTo(Integer value) {
            addCriterion("shaidan_id <=", value, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdIn(List<Integer> values) {
            addCriterion("shaidan_id in", values, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdNotIn(List<Integer> values) {
            addCriterion("shaidan_id not in", values, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdBetween(Integer value1, Integer value2) {
            addCriterion("shaidan_id between", value1, value2, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andShaidanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shaidan_id not between", value1, value2, "shaidanId");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRecIdIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecIdEqualTo(Integer value) {
            addCriterion("rec_id =", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThan(Integer value) {
            addCriterion("rec_id <", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdIn(List<Integer> values) {
            addCriterion("rec_id in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "recId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andHideUsernameIsNull() {
            addCriterion("hide_username is null");
            return (Criteria) this;
        }

        public Criteria andHideUsernameIsNotNull() {
            addCriterion("hide_username is not null");
            return (Criteria) this;
        }

        public Criteria andHideUsernameEqualTo(byte[] value) {
            addCriterion("hide_username =", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameNotEqualTo(byte[] value) {
            addCriterion("hide_username <>", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameGreaterThan(byte[] value) {
            addCriterion("hide_username >", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameGreaterThanOrEqualTo(byte[] value) {
            addCriterion("hide_username >=", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameLessThan(byte[] value) {
            addCriterion("hide_username <", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameLessThanOrEqualTo(byte[] value) {
            addCriterion("hide_username <=", value, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameIn(List<byte[]> values) {
            addCriterion("hide_username in", values, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameNotIn(List<byte[]> values) {
            addCriterion("hide_username not in", values, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameBetween(byte[] value1, byte[] value2) {
            addCriterion("hide_username between", value1, value2, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andHideUsernameNotBetween(byte[] value1, byte[] value2) {
            addCriterion("hide_username not between", value1, value2, "hideUsername");
            return (Criteria) this;
        }

        public Criteria andPayPointsIsNull() {
            addCriterion("pay_points is null");
            return (Criteria) this;
        }

        public Criteria andPayPointsIsNotNull() {
            addCriterion("pay_points is not null");
            return (Criteria) this;
        }

        public Criteria andPayPointsEqualTo(Integer value) {
            addCriterion("pay_points =", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsNotEqualTo(Integer value) {
            addCriterion("pay_points <>", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsGreaterThan(Integer value) {
            addCriterion("pay_points >", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_points >=", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsLessThan(Integer value) {
            addCriterion("pay_points <", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsLessThanOrEqualTo(Integer value) {
            addCriterion("pay_points <=", value, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsIn(List<Integer> values) {
            addCriterion("pay_points in", values, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsNotIn(List<Integer> values) {
            addCriterion("pay_points not in", values, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsBetween(Integer value1, Integer value2) {
            addCriterion("pay_points between", value1, value2, "payPoints");
            return (Criteria) this;
        }

        public Criteria andPayPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_points not between", value1, value2, "payPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsIsNull() {
            addCriterion("is_points is null");
            return (Criteria) this;
        }

        public Criteria andIsPointsIsNotNull() {
            addCriterion("is_points is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointsEqualTo(byte[] value) {
            addCriterion("is_points =", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsNotEqualTo(byte[] value) {
            addCriterion("is_points <>", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsGreaterThan(byte[] value) {
            addCriterion("is_points >", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsGreaterThanOrEqualTo(byte[] value) {
            addCriterion("is_points >=", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsLessThan(byte[] value) {
            addCriterion("is_points <", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsLessThanOrEqualTo(byte[] value) {
            addCriterion("is_points <=", value, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsIn(List<byte[]> values) {
            addCriterion("is_points in", values, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsNotIn(List<byte[]> values) {
            addCriterion("is_points not in", values, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsBetween(byte[] value1, byte[] value2) {
            addCriterion("is_points between", value1, value2, "isPoints");
            return (Criteria) this;
        }

        public Criteria andIsPointsNotBetween(byte[] value1, byte[] value2) {
            addCriterion("is_points not between", value1, value2, "isPoints");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_shaidan
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
     * This class corresponds to the database table ecs_shaidan
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