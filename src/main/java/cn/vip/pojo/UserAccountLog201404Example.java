package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserAccountLog201404Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountLog201404Example() {
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

        public Criteria andAccountLogIdIsNull() {
            addCriterion("account_log_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdIsNotNull() {
            addCriterion("account_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdEqualTo(Long value) {
            addCriterion("account_log_id =", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdNotEqualTo(Long value) {
            addCriterion("account_log_id <>", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdGreaterThan(Long value) {
            addCriterion("account_log_id >", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_log_id >=", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdLessThan(Long value) {
            addCriterion("account_log_id <", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdLessThanOrEqualTo(Long value) {
            addCriterion("account_log_id <=", value, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdIn(List<Long> values) {
            addCriterion("account_log_id in", values, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdNotIn(List<Long> values) {
            addCriterion("account_log_id not in", values, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdBetween(Long value1, Long value2) {
            addCriterion("account_log_id between", value1, value2, "accountLogId");
            return (Criteria) this;
        }

        public Criteria andAccountLogIdNotBetween(Long value1, Long value2) {
            addCriterion("account_log_id not between", value1, value2, "accountLogId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNull() {
            addCriterion("action_time is null");
            return (Criteria) this;
        }

        public Criteria andActionTimeIsNotNull() {
            addCriterion("action_time is not null");
            return (Criteria) this;
        }

        public Criteria andActionTimeEqualTo(Date value) {
            addCriterionForJDBCDate("action_time =", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("action_time <>", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("action_time >", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("action_time >=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThan(Date value) {
            addCriterionForJDBCDate("action_time <", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("action_time <=", value, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeIn(List<Date> values) {
            addCriterionForJDBCDate("action_time in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("action_time not in", values, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("action_time between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("action_time not between", value1, value2, "actionTime");
            return (Criteria) this;
        }

        public Criteria andActionDescIsNull() {
            addCriterion("action_desc is null");
            return (Criteria) this;
        }

        public Criteria andActionDescIsNotNull() {
            addCriterion("action_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActionDescEqualTo(String value) {
            addCriterion("action_desc =", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotEqualTo(String value) {
            addCriterion("action_desc <>", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescGreaterThan(String value) {
            addCriterion("action_desc >", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescGreaterThanOrEqualTo(String value) {
            addCriterion("action_desc >=", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLessThan(String value) {
            addCriterion("action_desc <", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLessThanOrEqualTo(String value) {
            addCriterion("action_desc <=", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescLike(String value) {
            addCriterion("action_desc like", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotLike(String value) {
            addCriterion("action_desc not like", value, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescIn(List<String> values) {
            addCriterion("action_desc in", values, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotIn(List<String> values) {
            addCriterion("action_desc not in", values, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescBetween(String value1, String value2) {
            addCriterion("action_desc between", value1, value2, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionDescNotBetween(String value1, String value2) {
            addCriterion("action_desc not between", value1, value2, "actionDesc");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("action_type is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("action_type is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(Integer value) {
            addCriterion("action_type =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(Integer value) {
            addCriterion("action_type <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(Integer value) {
            addCriterion("action_type >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_type >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(Integer value) {
            addCriterion("action_type <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("action_type <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<Integer> values) {
            addCriterion("action_type in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<Integer> values) {
            addCriterion("action_type not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(Integer value1, Integer value2) {
            addCriterion("action_type between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("action_type not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andBaseInIsNull() {
            addCriterion("base_in is null");
            return (Criteria) this;
        }

        public Criteria andBaseInIsNotNull() {
            addCriterion("base_in is not null");
            return (Criteria) this;
        }

        public Criteria andBaseInEqualTo(BigDecimal value) {
            addCriterion("base_in =", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotEqualTo(BigDecimal value) {
            addCriterion("base_in <>", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThan(BigDecimal value) {
            addCriterion("base_in >", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_in >=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThan(BigDecimal value) {
            addCriterion("base_in <", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_in <=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInIn(List<BigDecimal> values) {
            addCriterion("base_in in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotIn(List<BigDecimal> values) {
            addCriterion("base_in not in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_in between", value1, value2, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_in not between", value1, value2, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseOutIsNull() {
            addCriterion("base_out is null");
            return (Criteria) this;
        }

        public Criteria andBaseOutIsNotNull() {
            addCriterion("base_out is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOutEqualTo(BigDecimal value) {
            addCriterion("base_out =", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotEqualTo(BigDecimal value) {
            addCriterion("base_out <>", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThan(BigDecimal value) {
            addCriterion("base_out >", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_out >=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThan(BigDecimal value) {
            addCriterion("base_out <", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_out <=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutIn(List<BigDecimal> values) {
            addCriterion("base_out in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotIn(List<BigDecimal> values) {
            addCriterion("base_out not in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_out between", value1, value2, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_out not between", value1, value2, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIsNull() {
            addCriterion("base_balance is null");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIsNotNull() {
            addCriterion("base_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceEqualTo(BigDecimal value) {
            addCriterion("base_balance =", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotEqualTo(BigDecimal value) {
            addCriterion("base_balance <>", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThan(BigDecimal value) {
            addCriterion("base_balance >", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_balance >=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThan(BigDecimal value) {
            addCriterion("base_balance <", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_balance <=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIn(List<BigDecimal> values) {
            addCriterion("base_balance in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotIn(List<BigDecimal> values) {
            addCriterion("base_balance not in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_balance between", value1, value2, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_balance not between", value1, value2, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatInIsNull() {
            addCriterion("repeat_in is null");
            return (Criteria) this;
        }

        public Criteria andRepeatInIsNotNull() {
            addCriterion("repeat_in is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatInEqualTo(BigDecimal value) {
            addCriterion("repeat_in =", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotEqualTo(BigDecimal value) {
            addCriterion("repeat_in <>", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThan(BigDecimal value) {
            addCriterion("repeat_in >", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_in >=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThan(BigDecimal value) {
            addCriterion("repeat_in <", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_in <=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInIn(List<BigDecimal> values) {
            addCriterion("repeat_in in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotIn(List<BigDecimal> values) {
            addCriterion("repeat_in not in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_in between", value1, value2, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_in not between", value1, value2, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIsNull() {
            addCriterion("repeat_out is null");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIsNotNull() {
            addCriterion("repeat_out is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatOutEqualTo(BigDecimal value) {
            addCriterion("repeat_out =", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotEqualTo(BigDecimal value) {
            addCriterion("repeat_out <>", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThan(BigDecimal value) {
            addCriterion("repeat_out >", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_out >=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThan(BigDecimal value) {
            addCriterion("repeat_out <", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_out <=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIn(List<BigDecimal> values) {
            addCriterion("repeat_out in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotIn(List<BigDecimal> values) {
            addCriterion("repeat_out not in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_out between", value1, value2, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_out not between", value1, value2, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIsNull() {
            addCriterion("repeat_balance is null");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIsNotNull() {
            addCriterion("repeat_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceEqualTo(BigDecimal value) {
            addCriterion("repeat_balance =", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotEqualTo(BigDecimal value) {
            addCriterion("repeat_balance <>", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThan(BigDecimal value) {
            addCriterion("repeat_balance >", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_balance >=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThan(BigDecimal value) {
            addCriterion("repeat_balance <", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_balance <=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIn(List<BigDecimal> values) {
            addCriterion("repeat_balance in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotIn(List<BigDecimal> values) {
            addCriterion("repeat_balance not in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_balance between", value1, value2, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_balance not between", value1, value2, "repeatBalance");
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