package cn.vip.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsPackAffiliatedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsPackAffiliatedExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIsNull() {
            addCriterion("goodsPackId is null");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIsNotNull() {
            addCriterion("goodsPackId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspackidEqualTo(Long value) {
            addCriterion("goodsPackId =", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotEqualTo(Long value) {
            addCriterion("goodsPackId <>", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidGreaterThan(Long value) {
            addCriterion("goodsPackId >", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsPackId >=", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidLessThan(Long value) {
            addCriterion("goodsPackId <", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidLessThanOrEqualTo(Long value) {
            addCriterion("goodsPackId <=", value, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidIn(List<Long> values) {
            addCriterion("goodsPackId in", values, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotIn(List<Long> values) {
            addCriterion("goodsPackId not in", values, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidBetween(Long value1, Long value2) {
            addCriterion("goodsPackId between", value1, value2, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodspackidNotBetween(Long value1, Long value2) {
            addCriterion("goodsPackId not between", value1, value2, "goodspackid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIsNull() {
            addCriterion("goodsInfoId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIsNotNull() {
            addCriterion("goodsInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidEqualTo(Long value) {
            addCriterion("goodsInfoId =", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotEqualTo(Long value) {
            addCriterion("goodsInfoId <>", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidGreaterThan(Long value) {
            addCriterion("goodsInfoId >", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsInfoId >=", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidLessThan(Long value) {
            addCriterion("goodsInfoId <", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidLessThanOrEqualTo(Long value) {
            addCriterion("goodsInfoId <=", value, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidIn(List<Long> values) {
            addCriterion("goodsInfoId in", values, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotIn(List<Long> values) {
            addCriterion("goodsInfoId not in", values, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidBetween(Long value1, Long value2) {
            addCriterion("goodsInfoId between", value1, value2, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsinfoidNotBetween(Long value1, Long value2) {
            addCriterion("goodsInfoId not between", value1, value2, "goodsinfoid");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNull() {
            addCriterion("goodsNum is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNotNull() {
            addCriterion("goodsNum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumEqualTo(Integer value) {
            addCriterion("goodsNum =", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotEqualTo(Integer value) {
            addCriterion("goodsNum <>", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThan(Integer value) {
            addCriterion("goodsNum >", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsNum >=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThan(Integer value) {
            addCriterion("goodsNum <", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThanOrEqualTo(Integer value) {
            addCriterion("goodsNum <=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIn(List<Integer> values) {
            addCriterion("goodsNum in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotIn(List<Integer> values) {
            addCriterion("goodsNum not in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumBetween(Integer value1, Integer value2) {
            addCriterion("goodsNum between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsNum not between", value1, value2, "goodsnum");
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