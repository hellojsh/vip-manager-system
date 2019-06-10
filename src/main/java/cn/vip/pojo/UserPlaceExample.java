package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserPlaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPlaceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPlaceIdIsNull() {
            addCriterion("PLACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("PLACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(String value) {
            addCriterion("PLACE_ID =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(String value) {
            addCriterion("PLACE_ID <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(String value) {
            addCriterion("PLACE_ID >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE_ID >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(String value) {
            addCriterion("PLACE_ID <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(String value) {
            addCriterion("PLACE_ID <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLike(String value) {
            addCriterion("PLACE_ID like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotLike(String value) {
            addCriterion("PLACE_ID not like", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<String> values) {
            addCriterion("PLACE_ID in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<String> values) {
            addCriterion("PLACE_ID not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(String value1, String value2) {
            addCriterion("PLACE_ID between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(String value1, String value2) {
            addCriterion("PLACE_ID not between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIsNull() {
            addCriterion("PLACE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIsNotNull() {
            addCriterion("PLACE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PLACE_TIME =", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLACE_TIME <>", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PLACE_TIME >", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLACE_TIME >=", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeLessThan(Date value) {
            addCriterionForJDBCDate("PLACE_TIME <", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLACE_TIME <=", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PLACE_TIME in", values, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLACE_TIME not in", values, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLACE_TIME between", value1, value2, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLACE_TIME not between", value1, value2, "placeTime");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIsNull() {
            addCriterion("BONUS_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIsNotNull() {
            addCriterion("BONUS_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdEqualTo(String value) {
            addCriterion("BONUS_USER_ID =", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotEqualTo(String value) {
            addCriterion("BONUS_USER_ID <>", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdGreaterThan(String value) {
            addCriterion("BONUS_USER_ID >", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("BONUS_USER_ID >=", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLessThan(String value) {
            addCriterion("BONUS_USER_ID <", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLessThanOrEqualTo(String value) {
            addCriterion("BONUS_USER_ID <=", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdLike(String value) {
            addCriterion("BONUS_USER_ID like", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotLike(String value) {
            addCriterion("BONUS_USER_ID not like", value, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdIn(List<String> values) {
            addCriterion("BONUS_USER_ID in", values, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotIn(List<String> values) {
            addCriterion("BONUS_USER_ID not in", values, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdBetween(String value1, String value2) {
            addCriterion("BONUS_USER_ID between", value1, value2, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andBonusUserIdNotBetween(String value1, String value2) {
            addCriterion("BONUS_USER_ID not between", value1, value2, "bonusUserId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNull() {
            addCriterion("BUY_PV is null");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNotNull() {
            addCriterion("BUY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPvEqualTo(BigDecimal value) {
            addCriterion("BUY_PV =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(BigDecimal value) {
            addCriterion("BUY_PV >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(BigDecimal value) {
            addCriterion("BUY_PV <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<BigDecimal> values) {
            addCriterion("BUY_PV in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<BigDecimal> values) {
            addCriterion("BUY_PV not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV not between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNull() {
            addCriterion("BONUS_RATE is null");
            return (Criteria) this;
        }

        public Criteria andBonusRateIsNotNull() {
            addCriterion("BONUS_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andBonusRateEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE =", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE <>", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThan(BigDecimal value) {
            addCriterion("BONUS_RATE >", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE >=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThan(BigDecimal value) {
            addCriterion("BONUS_RATE <", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_RATE <=", value, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateIn(List<BigDecimal> values) {
            addCriterion("BONUS_RATE in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotIn(List<BigDecimal> values) {
            addCriterion("BONUS_RATE not in", values, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_RATE between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_RATE not between", value1, value2, "bonusRate");
            return (Criteria) this;
        }

        public Criteria andBonusPvIsNull() {
            addCriterion("BONUS_PV is null");
            return (Criteria) this;
        }

        public Criteria andBonusPvIsNotNull() {
            addCriterion("BONUS_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBonusPvEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV =", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV <>", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvGreaterThan(BigDecimal value) {
            addCriterion("BONUS_PV >", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV >=", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvLessThan(BigDecimal value) {
            addCriterion("BONUS_PV <", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BONUS_PV <=", value, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvIn(List<BigDecimal> values) {
            addCriterion("BONUS_PV in", values, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotIn(List<BigDecimal> values) {
            addCriterion("BONUS_PV not in", values, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_PV between", value1, value2, "bonusPv");
            return (Criteria) this;
        }

        public Criteria andBonusPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BONUS_PV not between", value1, value2, "bonusPv");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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