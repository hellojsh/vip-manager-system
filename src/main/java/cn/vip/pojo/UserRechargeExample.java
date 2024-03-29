package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("RECHARGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("RECHARGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("RECHARGE_ID =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("RECHARGE_ID <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("RECHARGE_ID >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECHARGE_ID >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("RECHARGE_ID <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("RECHARGE_ID <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("RECHARGE_ID like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("RECHARGE_ID not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("RECHARGE_ID in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("RECHARGE_ID not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("RECHARGE_ID between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("RECHARGE_ID not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("RECHARGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("RECHARGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECHARGE_TIME <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterionForJDBCDate("RECHARGE_TIME in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECHARGE_TIME not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECHARGE_TIME between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECHARGE_TIME not between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIsNull() {
            addCriterion("RECHARGE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIsNotNull() {
            addCriterion("RECHARGE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumEqualTo(String value) {
            addCriterion("RECHARGE_NUM =", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotEqualTo(String value) {
            addCriterion("RECHARGE_NUM <>", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumGreaterThan(String value) {
            addCriterion("RECHARGE_NUM >", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumGreaterThanOrEqualTo(String value) {
            addCriterion("RECHARGE_NUM >=", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumLessThan(String value) {
            addCriterion("RECHARGE_NUM <", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumLessThanOrEqualTo(String value) {
            addCriterion("RECHARGE_NUM <=", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumLike(String value) {
            addCriterion("RECHARGE_NUM like", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotLike(String value) {
            addCriterion("RECHARGE_NUM not like", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIn(List<String> values) {
            addCriterion("RECHARGE_NUM in", values, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotIn(List<String> values) {
            addCriterion("RECHARGE_NUM not in", values, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumBetween(String value1, String value2) {
            addCriterion("RECHARGE_NUM between", value1, value2, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotBetween(String value1, String value2) {
            addCriterion("RECHARGE_NUM not between", value1, value2, "rechargeNum");
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

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("RECHARGE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("RECHARGE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("RECHARGE_MONEY =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("RECHARGE_MONEY <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("RECHARGE_MONEY >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECHARGE_MONEY >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("RECHARGE_MONEY <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECHARGE_MONEY <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("RECHARGE_MONEY in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("RECHARGE_MONEY not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECHARGE_MONEY between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECHARGE_MONEY not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyIsNull() {
            addCriterion("CREDITED_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyIsNotNull() {
            addCriterion("CREDITED_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyEqualTo(BigDecimal value) {
            addCriterion("CREDITED_MONEY =", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CREDITED_MONEY <>", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyGreaterThan(BigDecimal value) {
            addCriterion("CREDITED_MONEY >", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITED_MONEY >=", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyLessThan(BigDecimal value) {
            addCriterion("CREDITED_MONEY <", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREDITED_MONEY <=", value, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyIn(List<BigDecimal> values) {
            addCriterion("CREDITED_MONEY in", values, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CREDITED_MONEY not in", values, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITED_MONEY between", value1, value2, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREDITED_MONEY not between", value1, value2, "creditedMoney");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeIsNull() {
            addCriterion("CREDITED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeIsNotNull() {
            addCriterion("CREDITED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME =", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME <>", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME >", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME >=", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME <", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREDITED_TIME <=", value, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITED_TIME in", values, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREDITED_TIME not in", values, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITED_TIME between", value1, value2, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andCreditedTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREDITED_TIME not between", value1, value2, "creditedTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("AUDIT_USER is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("AUDIT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(String value) {
            addCriterion("AUDIT_USER =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(String value) {
            addCriterion("AUDIT_USER <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(String value) {
            addCriterion("AUDIT_USER >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(String value) {
            addCriterion("AUDIT_USER <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLike(String value) {
            addCriterion("AUDIT_USER like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotLike(String value) {
            addCriterion("AUDIT_USER not like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<String> values) {
            addCriterion("AUDIT_USER in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<String> values) {
            addCriterion("AUDIT_USER not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(String value1, String value2) {
            addCriterion("AUDIT_USER between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(String value1, String value2) {
            addCriterion("AUDIT_USER not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andPvRateIsNull() {
            addCriterion("PV_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPvRateIsNotNull() {
            addCriterion("PV_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPvRateEqualTo(BigDecimal value) {
            addCriterion("PV_RATE =", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateNotEqualTo(BigDecimal value) {
            addCriterion("PV_RATE <>", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateGreaterThan(BigDecimal value) {
            addCriterion("PV_RATE >", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PV_RATE >=", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateLessThan(BigDecimal value) {
            addCriterion("PV_RATE <", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PV_RATE <=", value, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateIn(List<BigDecimal> values) {
            addCriterion("PV_RATE in", values, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateNotIn(List<BigDecimal> values) {
            addCriterion("PV_RATE not in", values, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV_RATE between", value1, value2, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV_RATE not between", value1, value2, "pvRate");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("PV is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("PV is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(BigDecimal value) {
            addCriterion("PV =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(BigDecimal value) {
            addCriterion("PV <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(BigDecimal value) {
            addCriterion("PV >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PV >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(BigDecimal value) {
            addCriterion("PV <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PV <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<BigDecimal> values) {
            addCriterion("PV in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<BigDecimal> values) {
            addCriterion("PV not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PV not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("PLATFORM =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("PLATFORM <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("PLATFORM >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("PLATFORM <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("PLATFORM like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("PLATFORM not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("PLATFORM in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("PLATFORM not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("PLATFORM between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("PLATFORM not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("PARAM is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("PARAM =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("PARAM <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("PARAM >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("PARAM <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("PARAM <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("PARAM like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("PARAM not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("PARAM in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("PARAM not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("PARAM between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("PARAM not between", value1, value2, "param");
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