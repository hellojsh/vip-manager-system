package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserReferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserReferExample() {
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

        public Criteria andReferLogIdIsNull() {
            addCriterion("REFER_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andReferLogIdIsNotNull() {
            addCriterion("REFER_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReferLogIdEqualTo(String value) {
            addCriterion("REFER_LOG_ID =", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdNotEqualTo(String value) {
            addCriterion("REFER_LOG_ID <>", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdGreaterThan(String value) {
            addCriterion("REFER_LOG_ID >", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFER_LOG_ID >=", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdLessThan(String value) {
            addCriterion("REFER_LOG_ID <", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdLessThanOrEqualTo(String value) {
            addCriterion("REFER_LOG_ID <=", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdLike(String value) {
            addCriterion("REFER_LOG_ID like", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdNotLike(String value) {
            addCriterion("REFER_LOG_ID not like", value, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdIn(List<String> values) {
            addCriterion("REFER_LOG_ID in", values, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdNotIn(List<String> values) {
            addCriterion("REFER_LOG_ID not in", values, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdBetween(String value1, String value2) {
            addCriterion("REFER_LOG_ID between", value1, value2, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferLogIdNotBetween(String value1, String value2) {
            addCriterion("REFER_LOG_ID not between", value1, value2, "referLogId");
            return (Criteria) this;
        }

        public Criteria andReferTimeIsNull() {
            addCriterion("REFER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReferTimeIsNotNull() {
            addCriterion("REFER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReferTimeEqualTo(Date value) {
            addCriterionForJDBCDate("REFER_TIME =", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REFER_TIME <>", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REFER_TIME >", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFER_TIME >=", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeLessThan(Date value) {
            addCriterionForJDBCDate("REFER_TIME <", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REFER_TIME <=", value, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeIn(List<Date> values) {
            addCriterionForJDBCDate("REFER_TIME in", values, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REFER_TIME not in", values, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFER_TIME between", value1, value2, "referTime");
            return (Criteria) this;
        }

        public Criteria andReferTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REFER_TIME not between", value1, value2, "referTime");
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

        public Criteria andReferIdIsNull() {
            addCriterion("REFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReferIdIsNotNull() {
            addCriterion("REFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReferIdEqualTo(String value) {
            addCriterion("REFER_ID =", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdNotEqualTo(String value) {
            addCriterion("REFER_ID <>", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdGreaterThan(String value) {
            addCriterion("REFER_ID >", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFER_ID >=", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdLessThan(String value) {
            addCriterion("REFER_ID <", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdLessThanOrEqualTo(String value) {
            addCriterion("REFER_ID <=", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdLike(String value) {
            addCriterion("REFER_ID like", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdNotLike(String value) {
            addCriterion("REFER_ID not like", value, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdIn(List<String> values) {
            addCriterion("REFER_ID in", values, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdNotIn(List<String> values) {
            addCriterion("REFER_ID not in", values, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdBetween(String value1, String value2) {
            addCriterion("REFER_ID between", value1, value2, "referId");
            return (Criteria) this;
        }

        public Criteria andReferIdNotBetween(String value1, String value2) {
            addCriterion("REFER_ID not between", value1, value2, "referId");
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