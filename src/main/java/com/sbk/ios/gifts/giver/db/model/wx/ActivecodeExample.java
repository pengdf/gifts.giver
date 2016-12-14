/*
 * ActivecodeExample.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.model.wx;

import java.util.ArrayList;
import java.util.List;

public class ActivecodeExample {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public ActivecodeExample() {
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
        public Criteria andActivecodeIsNull() {
            addCriterion("activeCode is null");
            return (Criteria) this;
        }
        public Criteria andActivecodeIsNotNull() {
            addCriterion("activeCode is not null");
            return (Criteria) this;
        }
        public Criteria andActivecodeEqualTo(String value) {
            addCriterion("activeCode =", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeNotEqualTo(String value) {
            addCriterion("activeCode <>", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeGreaterThan(String value) {
            addCriterion("activeCode >", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeGreaterThanOrEqualTo(String value) {
            addCriterion("activeCode >=", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeLessThan(String value) {
            addCriterion("activeCode <", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeLessThanOrEqualTo(String value) {
            addCriterion("activeCode <=", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeLike(String value) {
            addCriterion("activeCode like", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeNotLike(String value) {
            addCriterion("activeCode not like", value, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeIn(List<String> values) {
            addCriterion("activeCode in", values, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeNotIn(List<String> values) {
            addCriterion("activeCode not in", values, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeBetween(String value1, String value2) {
            addCriterion("activeCode between", value1, value2, "activecode");
            return (Criteria) this;
        }
        public Criteria andActivecodeNotBetween(String value1, String value2) {
            addCriterion("activeCode not between", value1, value2, "activecode");
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
        public Criteria andChartstateIsNull() {
            addCriterion("chartState is null");
            return (Criteria) this;
        }
        public Criteria andChartstateIsNotNull() {
            addCriterion("chartState is not null");
            return (Criteria) this;
        }
        public Criteria andChartstateEqualTo(Integer value) {
            addCriterion("chartState =", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateNotEqualTo(Integer value) {
            addCriterion("chartState <>", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateGreaterThan(Integer value) {
            addCriterion("chartState >", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chartState >=", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateLessThan(Integer value) {
            addCriterion("chartState <", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateLessThanOrEqualTo(Integer value) {
            addCriterion("chartState <=", value, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateIn(List<Integer> values) {
            addCriterion("chartState in", values, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateNotIn(List<Integer> values) {
            addCriterion("chartState not in", values, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateBetween(Integer value1, Integer value2) {
            addCriterion("chartState between", value1, value2, "chartstate");
            return (Criteria) this;
        }
        public Criteria andChartstateNotBetween(Integer value1, Integer value2) {
            addCriterion("chartState not between", value1, value2, "chartstate");
            return (Criteria) this;
        }
        public Criteria andPhonenumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }
        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }
        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberLike(String value) {
            addCriterion("phoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }
        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phonenumber");
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