package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserCashExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCashExample() {
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

        public Criteria andCashIdIsNull() {
            addCriterion("CASH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCashIdIsNotNull() {
            addCriterion("CASH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCashIdEqualTo(String value) {
            addCriterion("CASH_ID =", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotEqualTo(String value) {
            addCriterion("CASH_ID <>", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThan(String value) {
            addCriterion("CASH_ID >", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_ID >=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThan(String value) {
            addCriterion("CASH_ID <", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLessThanOrEqualTo(String value) {
            addCriterion("CASH_ID <=", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdLike(String value) {
            addCriterion("CASH_ID like", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotLike(String value) {
            addCriterion("CASH_ID not like", value, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdIn(List<String> values) {
            addCriterion("CASH_ID in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotIn(List<String> values) {
            addCriterion("CASH_ID not in", values, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdBetween(String value1, String value2) {
            addCriterion("CASH_ID between", value1, value2, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashIdNotBetween(String value1, String value2) {
            addCriterion("CASH_ID not between", value1, value2, "cashId");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNull() {
            addCriterion("CASH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCashTimeIsNotNull() {
            addCriterion("CASH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCashTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CASH_TIME =", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CASH_TIME <>", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CASH_TIME >", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CASH_TIME >=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThan(Date value) {
            addCriterionForJDBCDate("CASH_TIME <", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CASH_TIME <=", value, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CASH_TIME in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CASH_TIME not in", values, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CASH_TIME between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CASH_TIME not between", value1, value2, "cashTime");
            return (Criteria) this;
        }

        public Criteria andCashNumIsNull() {
            addCriterion("CASH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCashNumIsNotNull() {
            addCriterion("CASH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCashNumEqualTo(String value) {
            addCriterion("CASH_NUM =", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotEqualTo(String value) {
            addCriterion("CASH_NUM <>", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumGreaterThan(String value) {
            addCriterion("CASH_NUM >", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumGreaterThanOrEqualTo(String value) {
            addCriterion("CASH_NUM >=", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumLessThan(String value) {
            addCriterion("CASH_NUM <", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumLessThanOrEqualTo(String value) {
            addCriterion("CASH_NUM <=", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumLike(String value) {
            addCriterion("CASH_NUM like", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotLike(String value) {
            addCriterion("CASH_NUM not like", value, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumIn(List<String> values) {
            addCriterion("CASH_NUM in", values, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotIn(List<String> values) {
            addCriterion("CASH_NUM not in", values, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumBetween(String value1, String value2) {
            addCriterion("CASH_NUM between", value1, value2, "cashNum");
            return (Criteria) this;
        }

        public Criteria andCashNumNotBetween(String value1, String value2) {
            addCriterion("CASH_NUM not between", value1, value2, "cashNum");
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

        public Criteria andCashPvIsNull() {
            addCriterion("CASH_PV is null");
            return (Criteria) this;
        }

        public Criteria andCashPvIsNotNull() {
            addCriterion("CASH_PV is not null");
            return (Criteria) this;
        }

        public Criteria andCashPvEqualTo(BigDecimal value) {
            addCriterion("CASH_PV =", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvNotEqualTo(BigDecimal value) {
            addCriterion("CASH_PV <>", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvGreaterThan(BigDecimal value) {
            addCriterion("CASH_PV >", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_PV >=", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvLessThan(BigDecimal value) {
            addCriterion("CASH_PV <", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_PV <=", value, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvIn(List<BigDecimal> values) {
            addCriterion("CASH_PV in", values, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvNotIn(List<BigDecimal> values) {
            addCriterion("CASH_PV not in", values, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_PV between", value1, value2, "cashPv");
            return (Criteria) this;
        }

        public Criteria andCashPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_PV not between", value1, value2, "cashPv");
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

        public Criteria andCashMoneyIsNull() {
            addCriterion("CASH_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIsNotNull() {
            addCriterion("CASH_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyEqualTo(BigDecimal value) {
            addCriterion("CASH_MONEY =", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CASH_MONEY <>", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThan(BigDecimal value) {
            addCriterion("CASH_MONEY >", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_MONEY >=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThan(BigDecimal value) {
            addCriterion("CASH_MONEY <", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_MONEY <=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIn(List<BigDecimal> values) {
            addCriterion("CASH_MONEY in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CASH_MONEY not in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_MONEY between", value1, value2, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_MONEY not between", value1, value2, "cashMoney");
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

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNull() {
            addCriterion("OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIsNotNull() {
            addCriterion("OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeeEqualTo(BigDecimal value) {
            addCriterion("OTHER_FEE =", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_FEE <>", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThan(BigDecimal value) {
            addCriterion("OTHER_FEE >", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_FEE >=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThan(BigDecimal value) {
            addCriterion("OTHER_FEE <", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_FEE <=", value, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeIn(List<BigDecimal> values) {
            addCriterion("OTHER_FEE in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_FEE not in", values, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_FEE between", value1, value2, "otherFee");
            return (Criteria) this;
        }

        public Criteria andOtherFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_FEE not between", value1, value2, "otherFee");
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

        public Criteria andBankBranceIsNull() {
            addCriterion("BANK_BRANCE is null");
            return (Criteria) this;
        }

        public Criteria andBankBranceIsNotNull() {
            addCriterion("BANK_BRANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranceEqualTo(String value) {
            addCriterion("BANK_BRANCE =", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceNotEqualTo(String value) {
            addCriterion("BANK_BRANCE <>", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceGreaterThan(String value) {
            addCriterion("BANK_BRANCE >", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCE >=", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceLessThan(String value) {
            addCriterion("BANK_BRANCE <", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceLessThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCE <=", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceLike(String value) {
            addCriterion("BANK_BRANCE like", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceNotLike(String value) {
            addCriterion("BANK_BRANCE not like", value, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceIn(List<String> values) {
            addCriterion("BANK_BRANCE in", values, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceNotIn(List<String> values) {
            addCriterion("BANK_BRANCE not in", values, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceBetween(String value1, String value2) {
            addCriterion("BANK_BRANCE between", value1, value2, "bankBrance");
            return (Criteria) this;
        }

        public Criteria andBankBranceNotBetween(String value1, String value2) {
            addCriterion("BANK_BRANCE not between", value1, value2, "bankBrance");
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

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("STAT is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("STAT is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(Integer value) {
            addCriterion("STAT =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(Integer value) {
            addCriterion("STAT <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(Integer value) {
            addCriterion("STAT >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAT >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(Integer value) {
            addCriterion("STAT <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(Integer value) {
            addCriterion("STAT <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<Integer> values) {
            addCriterion("STAT in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<Integer> values) {
            addCriterion("STAT not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(Integer value1, Integer value2) {
            addCriterion("STAT between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(Integer value1, Integer value2) {
            addCriterion("STAT not between", value1, value2, "stat");
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

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
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