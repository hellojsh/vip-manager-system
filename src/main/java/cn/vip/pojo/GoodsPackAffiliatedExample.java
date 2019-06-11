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

        public Criteria andGoodsPackIdIsNull() {
            addCriterion("goods_pack_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdIsNotNull() {
            addCriterion("goods_pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdEqualTo(Long value) {
            addCriterion("goods_pack_id =", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdNotEqualTo(Long value) {
            addCriterion("goods_pack_id <>", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdGreaterThan(Long value) {
            addCriterion("goods_pack_id >", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_pack_id >=", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdLessThan(Long value) {
            addCriterion("goods_pack_id <", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_pack_id <=", value, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdIn(List<Long> values) {
            addCriterion("goods_pack_id in", values, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdNotIn(List<Long> values) {
            addCriterion("goods_pack_id not in", values, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdBetween(Long value1, Long value2) {
            addCriterion("goods_pack_id between", value1, value2, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsPackIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_pack_id not between", value1, value2, "goodsPackId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIsNull() {
            addCriterion("goods_info_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIsNotNull() {
            addCriterion("goods_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdEqualTo(Long value) {
            addCriterion("goods_info_id =", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotEqualTo(Long value) {
            addCriterion("goods_info_id <>", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdGreaterThan(Long value) {
            addCriterion("goods_info_id >", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_info_id >=", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdLessThan(Long value) {
            addCriterion("goods_info_id <", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_info_id <=", value, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdIn(List<Long> values) {
            addCriterion("goods_info_id in", values, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotIn(List<Long> values) {
            addCriterion("goods_info_id not in", values, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdBetween(Long value1, Long value2) {
            addCriterion("goods_info_id between", value1, value2, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_info_id not between", value1, value2, "goodsInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
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