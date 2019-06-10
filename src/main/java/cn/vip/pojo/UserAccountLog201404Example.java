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

        public Criteria andAccountlogidIsNull() {
            addCriterion("accountLogId is null");
            return (Criteria) this;
        }

        public Criteria andAccountlogidIsNotNull() {
            addCriterion("accountLogId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountlogidEqualTo(Long value) {
            addCriterion("accountLogId =", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidNotEqualTo(Long value) {
            addCriterion("accountLogId <>", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidGreaterThan(Long value) {
            addCriterion("accountLogId >", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidGreaterThanOrEqualTo(Long value) {
            addCriterion("accountLogId >=", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidLessThan(Long value) {
            addCriterion("accountLogId <", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidLessThanOrEqualTo(Long value) {
            addCriterion("accountLogId <=", value, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidIn(List<Long> values) {
            addCriterion("accountLogId in", values, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidNotIn(List<Long> values) {
            addCriterion("accountLogId not in", values, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidBetween(Long value1, Long value2) {
            addCriterion("accountLogId between", value1, value2, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andAccountlogidNotBetween(Long value1, Long value2) {
            addCriterion("accountLogId not between", value1, value2, "accountlogid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNull() {
            addCriterion("actionTime is null");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNotNull() {
            addCriterion("actionTime is not null");
            return (Criteria) this;
        }

        public Criteria andActiontimeEqualTo(Date value) {
            addCriterionForJDBCDate("actionTime =", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("actionTime <>", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThan(Date value) {
            addCriterionForJDBCDate("actionTime >", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actionTime >=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThan(Date value) {
            addCriterionForJDBCDate("actionTime <", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actionTime <=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeIn(List<Date> values) {
            addCriterionForJDBCDate("actionTime in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("actionTime not in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actionTime between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actionTime not between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiondescIsNull() {
            addCriterion("actionDesc is null");
            return (Criteria) this;
        }

        public Criteria andActiondescIsNotNull() {
            addCriterion("actionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andActiondescEqualTo(String value) {
            addCriterion("actionDesc =", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotEqualTo(String value) {
            addCriterion("actionDesc <>", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescGreaterThan(String value) {
            addCriterion("actionDesc >", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescGreaterThanOrEqualTo(String value) {
            addCriterion("actionDesc >=", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLessThan(String value) {
            addCriterion("actionDesc <", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLessThanOrEqualTo(String value) {
            addCriterion("actionDesc <=", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescLike(String value) {
            addCriterion("actionDesc like", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotLike(String value) {
            addCriterion("actionDesc not like", value, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescIn(List<String> values) {
            addCriterion("actionDesc in", values, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotIn(List<String> values) {
            addCriterion("actionDesc not in", values, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescBetween(String value1, String value2) {
            addCriterion("actionDesc between", value1, value2, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiondescNotBetween(String value1, String value2) {
            addCriterion("actionDesc not between", value1, value2, "actiondesc");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNull() {
            addCriterion("actionType is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNotNull() {
            addCriterion("actionType is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeEqualTo(Integer value) {
            addCriterion("actionType =", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotEqualTo(Integer value) {
            addCriterion("actionType <>", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThan(Integer value) {
            addCriterion("actionType >", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionType >=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThan(Integer value) {
            addCriterion("actionType <", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("actionType <=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeIn(List<Integer> values) {
            addCriterion("actionType in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotIn(List<Integer> values) {
            addCriterion("actionType not in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeBetween(Integer value1, Integer value2) {
            addCriterion("actionType between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("actionType not between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andBaseinIsNull() {
            addCriterion("baseIn is null");
            return (Criteria) this;
        }

        public Criteria andBaseinIsNotNull() {
            addCriterion("baseIn is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinEqualTo(BigDecimal value) {
            addCriterion("baseIn =", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinNotEqualTo(BigDecimal value) {
            addCriterion("baseIn <>", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinGreaterThan(BigDecimal value) {
            addCriterion("baseIn >", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseIn >=", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinLessThan(BigDecimal value) {
            addCriterion("baseIn <", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseIn <=", value, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinIn(List<BigDecimal> values) {
            addCriterion("baseIn in", values, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinNotIn(List<BigDecimal> values) {
            addCriterion("baseIn not in", values, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseIn between", value1, value2, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseIn not between", value1, value2, "basein");
            return (Criteria) this;
        }

        public Criteria andBaseoutIsNull() {
            addCriterion("baseOut is null");
            return (Criteria) this;
        }

        public Criteria andBaseoutIsNotNull() {
            addCriterion("baseOut is not null");
            return (Criteria) this;
        }

        public Criteria andBaseoutEqualTo(BigDecimal value) {
            addCriterion("baseOut =", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutNotEqualTo(BigDecimal value) {
            addCriterion("baseOut <>", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutGreaterThan(BigDecimal value) {
            addCriterion("baseOut >", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseOut >=", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutLessThan(BigDecimal value) {
            addCriterion("baseOut <", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseOut <=", value, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutIn(List<BigDecimal> values) {
            addCriterion("baseOut in", values, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutNotIn(List<BigDecimal> values) {
            addCriterion("baseOut not in", values, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseOut between", value1, value2, "baseout");
            return (Criteria) this;
        }

        public Criteria andBaseoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseOut not between", value1, value2, "baseout");
            return (Criteria) this;
        }

        public Criteria andBasebalanceIsNull() {
            addCriterion("baseBalance is null");
            return (Criteria) this;
        }

        public Criteria andBasebalanceIsNotNull() {
            addCriterion("baseBalance is not null");
            return (Criteria) this;
        }

        public Criteria andBasebalanceEqualTo(BigDecimal value) {
            addCriterion("baseBalance =", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceNotEqualTo(BigDecimal value) {
            addCriterion("baseBalance <>", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceGreaterThan(BigDecimal value) {
            addCriterion("baseBalance >", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("baseBalance >=", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceLessThan(BigDecimal value) {
            addCriterion("baseBalance <", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("baseBalance <=", value, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceIn(List<BigDecimal> values) {
            addCriterion("baseBalance in", values, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceNotIn(List<BigDecimal> values) {
            addCriterion("baseBalance not in", values, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseBalance between", value1, value2, "basebalance");
            return (Criteria) this;
        }

        public Criteria andBasebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("baseBalance not between", value1, value2, "basebalance");
            return (Criteria) this;
        }

        public Criteria andRepeatinIsNull() {
            addCriterion("repeatIn is null");
            return (Criteria) this;
        }

        public Criteria andRepeatinIsNotNull() {
            addCriterion("repeatIn is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatinEqualTo(BigDecimal value) {
            addCriterion("repeatIn =", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinNotEqualTo(BigDecimal value) {
            addCriterion("repeatIn <>", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinGreaterThan(BigDecimal value) {
            addCriterion("repeatIn >", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatIn >=", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinLessThan(BigDecimal value) {
            addCriterion("repeatIn <", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatIn <=", value, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinIn(List<BigDecimal> values) {
            addCriterion("repeatIn in", values, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinNotIn(List<BigDecimal> values) {
            addCriterion("repeatIn not in", values, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatIn between", value1, value2, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatIn not between", value1, value2, "repeatin");
            return (Criteria) this;
        }

        public Criteria andRepeatoutIsNull() {
            addCriterion("repeatOut is null");
            return (Criteria) this;
        }

        public Criteria andRepeatoutIsNotNull() {
            addCriterion("repeatOut is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatoutEqualTo(BigDecimal value) {
            addCriterion("repeatOut =", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutNotEqualTo(BigDecimal value) {
            addCriterion("repeatOut <>", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutGreaterThan(BigDecimal value) {
            addCriterion("repeatOut >", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatOut >=", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutLessThan(BigDecimal value) {
            addCriterion("repeatOut <", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatOut <=", value, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutIn(List<BigDecimal> values) {
            addCriterion("repeatOut in", values, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutNotIn(List<BigDecimal> values) {
            addCriterion("repeatOut not in", values, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatOut between", value1, value2, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatOut not between", value1, value2, "repeatout");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceIsNull() {
            addCriterion("repeatBalance is null");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceIsNotNull() {
            addCriterion("repeatBalance is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceEqualTo(BigDecimal value) {
            addCriterion("repeatBalance =", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceNotEqualTo(BigDecimal value) {
            addCriterion("repeatBalance <>", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceGreaterThan(BigDecimal value) {
            addCriterion("repeatBalance >", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatBalance >=", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceLessThan(BigDecimal value) {
            addCriterion("repeatBalance <", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeatBalance <=", value, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceIn(List<BigDecimal> values) {
            addCriterion("repeatBalance in", values, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceNotIn(List<BigDecimal> values) {
            addCriterion("repeatBalance not in", values, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatBalance between", value1, value2, "repeatbalance");
            return (Criteria) this;
        }

        public Criteria andRepeatbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeatBalance not between", value1, value2, "repeatbalance");
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