package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectsendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectsendExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeIsNull() {
            addCriterion("librarytype is null");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeIsNotNull() {
            addCriterion("librarytype is not null");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeEqualTo(String value) {
            addCriterion("librarytype =", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeNotEqualTo(String value) {
            addCriterion("librarytype <>", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeGreaterThan(String value) {
            addCriterion("librarytype >", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeGreaterThanOrEqualTo(String value) {
            addCriterion("librarytype >=", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeLessThan(String value) {
            addCriterion("librarytype <", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeLessThanOrEqualTo(String value) {
            addCriterion("librarytype <=", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeLike(String value) {
            addCriterion("librarytype like", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeNotLike(String value) {
            addCriterion("librarytype not like", value, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeIn(List<String> values) {
            addCriterion("librarytype in", values, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeNotIn(List<String> values) {
            addCriterion("librarytype not in", values, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeBetween(String value1, String value2) {
            addCriterion("librarytype between", value1, value2, "librarytype");
            return (Criteria) this;
        }

        public Criteria andLibrarytypeNotBetween(String value1, String value2) {
            addCriterion("librarytype not between", value1, value2, "librarytype");
            return (Criteria) this;
        }

        public Criteria andFromprojectIsNull() {
            addCriterion("fromproject is null");
            return (Criteria) this;
        }

        public Criteria andFromprojectIsNotNull() {
            addCriterion("fromproject is not null");
            return (Criteria) this;
        }

        public Criteria andFromprojectEqualTo(String value) {
            addCriterion("fromproject =", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectNotEqualTo(String value) {
            addCriterion("fromproject <>", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectGreaterThan(String value) {
            addCriterion("fromproject >", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectGreaterThanOrEqualTo(String value) {
            addCriterion("fromproject >=", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectLessThan(String value) {
            addCriterion("fromproject <", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectLessThanOrEqualTo(String value) {
            addCriterion("fromproject <=", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectLike(String value) {
            addCriterion("fromproject like", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectNotLike(String value) {
            addCriterion("fromproject not like", value, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectIn(List<String> values) {
            addCriterion("fromproject in", values, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectNotIn(List<String> values) {
            addCriterion("fromproject not in", values, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectBetween(String value1, String value2) {
            addCriterion("fromproject between", value1, value2, "fromproject");
            return (Criteria) this;
        }

        public Criteria andFromprojectNotBetween(String value1, String value2) {
            addCriterion("fromproject not between", value1, value2, "fromproject");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andSaverateIsNull() {
            addCriterion("saverate is null");
            return (Criteria) this;
        }

        public Criteria andSaverateIsNotNull() {
            addCriterion("saverate is not null");
            return (Criteria) this;
        }

        public Criteria andSaverateEqualTo(String value) {
            addCriterion("saverate =", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateNotEqualTo(String value) {
            addCriterion("saverate <>", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateGreaterThan(String value) {
            addCriterion("saverate >", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateGreaterThanOrEqualTo(String value) {
            addCriterion("saverate >=", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateLessThan(String value) {
            addCriterion("saverate <", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateLessThanOrEqualTo(String value) {
            addCriterion("saverate <=", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateLike(String value) {
            addCriterion("saverate like", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateNotLike(String value) {
            addCriterion("saverate not like", value, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateIn(List<String> values) {
            addCriterion("saverate in", values, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateNotIn(List<String> values) {
            addCriterion("saverate not in", values, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateBetween(String value1, String value2) {
            addCriterion("saverate between", value1, value2, "saverate");
            return (Criteria) this;
        }

        public Criteria andSaverateNotBetween(String value1, String value2) {
            addCriterion("saverate not between", value1, value2, "saverate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSavesiteIsNull() {
            addCriterion("savesite is null");
            return (Criteria) this;
        }

        public Criteria andSavesiteIsNotNull() {
            addCriterion("savesite is not null");
            return (Criteria) this;
        }

        public Criteria andSavesiteEqualTo(String value) {
            addCriterion("savesite =", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteNotEqualTo(String value) {
            addCriterion("savesite <>", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteGreaterThan(String value) {
            addCriterion("savesite >", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteGreaterThanOrEqualTo(String value) {
            addCriterion("savesite >=", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteLessThan(String value) {
            addCriterion("savesite <", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteLessThanOrEqualTo(String value) {
            addCriterion("savesite <=", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteLike(String value) {
            addCriterion("savesite like", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteNotLike(String value) {
            addCriterion("savesite not like", value, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteIn(List<String> values) {
            addCriterion("savesite in", values, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteNotIn(List<String> values) {
            addCriterion("savesite not in", values, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteBetween(String value1, String value2) {
            addCriterion("savesite between", value1, value2, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavesiteNotBetween(String value1, String value2) {
            addCriterion("savesite not between", value1, value2, "savesite");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNull() {
            addCriterion("savetime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("savetime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(Date value) {
            addCriterion("savetime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(Date value) {
            addCriterion("savetime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(Date value) {
            addCriterion("savetime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("savetime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(Date value) {
            addCriterion("savetime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(Date value) {
            addCriterion("savetime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<Date> values) {
            addCriterion("savetime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<Date> values) {
            addCriterion("savetime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(Date value1, Date value2) {
            addCriterion("savetime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(Date value1, Date value2) {
            addCriterion("savetime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andFromsiteIsNull() {
            addCriterion("fromsite is null");
            return (Criteria) this;
        }

        public Criteria andFromsiteIsNotNull() {
            addCriterion("fromsite is not null");
            return (Criteria) this;
        }

        public Criteria andFromsiteEqualTo(String value) {
            addCriterion("fromsite =", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteNotEqualTo(String value) {
            addCriterion("fromsite <>", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteGreaterThan(String value) {
            addCriterion("fromsite >", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteGreaterThanOrEqualTo(String value) {
            addCriterion("fromsite >=", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteLessThan(String value) {
            addCriterion("fromsite <", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteLessThanOrEqualTo(String value) {
            addCriterion("fromsite <=", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteLike(String value) {
            addCriterion("fromsite like", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteNotLike(String value) {
            addCriterion("fromsite not like", value, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteIn(List<String> values) {
            addCriterion("fromsite in", values, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteNotIn(List<String> values) {
            addCriterion("fromsite not in", values, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteBetween(String value1, String value2) {
            addCriterion("fromsite between", value1, value2, "fromsite");
            return (Criteria) this;
        }

        public Criteria andFromsiteNotBetween(String value1, String value2) {
            addCriterion("fromsite not between", value1, value2, "fromsite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteIsNull() {
            addCriterion("receivesite is null");
            return (Criteria) this;
        }

        public Criteria andReceivesiteIsNotNull() {
            addCriterion("receivesite is not null");
            return (Criteria) this;
        }

        public Criteria andReceivesiteEqualTo(String value) {
            addCriterion("receivesite =", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteNotEqualTo(String value) {
            addCriterion("receivesite <>", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteGreaterThan(String value) {
            addCriterion("receivesite >", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteGreaterThanOrEqualTo(String value) {
            addCriterion("receivesite >=", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteLessThan(String value) {
            addCriterion("receivesite <", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteLessThanOrEqualTo(String value) {
            addCriterion("receivesite <=", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteLike(String value) {
            addCriterion("receivesite like", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteNotLike(String value) {
            addCriterion("receivesite not like", value, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteIn(List<String> values) {
            addCriterion("receivesite in", values, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteNotIn(List<String> values) {
            addCriterion("receivesite not in", values, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteBetween(String value1, String value2) {
            addCriterion("receivesite between", value1, value2, "receivesite");
            return (Criteria) this;
        }

        public Criteria andReceivesiteNotBetween(String value1, String value2) {
            addCriterion("receivesite not between", value1, value2, "receivesite");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNull() {
            addCriterion("projecttype is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNotNull() {
            addCriterion("projecttype is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeEqualTo(String value) {
            addCriterion("projecttype =", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotEqualTo(String value) {
            addCriterion("projecttype <>", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThan(String value) {
            addCriterion("projecttype >", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("projecttype >=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThan(String value) {
            addCriterion("projecttype <", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("projecttype <=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLike(String value) {
            addCriterion("projecttype like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotLike(String value) {
            addCriterion("projecttype not like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIn(List<String> values) {
            addCriterion("projecttype in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotIn(List<String> values) {
            addCriterion("projecttype not in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeBetween(String value1, String value2) {
            addCriterion("projecttype between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotBetween(String value1, String value2) {
            addCriterion("projecttype not between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andChubeitimeIsNull() {
            addCriterion("chubeitime is null");
            return (Criteria) this;
        }

        public Criteria andChubeitimeIsNotNull() {
            addCriterion("chubeitime is not null");
            return (Criteria) this;
        }

        public Criteria andChubeitimeEqualTo(Date value) {
            addCriterion("chubeitime =", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeNotEqualTo(Date value) {
            addCriterion("chubeitime <>", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeGreaterThan(Date value) {
            addCriterion("chubeitime >", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chubeitime >=", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeLessThan(Date value) {
            addCriterion("chubeitime <", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeLessThanOrEqualTo(Date value) {
            addCriterion("chubeitime <=", value, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeIn(List<Date> values) {
            addCriterion("chubeitime in", values, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeNotIn(List<Date> values) {
            addCriterion("chubeitime not in", values, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeBetween(Date value1, Date value2) {
            addCriterion("chubeitime between", value1, value2, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andChubeitimeNotBetween(Date value1, Date value2) {
            addCriterion("chubeitime not between", value1, value2, "chubeitime");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andGbindustryIsNull() {
            addCriterion("gbindustry is null");
            return (Criteria) this;
        }

        public Criteria andGbindustryIsNotNull() {
            addCriterion("gbindustry is not null");
            return (Criteria) this;
        }

        public Criteria andGbindustryEqualTo(String value) {
            addCriterion("gbindustry =", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryNotEqualTo(String value) {
            addCriterion("gbindustry <>", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryGreaterThan(String value) {
            addCriterion("gbindustry >", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryGreaterThanOrEqualTo(String value) {
            addCriterion("gbindustry >=", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryLessThan(String value) {
            addCriterion("gbindustry <", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryLessThanOrEqualTo(String value) {
            addCriterion("gbindustry <=", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryLike(String value) {
            addCriterion("gbindustry like", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryNotLike(String value) {
            addCriterion("gbindustry not like", value, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryIn(List<String> values) {
            addCriterion("gbindustry in", values, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryNotIn(List<String> values) {
            addCriterion("gbindustry not in", values, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryBetween(String value1, String value2) {
            addCriterion("gbindustry between", value1, value2, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andGbindustryNotBetween(String value1, String value2) {
            addCriterion("gbindustry not between", value1, value2, "gbindustry");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNull() {
            addCriterion("investment is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNotNull() {
            addCriterion("investment is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentEqualTo(String value) {
            addCriterion("investment =", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotEqualTo(String value) {
            addCriterion("investment <>", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThan(String value) {
            addCriterion("investment >", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("investment >=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThan(String value) {
            addCriterion("investment <", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThanOrEqualTo(String value) {
            addCriterion("investment <=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLike(String value) {
            addCriterion("investment like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotLike(String value) {
            addCriterion("investment not like", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentIn(List<String> values) {
            addCriterion("investment in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotIn(List<String> values) {
            addCriterion("investment not in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentBetween(String value1, String value2) {
            addCriterion("investment between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotBetween(String value1, String value2) {
            addCriterion("investment not between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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