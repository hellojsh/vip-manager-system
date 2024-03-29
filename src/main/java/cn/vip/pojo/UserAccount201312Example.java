package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserAccount201312Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccount201312Example() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("ACCOUNT_ID like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("ACCOUNT_ID not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
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

        public Criteria andAccountDateIsNull() {
            addCriterion("ACCOUNT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("ACCOUNT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCOUNT_DATE <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNT_DATE in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCOUNT_DATE not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNT_DATE between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCOUNT_DATE not between", value1, value2, "accountDate");
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

        public Criteria andBaseInIsNull() {
            addCriterion("BASE_IN is null");
            return (Criteria) this;
        }

        public Criteria andBaseInIsNotNull() {
            addCriterion("BASE_IN is not null");
            return (Criteria) this;
        }

        public Criteria andBaseInEqualTo(BigDecimal value) {
            addCriterion("BASE_IN =", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotEqualTo(BigDecimal value) {
            addCriterion("BASE_IN <>", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThan(BigDecimal value) {
            addCriterion("BASE_IN >", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_IN >=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThan(BigDecimal value) {
            addCriterion("BASE_IN <", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_IN <=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInIn(List<BigDecimal> values) {
            addCriterion("BASE_IN in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotIn(List<BigDecimal> values) {
            addCriterion("BASE_IN not in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_IN between", value1, value2, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_IN not between", value1, value2, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseOutIsNull() {
            addCriterion("BASE_OUT is null");
            return (Criteria) this;
        }

        public Criteria andBaseOutIsNotNull() {
            addCriterion("BASE_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOutEqualTo(BigDecimal value) {
            addCriterion("BASE_OUT =", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotEqualTo(BigDecimal value) {
            addCriterion("BASE_OUT <>", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThan(BigDecimal value) {
            addCriterion("BASE_OUT >", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_OUT >=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThan(BigDecimal value) {
            addCriterion("BASE_OUT <", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_OUT <=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutIn(List<BigDecimal> values) {
            addCriterion("BASE_OUT in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotIn(List<BigDecimal> values) {
            addCriterion("BASE_OUT not in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_OUT between", value1, value2, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_OUT not between", value1, value2, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIsNull() {
            addCriterion("BASE_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIsNotNull() {
            addCriterion("BASE_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceEqualTo(BigDecimal value) {
            addCriterion("BASE_BALANCE =", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BASE_BALANCE <>", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThan(BigDecimal value) {
            addCriterion("BASE_BALANCE >", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_BALANCE >=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThan(BigDecimal value) {
            addCriterion("BASE_BALANCE <", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_BALANCE <=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIn(List<BigDecimal> values) {
            addCriterion("BASE_BALANCE in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BASE_BALANCE not in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_BALANCE between", value1, value2, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_BALANCE not between", value1, value2, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatInIsNull() {
            addCriterion("REPEAT_IN is null");
            return (Criteria) this;
        }

        public Criteria andRepeatInIsNotNull() {
            addCriterion("REPEAT_IN is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatInEqualTo(BigDecimal value) {
            addCriterion("REPEAT_IN =", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotEqualTo(BigDecimal value) {
            addCriterion("REPEAT_IN <>", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThan(BigDecimal value) {
            addCriterion("REPEAT_IN >", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_IN >=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThan(BigDecimal value) {
            addCriterion("REPEAT_IN <", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_IN <=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInIn(List<BigDecimal> values) {
            addCriterion("REPEAT_IN in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotIn(List<BigDecimal> values) {
            addCriterion("REPEAT_IN not in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_IN between", value1, value2, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_IN not between", value1, value2, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIsNull() {
            addCriterion("REPEAT_OUT is null");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIsNotNull() {
            addCriterion("REPEAT_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatOutEqualTo(BigDecimal value) {
            addCriterion("REPEAT_OUT =", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotEqualTo(BigDecimal value) {
            addCriterion("REPEAT_OUT <>", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThan(BigDecimal value) {
            addCriterion("REPEAT_OUT >", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_OUT >=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThan(BigDecimal value) {
            addCriterion("REPEAT_OUT <", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_OUT <=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIn(List<BigDecimal> values) {
            addCriterion("REPEAT_OUT in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotIn(List<BigDecimal> values) {
            addCriterion("REPEAT_OUT not in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_OUT between", value1, value2, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_OUT not between", value1, value2, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIsNull() {
            addCriterion("REPEAT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIsNotNull() {
            addCriterion("REPEAT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceEqualTo(BigDecimal value) {
            addCriterion("REPEAT_BALANCE =", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotEqualTo(BigDecimal value) {
            addCriterion("REPEAT_BALANCE <>", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThan(BigDecimal value) {
            addCriterion("REPEAT_BALANCE >", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_BALANCE >=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThan(BigDecimal value) {
            addCriterion("REPEAT_BALANCE <", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_BALANCE <=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIn(List<BigDecimal> values) {
            addCriterion("REPEAT_BALANCE in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotIn(List<BigDecimal> values) {
            addCriterion("REPEAT_BALANCE not in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_BALANCE between", value1, value2, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_BALANCE not between", value1, value2, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andFreePvIsNull() {
            addCriterion("FREE_PV is null");
            return (Criteria) this;
        }

        public Criteria andFreePvIsNotNull() {
            addCriterion("FREE_PV is not null");
            return (Criteria) this;
        }

        public Criteria andFreePvEqualTo(BigDecimal value) {
            addCriterion("FREE_PV =", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotEqualTo(BigDecimal value) {
            addCriterion("FREE_PV <>", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvGreaterThan(BigDecimal value) {
            addCriterion("FREE_PV >", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREE_PV >=", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvLessThan(BigDecimal value) {
            addCriterion("FREE_PV <", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREE_PV <=", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvIn(List<BigDecimal> values) {
            addCriterion("FREE_PV in", values, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotIn(List<BigDecimal> values) {
            addCriterion("FREE_PV not in", values, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREE_PV between", value1, value2, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREE_PV not between", value1, value2, "freePv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvIsNull() {
            addCriterion("ALREADY_PV is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvIsNotNull() {
            addCriterion("ALREADY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvEqualTo(BigDecimal value) {
            addCriterion("ALREADY_PV =", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotEqualTo(BigDecimal value) {
            addCriterion("ALREADY_PV <>", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvGreaterThan(BigDecimal value) {
            addCriterion("ALREADY_PV >", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALREADY_PV >=", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvLessThan(BigDecimal value) {
            addCriterion("ALREADY_PV <", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALREADY_PV <=", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvIn(List<BigDecimal> values) {
            addCriterion("ALREADY_PV in", values, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotIn(List<BigDecimal> values) {
            addCriterion("ALREADY_PV not in", values, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALREADY_PV between", value1, value2, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALREADY_PV not between", value1, value2, "alreadyPv");
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