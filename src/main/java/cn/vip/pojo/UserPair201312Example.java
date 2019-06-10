package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserPair201312Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPair201312Example() {
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

        public Criteria andPairIdIsNull() {
            addCriterion("PAIR_ID is null");
            return (Criteria) this;
        }

        public Criteria andPairIdIsNotNull() {
            addCriterion("PAIR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPairIdEqualTo(String value) {
            addCriterion("PAIR_ID =", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdNotEqualTo(String value) {
            addCriterion("PAIR_ID <>", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdGreaterThan(String value) {
            addCriterion("PAIR_ID >", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAIR_ID >=", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdLessThan(String value) {
            addCriterion("PAIR_ID <", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdLessThanOrEqualTo(String value) {
            addCriterion("PAIR_ID <=", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdLike(String value) {
            addCriterion("PAIR_ID like", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdNotLike(String value) {
            addCriterion("PAIR_ID not like", value, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdIn(List<String> values) {
            addCriterion("PAIR_ID in", values, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdNotIn(List<String> values) {
            addCriterion("PAIR_ID not in", values, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdBetween(String value1, String value2) {
            addCriterion("PAIR_ID between", value1, value2, "pairId");
            return (Criteria) this;
        }

        public Criteria andPairIdNotBetween(String value1, String value2) {
            addCriterion("PAIR_ID not between", value1, value2, "pairId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE not between", value1, value2, "date");
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

        public Criteria andLeftUserIsNull() {
            addCriterion("LEFT_USER is null");
            return (Criteria) this;
        }

        public Criteria andLeftUserIsNotNull() {
            addCriterion("LEFT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLeftUserEqualTo(Integer value) {
            addCriterion("LEFT_USER =", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserNotEqualTo(Integer value) {
            addCriterion("LEFT_USER <>", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserGreaterThan(Integer value) {
            addCriterion("LEFT_USER >", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEFT_USER >=", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserLessThan(Integer value) {
            addCriterion("LEFT_USER <", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserLessThanOrEqualTo(Integer value) {
            addCriterion("LEFT_USER <=", value, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserIn(List<Integer> values) {
            addCriterion("LEFT_USER in", values, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserNotIn(List<Integer> values) {
            addCriterion("LEFT_USER not in", values, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserBetween(Integer value1, Integer value2) {
            addCriterion("LEFT_USER between", value1, value2, "leftUser");
            return (Criteria) this;
        }

        public Criteria andLeftUserNotBetween(Integer value1, Integer value2) {
            addCriterion("LEFT_USER not between", value1, value2, "leftUser");
            return (Criteria) this;
        }

        public Criteria andRightUserIsNull() {
            addCriterion("RIGHT_USER is null");
            return (Criteria) this;
        }

        public Criteria andRightUserIsNotNull() {
            addCriterion("RIGHT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andRightUserEqualTo(Integer value) {
            addCriterion("RIGHT_USER =", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserNotEqualTo(Integer value) {
            addCriterion("RIGHT_USER <>", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserGreaterThan(Integer value) {
            addCriterion("RIGHT_USER >", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("RIGHT_USER >=", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserLessThan(Integer value) {
            addCriterion("RIGHT_USER <", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserLessThanOrEqualTo(Integer value) {
            addCriterion("RIGHT_USER <=", value, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserIn(List<Integer> values) {
            addCriterion("RIGHT_USER in", values, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserNotIn(List<Integer> values) {
            addCriterion("RIGHT_USER not in", values, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserBetween(Integer value1, Integer value2) {
            addCriterion("RIGHT_USER between", value1, value2, "rightUser");
            return (Criteria) this;
        }

        public Criteria andRightUserNotBetween(Integer value1, Integer value2) {
            addCriterion("RIGHT_USER not between", value1, value2, "rightUser");
            return (Criteria) this;
        }

        public Criteria andLeftKeepIsNull() {
            addCriterion("LEFT_KEEP is null");
            return (Criteria) this;
        }

        public Criteria andLeftKeepIsNotNull() {
            addCriterion("LEFT_KEEP is not null");
            return (Criteria) this;
        }

        public Criteria andLeftKeepEqualTo(Integer value) {
            addCriterion("LEFT_KEEP =", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepNotEqualTo(Integer value) {
            addCriterion("LEFT_KEEP <>", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepGreaterThan(Integer value) {
            addCriterion("LEFT_KEEP >", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEFT_KEEP >=", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepLessThan(Integer value) {
            addCriterion("LEFT_KEEP <", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepLessThanOrEqualTo(Integer value) {
            addCriterion("LEFT_KEEP <=", value, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepIn(List<Integer> values) {
            addCriterion("LEFT_KEEP in", values, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepNotIn(List<Integer> values) {
            addCriterion("LEFT_KEEP not in", values, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepBetween(Integer value1, Integer value2) {
            addCriterion("LEFT_KEEP between", value1, value2, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andLeftKeepNotBetween(Integer value1, Integer value2) {
            addCriterion("LEFT_KEEP not between", value1, value2, "leftKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepIsNull() {
            addCriterion("RIGHT_KEEP is null");
            return (Criteria) this;
        }

        public Criteria andRightKeepIsNotNull() {
            addCriterion("RIGHT_KEEP is not null");
            return (Criteria) this;
        }

        public Criteria andRightKeepEqualTo(Integer value) {
            addCriterion("RIGHT_KEEP =", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepNotEqualTo(Integer value) {
            addCriterion("RIGHT_KEEP <>", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepGreaterThan(Integer value) {
            addCriterion("RIGHT_KEEP >", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepGreaterThanOrEqualTo(Integer value) {
            addCriterion("RIGHT_KEEP >=", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepLessThan(Integer value) {
            addCriterion("RIGHT_KEEP <", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepLessThanOrEqualTo(Integer value) {
            addCriterion("RIGHT_KEEP <=", value, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepIn(List<Integer> values) {
            addCriterion("RIGHT_KEEP in", values, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepNotIn(List<Integer> values) {
            addCriterion("RIGHT_KEEP not in", values, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepBetween(Integer value1, Integer value2) {
            addCriterion("RIGHT_KEEP between", value1, value2, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andRightKeepNotBetween(Integer value1, Integer value2) {
            addCriterion("RIGHT_KEEP not between", value1, value2, "rightKeep");
            return (Criteria) this;
        }

        public Criteria andEachPvIsNull() {
            addCriterion("EACH_PV is null");
            return (Criteria) this;
        }

        public Criteria andEachPvIsNotNull() {
            addCriterion("EACH_PV is not null");
            return (Criteria) this;
        }

        public Criteria andEachPvEqualTo(BigDecimal value) {
            addCriterion("EACH_PV =", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvNotEqualTo(BigDecimal value) {
            addCriterion("EACH_PV <>", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvGreaterThan(BigDecimal value) {
            addCriterion("EACH_PV >", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EACH_PV >=", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvLessThan(BigDecimal value) {
            addCriterion("EACH_PV <", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EACH_PV <=", value, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvIn(List<BigDecimal> values) {
            addCriterion("EACH_PV in", values, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvNotIn(List<BigDecimal> values) {
            addCriterion("EACH_PV not in", values, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EACH_PV between", value1, value2, "eachPv");
            return (Criteria) this;
        }

        public Criteria andEachPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EACH_PV not between", value1, value2, "eachPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvIsNull() {
            addCriterion("SUM_PAIR_PV is null");
            return (Criteria) this;
        }

        public Criteria andSumPairPvIsNotNull() {
            addCriterion("SUM_PAIR_PV is not null");
            return (Criteria) this;
        }

        public Criteria andSumPairPvEqualTo(BigDecimal value) {
            addCriterion("SUM_PAIR_PV =", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvNotEqualTo(BigDecimal value) {
            addCriterion("SUM_PAIR_PV <>", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvGreaterThan(BigDecimal value) {
            addCriterion("SUM_PAIR_PV >", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_PAIR_PV >=", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvLessThan(BigDecimal value) {
            addCriterion("SUM_PAIR_PV <", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_PAIR_PV <=", value, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvIn(List<BigDecimal> values) {
            addCriterion("SUM_PAIR_PV in", values, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvNotIn(List<BigDecimal> values) {
            addCriterion("SUM_PAIR_PV not in", values, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_PAIR_PV between", value1, value2, "sumPairPv");
            return (Criteria) this;
        }

        public Criteria andSumPairPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_PAIR_PV not between", value1, value2, "sumPairPv");
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