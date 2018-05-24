package com.asiainfo.db.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngineRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngineRuleExample() {
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

        public Criteria andEngineIdIsNull() {
            addCriterion("ENGINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNotNull() {
            addCriterion("ENGINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIdEqualTo(BigDecimal value) {
            addCriterion("ENGINE_ID =", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotEqualTo(BigDecimal value) {
            addCriterion("ENGINE_ID <>", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThan(BigDecimal value) {
            addCriterion("ENGINE_ID >", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINE_ID >=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThan(BigDecimal value) {
            addCriterion("ENGINE_ID <", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENGINE_ID <=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdIn(List<BigDecimal> values) {
            addCriterion("ENGINE_ID in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotIn(List<BigDecimal> values) {
            addCriterion("ENGINE_ID not in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINE_ID between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENGINE_ID not between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineNameIsNull() {
            addCriterion("ENGINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEngineNameIsNotNull() {
            addCriterion("ENGINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNameEqualTo(String value) {
            addCriterion("ENGINE_NAME =", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotEqualTo(String value) {
            addCriterion("ENGINE_NAME <>", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameGreaterThan(String value) {
            addCriterion("ENGINE_NAME >", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_NAME >=", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLessThan(String value) {
            addCriterion("ENGINE_NAME <", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_NAME <=", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLike(String value) {
            addCriterion("ENGINE_NAME like", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotLike(String value) {
            addCriterion("ENGINE_NAME not like", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameIn(List<String> values) {
            addCriterion("ENGINE_NAME in", values, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotIn(List<String> values) {
            addCriterion("ENGINE_NAME not in", values, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameBetween(String value1, String value2) {
            addCriterion("ENGINE_NAME between", value1, value2, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotBetween(String value1, String value2) {
            addCriterion("ENGINE_NAME not between", value1, value2, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIsNull() {
            addCriterion("ENGINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIsNotNull() {
            addCriterion("ENGINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineCodeEqualTo(String value) {
            addCriterion("ENGINE_CODE =", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotEqualTo(String value) {
            addCriterion("ENGINE_CODE <>", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeGreaterThan(String value) {
            addCriterion("ENGINE_CODE >", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_CODE >=", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLessThan(String value) {
            addCriterion("ENGINE_CODE <", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_CODE <=", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLike(String value) {
            addCriterion("ENGINE_CODE like", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotLike(String value) {
            addCriterion("ENGINE_CODE not like", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIn(List<String> values) {
            addCriterion("ENGINE_CODE in", values, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotIn(List<String> values) {
            addCriterion("ENGINE_CODE not in", values, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeBetween(String value1, String value2) {
            addCriterion("ENGINE_CODE between", value1, value2, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotBetween(String value1, String value2) {
            addCriterion("ENGINE_CODE not between", value1, value2, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineFileIsNull() {
            addCriterion("ENGINE_FILE is null");
            return (Criteria) this;
        }

        public Criteria andEngineFileIsNotNull() {
            addCriterion("ENGINE_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineFileEqualTo(String value) {
            addCriterion("ENGINE_FILE =", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileNotEqualTo(String value) {
            addCriterion("ENGINE_FILE <>", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileGreaterThan(String value) {
            addCriterion("ENGINE_FILE >", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_FILE >=", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileLessThan(String value) {
            addCriterion("ENGINE_FILE <", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_FILE <=", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileLike(String value) {
            addCriterion("ENGINE_FILE like", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileNotLike(String value) {
            addCriterion("ENGINE_FILE not like", value, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileIn(List<String> values) {
            addCriterion("ENGINE_FILE in", values, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileNotIn(List<String> values) {
            addCriterion("ENGINE_FILE not in", values, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileBetween(String value1, String value2) {
            addCriterion("ENGINE_FILE between", value1, value2, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineFileNotBetween(String value1, String value2) {
            addCriterion("ENGINE_FILE not between", value1, value2, "engineFile");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionIsNull() {
            addCriterion("ENGINE_EXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionIsNotNull() {
            addCriterion("ENGINE_EXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionEqualTo(String value) {
            addCriterion("ENGINE_EXPRESSION =", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionNotEqualTo(String value) {
            addCriterion("ENGINE_EXPRESSION <>", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionGreaterThan(String value) {
            addCriterion("ENGINE_EXPRESSION >", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_EXPRESSION >=", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionLessThan(String value) {
            addCriterion("ENGINE_EXPRESSION <", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_EXPRESSION <=", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionLike(String value) {
            addCriterion("ENGINE_EXPRESSION like", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionNotLike(String value) {
            addCriterion("ENGINE_EXPRESSION not like", value, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionIn(List<String> values) {
            addCriterion("ENGINE_EXPRESSION in", values, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionNotIn(List<String> values) {
            addCriterion("ENGINE_EXPRESSION not in", values, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionBetween(String value1, String value2) {
            addCriterion("ENGINE_EXPRESSION between", value1, value2, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineExpressionNotBetween(String value1, String value2) {
            addCriterion("ENGINE_EXPRESSION not between", value1, value2, "engineExpression");
            return (Criteria) this;
        }

        public Criteria andEngineValueIsNull() {
            addCriterion("ENGINE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andEngineValueIsNotNull() {
            addCriterion("ENGINE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineValueEqualTo(String value) {
            addCriterion("ENGINE_VALUE =", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueNotEqualTo(String value) {
            addCriterion("ENGINE_VALUE <>", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueGreaterThan(String value) {
            addCriterion("ENGINE_VALUE >", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_VALUE >=", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueLessThan(String value) {
            addCriterion("ENGINE_VALUE <", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_VALUE <=", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueLike(String value) {
            addCriterion("ENGINE_VALUE like", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueNotLike(String value) {
            addCriterion("ENGINE_VALUE not like", value, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueIn(List<String> values) {
            addCriterion("ENGINE_VALUE in", values, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueNotIn(List<String> values) {
            addCriterion("ENGINE_VALUE not in", values, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueBetween(String value1, String value2) {
            addCriterion("ENGINE_VALUE between", value1, value2, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineValueNotBetween(String value1, String value2) {
            addCriterion("ENGINE_VALUE not between", value1, value2, "engineValue");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionIsNull() {
            addCriterion("ENGINE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionIsNotNull() {
            addCriterion("ENGINE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionEqualTo(String value) {
            addCriterion("ENGINE_DESCRIPTION =", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionNotEqualTo(String value) {
            addCriterion("ENGINE_DESCRIPTION <>", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionGreaterThan(String value) {
            addCriterion("ENGINE_DESCRIPTION >", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_DESCRIPTION >=", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionLessThan(String value) {
            addCriterion("ENGINE_DESCRIPTION <", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_DESCRIPTION <=", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionLike(String value) {
            addCriterion("ENGINE_DESCRIPTION like", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionNotLike(String value) {
            addCriterion("ENGINE_DESCRIPTION not like", value, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionIn(List<String> values) {
            addCriterion("ENGINE_DESCRIPTION in", values, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionNotIn(List<String> values) {
            addCriterion("ENGINE_DESCRIPTION not in", values, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionBetween(String value1, String value2) {
            addCriterion("ENGINE_DESCRIPTION between", value1, value2, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andEngineDescriptionNotBetween(String value1, String value2) {
            addCriterion("ENGINE_DESCRIPTION not between", value1, value2, "engineDescription");
            return (Criteria) this;
        }

        public Criteria andErrInfoIsNull() {
            addCriterion("ERR_INFO is null");
            return (Criteria) this;
        }

        public Criteria andErrInfoIsNotNull() {
            addCriterion("ERR_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andErrInfoEqualTo(String value) {
            addCriterion("ERR_INFO =", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoNotEqualTo(String value) {
            addCriterion("ERR_INFO <>", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoGreaterThan(String value) {
            addCriterion("ERR_INFO >", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ERR_INFO >=", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoLessThan(String value) {
            addCriterion("ERR_INFO <", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoLessThanOrEqualTo(String value) {
            addCriterion("ERR_INFO <=", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoLike(String value) {
            addCriterion("ERR_INFO like", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoNotLike(String value) {
            addCriterion("ERR_INFO not like", value, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoIn(List<String> values) {
            addCriterion("ERR_INFO in", values, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoNotIn(List<String> values) {
            addCriterion("ERR_INFO not in", values, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoBetween(String value1, String value2) {
            addCriterion("ERR_INFO between", value1, value2, "errInfo");
            return (Criteria) this;
        }

        public Criteria andErrInfoNotBetween(String value1, String value2) {
            addCriterion("ERR_INFO not between", value1, value2, "errInfo");
            return (Criteria) this;
        }

        public Criteria andEngineWayIsNull() {
            addCriterion("ENGINE_WAY is null");
            return (Criteria) this;
        }

        public Criteria andEngineWayIsNotNull() {
            addCriterion("ENGINE_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andEngineWayEqualTo(String value) {
            addCriterion("ENGINE_WAY =", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayNotEqualTo(String value) {
            addCriterion("ENGINE_WAY <>", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayGreaterThan(String value) {
            addCriterion("ENGINE_WAY >", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_WAY >=", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayLessThan(String value) {
            addCriterion("ENGINE_WAY <", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_WAY <=", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayLike(String value) {
            addCriterion("ENGINE_WAY like", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayNotLike(String value) {
            addCriterion("ENGINE_WAY not like", value, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayIn(List<String> values) {
            addCriterion("ENGINE_WAY in", values, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayNotIn(List<String> values) {
            addCriterion("ENGINE_WAY not in", values, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayBetween(String value1, String value2) {
            addCriterion("ENGINE_WAY between", value1, value2, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineWayNotBetween(String value1, String value2) {
            addCriterion("ENGINE_WAY not between", value1, value2, "engineWay");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioIsNull() {
            addCriterion("ENGINE_SCENARIO is null");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioIsNotNull() {
            addCriterion("ENGINE_SCENARIO is not null");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioEqualTo(String value) {
            addCriterion("ENGINE_SCENARIO =", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioNotEqualTo(String value) {
            addCriterion("ENGINE_SCENARIO <>", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioGreaterThan(String value) {
            addCriterion("ENGINE_SCENARIO >", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_SCENARIO >=", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioLessThan(String value) {
            addCriterion("ENGINE_SCENARIO <", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_SCENARIO <=", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioLike(String value) {
            addCriterion("ENGINE_SCENARIO like", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioNotLike(String value) {
            addCriterion("ENGINE_SCENARIO not like", value, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioIn(List<String> values) {
            addCriterion("ENGINE_SCENARIO in", values, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioNotIn(List<String> values) {
            addCriterion("ENGINE_SCENARIO not in", values, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioBetween(String value1, String value2) {
            addCriterion("ENGINE_SCENARIO between", value1, value2, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andEngineScenarioNotBetween(String value1, String value2) {
            addCriterion("ENGINE_SCENARIO not between", value1, value2, "engineScenario");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("BUSINESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("BUSINESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("BUSINESS_CODE =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_CODE <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("BUSINESS_CODE >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("BUSINESS_CODE <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("BUSINESS_CODE like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("BUSINESS_CODE not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("BUSINESS_CODE in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_CODE not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
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