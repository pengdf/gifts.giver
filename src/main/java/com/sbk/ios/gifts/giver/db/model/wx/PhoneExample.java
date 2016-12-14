/*
 * PhoneExample.java
 * Copyright(C) 2015-2016 JeffieChan
 * All rights reserved.
 * -----------------------------------------------
 * 2016-12-14 17:27 Created
 */
package com.sbk.ios.gifts.giver.db.model.wx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhoneExample {

    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public PhoneExample() {
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
        public Criteria andActivestateIsNull() {
            addCriterion("activeState is null");
            return (Criteria) this;
        }
        public Criteria andActivestateIsNotNull() {
            addCriterion("activeState is not null");
            return (Criteria) this;
        }
        public Criteria andActivestateEqualTo(Integer value) {
            addCriterion("activeState =", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateNotEqualTo(Integer value) {
            addCriterion("activeState <>", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateGreaterThan(Integer value) {
            addCriterion("activeState >", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activeState >=", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateLessThan(Integer value) {
            addCriterion("activeState <", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateLessThanOrEqualTo(Integer value) {
            addCriterion("activeState <=", value, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateIn(List<Integer> values) {
            addCriterion("activeState in", values, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateNotIn(List<Integer> values) {
            addCriterion("activeState not in", values, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateBetween(Integer value1, Integer value2) {
            addCriterion("activeState between", value1, value2, "activestate");
            return (Criteria) this;
        }
        public Criteria andActivestateNotBetween(Integer value1, Integer value2) {
            addCriterion("activeState not between", value1, value2, "activestate");
            return (Criteria) this;
        }
        public Criteria andCookienumberIsNull() {
            addCriterion("cookieNumber is null");
            return (Criteria) this;
        }
        public Criteria andCookienumberIsNotNull() {
            addCriterion("cookieNumber is not null");
            return (Criteria) this;
        }
        public Criteria andCookienumberEqualTo(String value) {
            addCriterion("cookieNumber =", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberNotEqualTo(String value) {
            addCriterion("cookieNumber <>", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberGreaterThan(String value) {
            addCriterion("cookieNumber >", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberGreaterThanOrEqualTo(String value) {
            addCriterion("cookieNumber >=", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberLessThan(String value) {
            addCriterion("cookieNumber <", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberLessThanOrEqualTo(String value) {
            addCriterion("cookieNumber <=", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberLike(String value) {
            addCriterion("cookieNumber like", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberNotLike(String value) {
            addCriterion("cookieNumber not like", value, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberIn(List<String> values) {
            addCriterion("cookieNumber in", values, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberNotIn(List<String> values) {
            addCriterion("cookieNumber not in", values, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberBetween(String value1, String value2) {
            addCriterion("cookieNumber between", value1, value2, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andCookienumberNotBetween(String value1, String value2) {
            addCriterion("cookieNumber not between", value1, value2, "cookienumber");
            return (Criteria) this;
        }
        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }
        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }
        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }
        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }
        public Criteria andVerifycodeIsNull() {
            addCriterion("verifyCode is null");
            return (Criteria) this;
        }
        public Criteria andVerifycodeIsNotNull() {
            addCriterion("verifyCode is not null");
            return (Criteria) this;
        }
        public Criteria andVerifycodeEqualTo(String value) {
            addCriterion("verifyCode =", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeNotEqualTo(String value) {
            addCriterion("verifyCode <>", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeGreaterThan(String value) {
            addCriterion("verifyCode >", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeGreaterThanOrEqualTo(String value) {
            addCriterion("verifyCode >=", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeLessThan(String value) {
            addCriterion("verifyCode <", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeLessThanOrEqualTo(String value) {
            addCriterion("verifyCode <=", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeLike(String value) {
            addCriterion("verifyCode like", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeNotLike(String value) {
            addCriterion("verifyCode not like", value, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeIn(List<String> values) {
            addCriterion("verifyCode in", values, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeNotIn(List<String> values) {
            addCriterion("verifyCode not in", values, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeBetween(String value1, String value2) {
            addCriterion("verifyCode between", value1, value2, "verifycode");
            return (Criteria) this;
        }
        public Criteria andVerifycodeNotBetween(String value1, String value2) {
            addCriterion("verifyCode not between", value1, value2, "verifycode");
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