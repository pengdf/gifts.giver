/*
 * GiftpageExample.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.model.wx;

import java.util.ArrayList;
import java.util.List;

public class GiftpageExample {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public GiftpageExample() {
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

    /**
     * 
     * 
     * @author JeffieChan
     * @version 1.0 2016-12-14 17:27
     */
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
        public Criteria andGiftnameIsNull() {
            addCriterion("giftName is null");
            return (Criteria) this;
        }
        public Criteria andGiftnameIsNotNull() {
            addCriterion("giftName is not null");
            return (Criteria) this;
        }
        public Criteria andGiftnameEqualTo(String value) {
            addCriterion("giftName =", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameNotEqualTo(String value) {
            addCriterion("giftName <>", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameGreaterThan(String value) {
            addCriterion("giftName >", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameGreaterThanOrEqualTo(String value) {
            addCriterion("giftName >=", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameLessThan(String value) {
            addCriterion("giftName <", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameLessThanOrEqualTo(String value) {
            addCriterion("giftName <=", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameLike(String value) {
            addCriterion("giftName like", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameNotLike(String value) {
            addCriterion("giftName not like", value, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameIn(List<String> values) {
            addCriterion("giftName in", values, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameNotIn(List<String> values) {
            addCriterion("giftName not in", values, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameBetween(String value1, String value2) {
            addCriterion("giftName between", value1, value2, "giftname");
            return (Criteria) this;
        }
        public Criteria andGiftnameNotBetween(String value1, String value2) {
            addCriterion("giftName not between", value1, value2, "giftname");
            return (Criteria) this;
        }
        public Criteria andGifttotalIsNull() {
            addCriterion("giftTotal is null");
            return (Criteria) this;
        }
        public Criteria andGifttotalIsNotNull() {
            addCriterion("giftTotal is not null");
            return (Criteria) this;
        }
        public Criteria andGifttotalEqualTo(Long value) {
            addCriterion("giftTotal =", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalNotEqualTo(Long value) {
            addCriterion("giftTotal <>", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalGreaterThan(Long value) {
            addCriterion("giftTotal >", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalGreaterThanOrEqualTo(Long value) {
            addCriterion("giftTotal >=", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalLessThan(Long value) {
            addCriterion("giftTotal <", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalLessThanOrEqualTo(Long value) {
            addCriterion("giftTotal <=", value, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalIn(List<Long> values) {
            addCriterion("giftTotal in", values, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalNotIn(List<Long> values) {
            addCriterion("giftTotal not in", values, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalBetween(Long value1, Long value2) {
            addCriterion("giftTotal between", value1, value2, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGifttotalNotBetween(Long value1, Long value2) {
            addCriterion("giftTotal not between", value1, value2, "gifttotal");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsIsNull() {
            addCriterion("giftDetails is null");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsIsNotNull() {
            addCriterion("giftDetails is not null");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsEqualTo(String value) {
            addCriterion("giftDetails =", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsNotEqualTo(String value) {
            addCriterion("giftDetails <>", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsGreaterThan(String value) {
            addCriterion("giftDetails >", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("giftDetails >=", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsLessThan(String value) {
            addCriterion("giftDetails <", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsLessThanOrEqualTo(String value) {
            addCriterion("giftDetails <=", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsLike(String value) {
            addCriterion("giftDetails like", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsNotLike(String value) {
            addCriterion("giftDetails not like", value, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsIn(List<String> values) {
            addCriterion("giftDetails in", values, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsNotIn(List<String> values) {
            addCriterion("giftDetails not in", values, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsBetween(String value1, String value2) {
            addCriterion("giftDetails between", value1, value2, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGiftdetailsNotBetween(String value1, String value2) {
            addCriterion("giftDetails not between", value1, value2, "giftdetails");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdIsNull() {
            addCriterion("giftType_id is null");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdIsNotNull() {
            addCriterion("giftType_id is not null");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdEqualTo(Long value) {
            addCriterion("giftType_id =", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdNotEqualTo(Long value) {
            addCriterion("giftType_id <>", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdGreaterThan(Long value) {
            addCriterion("giftType_id >", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("giftType_id >=", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdLessThan(Long value) {
            addCriterion("giftType_id <", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdLessThanOrEqualTo(Long value) {
            addCriterion("giftType_id <=", value, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdIn(List<Long> values) {
            addCriterion("giftType_id in", values, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdNotIn(List<Long> values) {
            addCriterion("giftType_id not in", values, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdBetween(Long value1, Long value2) {
            addCriterion("giftType_id between", value1, value2, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGifttypeIdNotBetween(Long value1, Long value2) {
            addCriterion("giftType_id not between", value1, value2, "gifttypeId");
            return (Criteria) this;
        }
        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }
        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }
        public Criteria andGameIdEqualTo(Long value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdNotEqualTo(Long value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdGreaterThan(Long value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdGreaterThanOrEqualTo(Long value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdLessThan(Long value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdLessThanOrEqualTo(Long value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdIn(List<Long> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdNotIn(List<Long> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdBetween(Long value1, Long value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }
        public Criteria andGameIdNotBetween(Long value1, Long value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }
        public Criteria andGiftnumIsNull() {
            addCriterion("giftNum is null");
            return (Criteria) this;
        }
        public Criteria andGiftnumIsNotNull() {
            addCriterion("giftNum is not null");
            return (Criteria) this;
        }
        public Criteria andGiftnumEqualTo(Long value) {
            addCriterion("giftNum =", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumNotEqualTo(Long value) {
            addCriterion("giftNum <>", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumGreaterThan(Long value) {
            addCriterion("giftNum >", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumGreaterThanOrEqualTo(Long value) {
            addCriterion("giftNum >=", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumLessThan(Long value) {
            addCriterion("giftNum <", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumLessThanOrEqualTo(Long value) {
            addCriterion("giftNum <=", value, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumIn(List<Long> values) {
            addCriterion("giftNum in", values, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumNotIn(List<Long> values) {
            addCriterion("giftNum not in", values, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumBetween(Long value1, Long value2) {
            addCriterion("giftNum between", value1, value2, "giftnum");
            return (Criteria) this;
        }
        public Criteria andGiftnumNotBetween(Long value1, Long value2) {
            addCriterion("giftNum not between", value1, value2, "giftnum");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdIsNull() {
            addCriterion("codeType_id is null");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdIsNotNull() {
            addCriterion("codeType_id is not null");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdEqualTo(Long value) {
            addCriterion("codeType_id =", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdNotEqualTo(Long value) {
            addCriterion("codeType_id <>", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdGreaterThan(Long value) {
            addCriterion("codeType_id >", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("codeType_id >=", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdLessThan(Long value) {
            addCriterion("codeType_id <", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdLessThanOrEqualTo(Long value) {
            addCriterion("codeType_id <=", value, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdIn(List<Long> values) {
            addCriterion("codeType_id in", values, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdNotIn(List<Long> values) {
            addCriterion("codeType_id not in", values, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdBetween(Long value1, Long value2) {
            addCriterion("codeType_id between", value1, value2, "codetypeId");
            return (Criteria) this;
        }
        public Criteria andCodetypeIdNotBetween(Long value1, Long value2) {
            addCriterion("codeType_id not between", value1, value2, "codetypeId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {


        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author JeffieChan
     * @version 1.0 2016-12-14 17:27
     */
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