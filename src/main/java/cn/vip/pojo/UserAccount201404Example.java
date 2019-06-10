package cn.vip.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserAccount201404Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccount201404Example() {
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

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBaseInEqualTo(Double value) {
            addCriterion("BASE_IN =", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotEqualTo(Double value) {
            addCriterion("BASE_IN <>", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThan(Double value) {
            addCriterion("BASE_IN >", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInGreaterThanOrEqualTo(Double value) {
            addCriterion("BASE_IN >=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThan(Double value) {
            addCriterion("BASE_IN <", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInLessThanOrEqualTo(Double value) {
            addCriterion("BASE_IN <=", value, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInIn(List<Double> values) {
            addCriterion("BASE_IN in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotIn(List<Double> values) {
            addCriterion("BASE_IN not in", values, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInBetween(Double value1, Double value2) {
            addCriterion("BASE_IN between", value1, value2, "baseIn");
            return (Criteria) this;
        }

        public Criteria andBaseInNotBetween(Double value1, Double value2) {
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

        public Criteria andBaseOutEqualTo(Double value) {
            addCriterion("BASE_OUT =", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotEqualTo(Double value) {
            addCriterion("BASE_OUT <>", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThan(Double value) {
            addCriterion("BASE_OUT >", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutGreaterThanOrEqualTo(Double value) {
            addCriterion("BASE_OUT >=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThan(Double value) {
            addCriterion("BASE_OUT <", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutLessThanOrEqualTo(Double value) {
            addCriterion("BASE_OUT <=", value, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutIn(List<Double> values) {
            addCriterion("BASE_OUT in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotIn(List<Double> values) {
            addCriterion("BASE_OUT not in", values, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutBetween(Double value1, Double value2) {
            addCriterion("BASE_OUT between", value1, value2, "baseOut");
            return (Criteria) this;
        }

        public Criteria andBaseOutNotBetween(Double value1, Double value2) {
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

        public Criteria andBaseBalanceEqualTo(Double value) {
            addCriterion("BASE_BALANCE =", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotEqualTo(Double value) {
            addCriterion("BASE_BALANCE <>", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThan(Double value) {
            addCriterion("BASE_BALANCE >", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("BASE_BALANCE >=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThan(Double value) {
            addCriterion("BASE_BALANCE <", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceLessThanOrEqualTo(Double value) {
            addCriterion("BASE_BALANCE <=", value, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceIn(List<Double> values) {
            addCriterion("BASE_BALANCE in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotIn(List<Double> values) {
            addCriterion("BASE_BALANCE not in", values, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceBetween(Double value1, Double value2) {
            addCriterion("BASE_BALANCE between", value1, value2, "baseBalance");
            return (Criteria) this;
        }

        public Criteria andBaseBalanceNotBetween(Double value1, Double value2) {
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

        public Criteria andRepeatInEqualTo(Double value) {
            addCriterion("REPEAT_IN =", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotEqualTo(Double value) {
            addCriterion("REPEAT_IN <>", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThan(Double value) {
            addCriterion("REPEAT_IN >", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInGreaterThanOrEqualTo(Double value) {
            addCriterion("REPEAT_IN >=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThan(Double value) {
            addCriterion("REPEAT_IN <", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInLessThanOrEqualTo(Double value) {
            addCriterion("REPEAT_IN <=", value, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInIn(List<Double> values) {
            addCriterion("REPEAT_IN in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotIn(List<Double> values) {
            addCriterion("REPEAT_IN not in", values, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInBetween(Double value1, Double value2) {
            addCriterion("REPEAT_IN between", value1, value2, "repeatIn");
            return (Criteria) this;
        }

        public Criteria andRepeatInNotBetween(Double value1, Double value2) {
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

        public Criteria andRepeatOutEqualTo(Double value) {
            addCriterion("REPEAT_OUT =", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotEqualTo(Double value) {
            addCriterion("REPEAT_OUT <>", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThan(Double value) {
            addCriterion("REPEAT_OUT >", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutGreaterThanOrEqualTo(Double value) {
            addCriterion("REPEAT_OUT >=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThan(Double value) {
            addCriterion("REPEAT_OUT <", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutLessThanOrEqualTo(Double value) {
            addCriterion("REPEAT_OUT <=", value, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutIn(List<Double> values) {
            addCriterion("REPEAT_OUT in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotIn(List<Double> values) {
            addCriterion("REPEAT_OUT not in", values, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutBetween(Double value1, Double value2) {
            addCriterion("REPEAT_OUT between", value1, value2, "repeatOut");
            return (Criteria) this;
        }

        public Criteria andRepeatOutNotBetween(Double value1, Double value2) {
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

        public Criteria andRepeatBalanceEqualTo(Double value) {
            addCriterion("REPEAT_BALANCE =", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotEqualTo(Double value) {
            addCriterion("REPEAT_BALANCE <>", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThan(Double value) {
            addCriterion("REPEAT_BALANCE >", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("REPEAT_BALANCE >=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThan(Double value) {
            addCriterion("REPEAT_BALANCE <", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceLessThanOrEqualTo(Double value) {
            addCriterion("REPEAT_BALANCE <=", value, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceIn(List<Double> values) {
            addCriterion("REPEAT_BALANCE in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotIn(List<Double> values) {
            addCriterion("REPEAT_BALANCE not in", values, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceBetween(Double value1, Double value2) {
            addCriterion("REPEAT_BALANCE between", value1, value2, "repeatBalance");
            return (Criteria) this;
        }

        public Criteria andRepeatBalanceNotBetween(Double value1, Double value2) {
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

        public Criteria andFreePvEqualTo(Integer value) {
            addCriterion("FREE_PV =", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotEqualTo(Integer value) {
            addCriterion("FREE_PV <>", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvGreaterThan(Integer value) {
            addCriterion("FREE_PV >", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREE_PV >=", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvLessThan(Integer value) {
            addCriterion("FREE_PV <", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvLessThanOrEqualTo(Integer value) {
            addCriterion("FREE_PV <=", value, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvIn(List<Integer> values) {
            addCriterion("FREE_PV in", values, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotIn(List<Integer> values) {
            addCriterion("FREE_PV not in", values, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvBetween(Integer value1, Integer value2) {
            addCriterion("FREE_PV between", value1, value2, "freePv");
            return (Criteria) this;
        }

        public Criteria andFreePvNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAlreadyPvEqualTo(Integer value) {
            addCriterion("ALREADY_PV =", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotEqualTo(Integer value) {
            addCriterion("ALREADY_PV <>", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvGreaterThan(Integer value) {
            addCriterion("ALREADY_PV >", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALREADY_PV >=", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvLessThan(Integer value) {
            addCriterion("ALREADY_PV <", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvLessThanOrEqualTo(Integer value) {
            addCriterion("ALREADY_PV <=", value, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvIn(List<Integer> values) {
            addCriterion("ALREADY_PV in", values, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotIn(List<Integer> values) {
            addCriterion("ALREADY_PV not in", values, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvBetween(Integer value1, Integer value2) {
            addCriterion("ALREADY_PV between", value1, value2, "alreadyPv");
            return (Criteria) this;
        }

        public Criteria andAlreadyPvNotBetween(Integer value1, Integer value2) {
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

        public Criteria andBuyPvEqualTo(Integer value) {
            addCriterion("BUY_PV =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(Integer value) {
            addCriterion("BUY_PV <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(Integer value) {
            addCriterion("BUY_PV >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUY_PV >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(Integer value) {
            addCriterion("BUY_PV <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(Integer value) {
            addCriterion("BUY_PV <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<Integer> values) {
            addCriterion("BUY_PV in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<Integer> values) {
            addCriterion("BUY_PV not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(Integer value1, Integer value2) {
            addCriterion("BUY_PV between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(Integer value1, Integer value2) {
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