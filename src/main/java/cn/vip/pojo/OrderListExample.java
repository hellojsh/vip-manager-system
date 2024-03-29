package cn.vip.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderListExample() {
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

        public Criteria andListIdIsNull() {
            addCriterion("LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(String value) {
            addCriterion("LIST_ID =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(String value) {
            addCriterion("LIST_ID <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(String value) {
            addCriterion("LIST_ID >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_ID >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(String value) {
            addCriterion("LIST_ID <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(String value) {
            addCriterion("LIST_ID <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLike(String value) {
            addCriterion("LIST_ID like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotLike(String value) {
            addCriterion("LIST_ID not like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<String> values) {
            addCriterion("LIST_ID in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<String> values) {
            addCriterion("LIST_ID not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(String value1, String value2) {
            addCriterion("LIST_ID between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(String value1, String value2) {
            addCriterion("LIST_ID not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("GOODS_ID like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("GOODS_ID not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("GOODS_SN is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("GOODS_SN is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("GOODS_SN =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("GOODS_SN <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("GOODS_SN >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SN >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("GOODS_SN <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SN <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("GOODS_SN like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("GOODS_SN not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("GOODS_SN in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("GOODS_SN not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("GOODS_SN between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("GOODS_SN not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIsNull() {
            addCriterion("GOODS_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIsNotNull() {
            addCriterion("GOODS_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatEqualTo(String value) {
            addCriterion("GOODS_FORMAT =", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotEqualTo(String value) {
            addCriterion("GOODS_FORMAT <>", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatGreaterThan(String value) {
            addCriterion("GOODS_FORMAT >", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_FORMAT >=", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLessThan(String value) {
            addCriterion("GOODS_FORMAT <", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLessThanOrEqualTo(String value) {
            addCriterion("GOODS_FORMAT <=", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLike(String value) {
            addCriterion("GOODS_FORMAT like", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotLike(String value) {
            addCriterion("GOODS_FORMAT not like", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIn(List<String> values) {
            addCriterion("GOODS_FORMAT in", values, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotIn(List<String> values) {
            addCriterion("GOODS_FORMAT not in", values, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatBetween(String value1, String value2) {
            addCriterion("GOODS_FORMAT between", value1, value2, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotBetween(String value1, String value2) {
            addCriterion("GOODS_FORMAT not between", value1, value2, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("GOODS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("GOODS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("GOODS_NUM =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("GOODS_NUM <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("GOODS_NUM >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("GOODS_NUM <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_NUM <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("GOODS_NUM in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("GOODS_NUM not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_NUM not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andEachPriceIsNull() {
            addCriterion("EACH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEachPriceIsNotNull() {
            addCriterion("EACH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEachPriceEqualTo(BigDecimal value) {
            addCriterion("EACH_PRICE =", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceNotEqualTo(BigDecimal value) {
            addCriterion("EACH_PRICE <>", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceGreaterThan(BigDecimal value) {
            addCriterion("EACH_PRICE >", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EACH_PRICE >=", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceLessThan(BigDecimal value) {
            addCriterion("EACH_PRICE <", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EACH_PRICE <=", value, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceIn(List<BigDecimal> values) {
            addCriterion("EACH_PRICE in", values, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceNotIn(List<BigDecimal> values) {
            addCriterion("EACH_PRICE not in", values, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EACH_PRICE between", value1, value2, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andEachPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EACH_PRICE not between", value1, value2, "eachPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNull() {
            addCriterion("SUM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSumPriceIsNotNull() {
            addCriterion("SUM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSumPriceEqualTo(BigDecimal value) {
            addCriterion("SUM_PRICE =", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("SUM_PRICE <>", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThan(BigDecimal value) {
            addCriterion("SUM_PRICE >", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_PRICE >=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThan(BigDecimal value) {
            addCriterion("SUM_PRICE <", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_PRICE <=", value, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceIn(List<BigDecimal> values) {
            addCriterion("SUM_PRICE in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("SUM_PRICE not in", values, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_PRICE between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_PRICE not between", value1, value2, "sumPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("REAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("REAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(BigDecimal value) {
            addCriterion("REAL_PRICE >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(BigDecimal value) {
            addCriterion("REAL_PRICE <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PRICE <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<BigDecimal> values) {
            addCriterion("REAL_PRICE in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("REAL_PRICE not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PRICE between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PRICE not between", value1, value2, "realPrice");
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

        public Criteria andRealPvIsNull() {
            addCriterion("REAL_PV is null");
            return (Criteria) this;
        }

        public Criteria andRealPvIsNotNull() {
            addCriterion("REAL_PV is not null");
            return (Criteria) this;
        }

        public Criteria andRealPvEqualTo(BigDecimal value) {
            addCriterion("REAL_PV =", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvNotEqualTo(BigDecimal value) {
            addCriterion("REAL_PV <>", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvGreaterThan(BigDecimal value) {
            addCriterion("REAL_PV >", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PV >=", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvLessThan(BigDecimal value) {
            addCriterion("REAL_PV <", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_PV <=", value, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvIn(List<BigDecimal> values) {
            addCriterion("REAL_PV in", values, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvNotIn(List<BigDecimal> values) {
            addCriterion("REAL_PV not in", values, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PV between", value1, value2, "realPv");
            return (Criteria) this;
        }

        public Criteria andRealPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_PV not between", value1, value2, "realPv");
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