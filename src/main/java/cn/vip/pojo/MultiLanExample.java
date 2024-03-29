package cn.vip.pojo;

import java.util.ArrayList;
import java.util.List;

public class MultiLanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MultiLanExample() {
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

        public Criteria andElementIdIsNull() {
            addCriterion("ELEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andElementIdIsNotNull() {
            addCriterion("ELEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andElementIdEqualTo(String value) {
            addCriterion("ELEMENT_ID =", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotEqualTo(String value) {
            addCriterion("ELEMENT_ID <>", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThan(String value) {
            addCriterion("ELEMENT_ID >", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_ID >=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThan(String value) {
            addCriterion("ELEMENT_ID <", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_ID <=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLike(String value) {
            addCriterion("ELEMENT_ID like", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotLike(String value) {
            addCriterion("ELEMENT_ID not like", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdIn(List<String> values) {
            addCriterion("ELEMENT_ID in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotIn(List<String> values) {
            addCriterion("ELEMENT_ID not in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdBetween(String value1, String value2) {
            addCriterion("ELEMENT_ID between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_ID not between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andPagePathIsNull() {
            addCriterion("PAGE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPagePathIsNotNull() {
            addCriterion("PAGE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPagePathEqualTo(String value) {
            addCriterion("PAGE_PATH =", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathNotEqualTo(String value) {
            addCriterion("PAGE_PATH <>", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathGreaterThan(String value) {
            addCriterion("PAGE_PATH >", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathGreaterThanOrEqualTo(String value) {
            addCriterion("PAGE_PATH >=", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathLessThan(String value) {
            addCriterion("PAGE_PATH <", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathLessThanOrEqualTo(String value) {
            addCriterion("PAGE_PATH <=", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathLike(String value) {
            addCriterion("PAGE_PATH like", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathNotLike(String value) {
            addCriterion("PAGE_PATH not like", value, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathIn(List<String> values) {
            addCriterion("PAGE_PATH in", values, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathNotIn(List<String> values) {
            addCriterion("PAGE_PATH not in", values, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathBetween(String value1, String value2) {
            addCriterion("PAGE_PATH between", value1, value2, "pagePath");
            return (Criteria) this;
        }

        public Criteria andPagePathNotBetween(String value1, String value2) {
            addCriterion("PAGE_PATH not between", value1, value2, "pagePath");
            return (Criteria) this;
        }

        public Criteria andScnIsNull() {
            addCriterion("SCN is null");
            return (Criteria) this;
        }

        public Criteria andScnIsNotNull() {
            addCriterion("SCN is not null");
            return (Criteria) this;
        }

        public Criteria andScnEqualTo(String value) {
            addCriterion("SCN =", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnNotEqualTo(String value) {
            addCriterion("SCN <>", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnGreaterThan(String value) {
            addCriterion("SCN >", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnGreaterThanOrEqualTo(String value) {
            addCriterion("SCN >=", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnLessThan(String value) {
            addCriterion("SCN <", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnLessThanOrEqualTo(String value) {
            addCriterion("SCN <=", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnLike(String value) {
            addCriterion("SCN like", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnNotLike(String value) {
            addCriterion("SCN not like", value, "scn");
            return (Criteria) this;
        }

        public Criteria andScnIn(List<String> values) {
            addCriterion("SCN in", values, "scn");
            return (Criteria) this;
        }

        public Criteria andScnNotIn(List<String> values) {
            addCriterion("SCN not in", values, "scn");
            return (Criteria) this;
        }

        public Criteria andScnBetween(String value1, String value2) {
            addCriterion("SCN between", value1, value2, "scn");
            return (Criteria) this;
        }

        public Criteria andScnNotBetween(String value1, String value2) {
            addCriterion("SCN not between", value1, value2, "scn");
            return (Criteria) this;
        }

        public Criteria andTcnIsNull() {
            addCriterion("TCN is null");
            return (Criteria) this;
        }

        public Criteria andTcnIsNotNull() {
            addCriterion("TCN is not null");
            return (Criteria) this;
        }

        public Criteria andTcnEqualTo(String value) {
            addCriterion("TCN =", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnNotEqualTo(String value) {
            addCriterion("TCN <>", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnGreaterThan(String value) {
            addCriterion("TCN >", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnGreaterThanOrEqualTo(String value) {
            addCriterion("TCN >=", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnLessThan(String value) {
            addCriterion("TCN <", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnLessThanOrEqualTo(String value) {
            addCriterion("TCN <=", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnLike(String value) {
            addCriterion("TCN like", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnNotLike(String value) {
            addCriterion("TCN not like", value, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnIn(List<String> values) {
            addCriterion("TCN in", values, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnNotIn(List<String> values) {
            addCriterion("TCN not in", values, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnBetween(String value1, String value2) {
            addCriterion("TCN between", value1, value2, "tcn");
            return (Criteria) this;
        }

        public Criteria andTcnNotBetween(String value1, String value2) {
            addCriterion("TCN not between", value1, value2, "tcn");
            return (Criteria) this;
        }

        public Criteria andEnIsNull() {
            addCriterion("EN is null");
            return (Criteria) this;
        }

        public Criteria andEnIsNotNull() {
            addCriterion("EN is not null");
            return (Criteria) this;
        }

        public Criteria andEnEqualTo(String value) {
            addCriterion("EN =", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotEqualTo(String value) {
            addCriterion("EN <>", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThan(String value) {
            addCriterion("EN >", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThanOrEqualTo(String value) {
            addCriterion("EN >=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThan(String value) {
            addCriterion("EN <", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThanOrEqualTo(String value) {
            addCriterion("EN <=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLike(String value) {
            addCriterion("EN like", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotLike(String value) {
            addCriterion("EN not like", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnIn(List<String> values) {
            addCriterion("EN in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotIn(List<String> values) {
            addCriterion("EN not in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnBetween(String value1, String value2) {
            addCriterion("EN between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotBetween(String value1, String value2) {
            addCriterion("EN not between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andJpIsNull() {
            addCriterion("JP is null");
            return (Criteria) this;
        }

        public Criteria andJpIsNotNull() {
            addCriterion("JP is not null");
            return (Criteria) this;
        }

        public Criteria andJpEqualTo(String value) {
            addCriterion("JP =", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpNotEqualTo(String value) {
            addCriterion("JP <>", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpGreaterThan(String value) {
            addCriterion("JP >", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpGreaterThanOrEqualTo(String value) {
            addCriterion("JP >=", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpLessThan(String value) {
            addCriterion("JP <", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpLessThanOrEqualTo(String value) {
            addCriterion("JP <=", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpLike(String value) {
            addCriterion("JP like", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpNotLike(String value) {
            addCriterion("JP not like", value, "jp");
            return (Criteria) this;
        }

        public Criteria andJpIn(List<String> values) {
            addCriterion("JP in", values, "jp");
            return (Criteria) this;
        }

        public Criteria andJpNotIn(List<String> values) {
            addCriterion("JP not in", values, "jp");
            return (Criteria) this;
        }

        public Criteria andJpBetween(String value1, String value2) {
            addCriterion("JP between", value1, value2, "jp");
            return (Criteria) this;
        }

        public Criteria andJpNotBetween(String value1, String value2) {
            addCriterion("JP not between", value1, value2, "jp");
            return (Criteria) this;
        }

        public Criteria andKrIsNull() {
            addCriterion("KR is null");
            return (Criteria) this;
        }

        public Criteria andKrIsNotNull() {
            addCriterion("KR is not null");
            return (Criteria) this;
        }

        public Criteria andKrEqualTo(String value) {
            addCriterion("KR =", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrNotEqualTo(String value) {
            addCriterion("KR <>", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrGreaterThan(String value) {
            addCriterion("KR >", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrGreaterThanOrEqualTo(String value) {
            addCriterion("KR >=", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrLessThan(String value) {
            addCriterion("KR <", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrLessThanOrEqualTo(String value) {
            addCriterion("KR <=", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrLike(String value) {
            addCriterion("KR like", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrNotLike(String value) {
            addCriterion("KR not like", value, "kr");
            return (Criteria) this;
        }

        public Criteria andKrIn(List<String> values) {
            addCriterion("KR in", values, "kr");
            return (Criteria) this;
        }

        public Criteria andKrNotIn(List<String> values) {
            addCriterion("KR not in", values, "kr");
            return (Criteria) this;
        }

        public Criteria andKrBetween(String value1, String value2) {
            addCriterion("KR between", value1, value2, "kr");
            return (Criteria) this;
        }

        public Criteria andKrNotBetween(String value1, String value2) {
            addCriterion("KR not between", value1, value2, "kr");
            return (Criteria) this;
        }

        public Criteria andFrIsNull() {
            addCriterion("FR is null");
            return (Criteria) this;
        }

        public Criteria andFrIsNotNull() {
            addCriterion("FR is not null");
            return (Criteria) this;
        }

        public Criteria andFrEqualTo(String value) {
            addCriterion("FR =", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotEqualTo(String value) {
            addCriterion("FR <>", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrGreaterThan(String value) {
            addCriterion("FR >", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrGreaterThanOrEqualTo(String value) {
            addCriterion("FR >=", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLessThan(String value) {
            addCriterion("FR <", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLessThanOrEqualTo(String value) {
            addCriterion("FR <=", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrLike(String value) {
            addCriterion("FR like", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotLike(String value) {
            addCriterion("FR not like", value, "fr");
            return (Criteria) this;
        }

        public Criteria andFrIn(List<String> values) {
            addCriterion("FR in", values, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotIn(List<String> values) {
            addCriterion("FR not in", values, "fr");
            return (Criteria) this;
        }

        public Criteria andFrBetween(String value1, String value2) {
            addCriterion("FR between", value1, value2, "fr");
            return (Criteria) this;
        }

        public Criteria andFrNotBetween(String value1, String value2) {
            addCriterion("FR not between", value1, value2, "fr");
            return (Criteria) this;
        }

        public Criteria andRaIsNull() {
            addCriterion("RA is null");
            return (Criteria) this;
        }

        public Criteria andRaIsNotNull() {
            addCriterion("RA is not null");
            return (Criteria) this;
        }

        public Criteria andRaEqualTo(String value) {
            addCriterion("RA =", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotEqualTo(String value) {
            addCriterion("RA <>", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaGreaterThan(String value) {
            addCriterion("RA >", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaGreaterThanOrEqualTo(String value) {
            addCriterion("RA >=", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaLessThan(String value) {
            addCriterion("RA <", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaLessThanOrEqualTo(String value) {
            addCriterion("RA <=", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaLike(String value) {
            addCriterion("RA like", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotLike(String value) {
            addCriterion("RA not like", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaIn(List<String> values) {
            addCriterion("RA in", values, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotIn(List<String> values) {
            addCriterion("RA not in", values, "ra");
            return (Criteria) this;
        }

        public Criteria andRaBetween(String value1, String value2) {
            addCriterion("RA between", value1, value2, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotBetween(String value1, String value2) {
            addCriterion("RA not between", value1, value2, "ra");
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