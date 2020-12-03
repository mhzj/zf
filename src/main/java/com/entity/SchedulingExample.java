package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingExample() {
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

        public Criteria andSchedulingidIsNull() {
            addCriterion("schedulingid is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIsNotNull() {
            addCriterion("schedulingid is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidEqualTo(Integer value) {
            addCriterion("schedulingid =", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotEqualTo(Integer value) {
            addCriterion("schedulingid <>", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThan(Integer value) {
            addCriterion("schedulingid >", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedulingid >=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThan(Integer value) {
            addCriterion("schedulingid <", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThanOrEqualTo(Integer value) {
            addCriterion("schedulingid <=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIn(List<Integer> values) {
            addCriterion("schedulingid in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotIn(List<Integer> values) {
            addCriterion("schedulingid not in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidBetween(Integer value1, Integer value2) {
            addCriterion("schedulingid between", value1, value2, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotBetween(Integer value1, Integer value2) {
            addCriterion("schedulingid not between", value1, value2, "schedulingid");
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

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("stype like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("stype not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNull() {
            addCriterion("snumber is null");
            return (Criteria) this;
        }

        public Criteria andSnumberIsNotNull() {
            addCriterion("snumber is not null");
            return (Criteria) this;
        }

        public Criteria andSnumberEqualTo(String value) {
            addCriterion("snumber =", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotEqualTo(String value) {
            addCriterion("snumber <>", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThan(String value) {
            addCriterion("snumber >", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberGreaterThanOrEqualTo(String value) {
            addCriterion("snumber >=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThan(String value) {
            addCriterion("snumber <", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLessThanOrEqualTo(String value) {
            addCriterion("snumber <=", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberLike(String value) {
            addCriterion("snumber like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotLike(String value) {
            addCriterion("snumber not like", value, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberIn(List<String> values) {
            addCriterion("snumber in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotIn(List<String> values) {
            addCriterion("snumber not in", values, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberBetween(String value1, String value2) {
            addCriterion("snumber between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andSnumberNotBetween(String value1, String value2) {
            addCriterion("snumber not between", value1, value2, "snumber");
            return (Criteria) this;
        }

        public Criteria andWritestatusIsNull() {
            addCriterion("writestatus is null");
            return (Criteria) this;
        }

        public Criteria andWritestatusIsNotNull() {
            addCriterion("writestatus is not null");
            return (Criteria) this;
        }

        public Criteria andWritestatusEqualTo(String value) {
            addCriterion("writestatus =", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusNotEqualTo(String value) {
            addCriterion("writestatus <>", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusGreaterThan(String value) {
            addCriterion("writestatus >", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusGreaterThanOrEqualTo(String value) {
            addCriterion("writestatus >=", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusLessThan(String value) {
            addCriterion("writestatus <", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusLessThanOrEqualTo(String value) {
            addCriterion("writestatus <=", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusLike(String value) {
            addCriterion("writestatus like", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusNotLike(String value) {
            addCriterion("writestatus not like", value, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusIn(List<String> values) {
            addCriterion("writestatus in", values, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusNotIn(List<String> values) {
            addCriterion("writestatus not in", values, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusBetween(String value1, String value2) {
            addCriterion("writestatus between", value1, value2, "writestatus");
            return (Criteria) this;
        }

        public Criteria andWritestatusNotBetween(String value1, String value2) {
            addCriterion("writestatus not between", value1, value2, "writestatus");
            return (Criteria) this;
        }

        public Criteria andDayunitIsNull() {
            addCriterion("dayunit is null");
            return (Criteria) this;
        }

        public Criteria andDayunitIsNotNull() {
            addCriterion("dayunit is not null");
            return (Criteria) this;
        }

        public Criteria andDayunitEqualTo(String value) {
            addCriterion("dayunit =", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitNotEqualTo(String value) {
            addCriterion("dayunit <>", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitGreaterThan(String value) {
            addCriterion("dayunit >", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitGreaterThanOrEqualTo(String value) {
            addCriterion("dayunit >=", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitLessThan(String value) {
            addCriterion("dayunit <", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitLessThanOrEqualTo(String value) {
            addCriterion("dayunit <=", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitLike(String value) {
            addCriterion("dayunit like", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitNotLike(String value) {
            addCriterion("dayunit not like", value, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitIn(List<String> values) {
            addCriterion("dayunit in", values, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitNotIn(List<String> values) {
            addCriterion("dayunit not in", values, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitBetween(String value1, String value2) {
            addCriterion("dayunit between", value1, value2, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitNotBetween(String value1, String value2) {
            addCriterion("dayunit not between", value1, value2, "dayunit");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewIsNull() {
            addCriterion("dayunitreview is null");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewIsNotNull() {
            addCriterion("dayunitreview is not null");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewEqualTo(String value) {
            addCriterion("dayunitreview =", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewNotEqualTo(String value) {
            addCriterion("dayunitreview <>", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewGreaterThan(String value) {
            addCriterion("dayunitreview >", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewGreaterThanOrEqualTo(String value) {
            addCriterion("dayunitreview >=", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewLessThan(String value) {
            addCriterion("dayunitreview <", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewLessThanOrEqualTo(String value) {
            addCriterion("dayunitreview <=", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewLike(String value) {
            addCriterion("dayunitreview like", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewNotLike(String value) {
            addCriterion("dayunitreview not like", value, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewIn(List<String> values) {
            addCriterion("dayunitreview in", values, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewNotIn(List<String> values) {
            addCriterion("dayunitreview not in", values, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewBetween(String value1, String value2) {
            addCriterion("dayunitreview between", value1, value2, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andDayunitreviewNotBetween(String value1, String value2) {
            addCriterion("dayunitreview not between", value1, value2, "dayunitreview");
            return (Criteria) this;
        }

        public Criteria andReallystartIsNull() {
            addCriterion("reallystart is null");
            return (Criteria) this;
        }

        public Criteria andReallystartIsNotNull() {
            addCriterion("reallystart is not null");
            return (Criteria) this;
        }

        public Criteria andReallystartEqualTo(Date value) {
            addCriterion("reallystart =", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartNotEqualTo(Date value) {
            addCriterion("reallystart <>", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartGreaterThan(Date value) {
            addCriterion("reallystart >", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartGreaterThanOrEqualTo(Date value) {
            addCriterion("reallystart >=", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartLessThan(Date value) {
            addCriterion("reallystart <", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartLessThanOrEqualTo(Date value) {
            addCriterion("reallystart <=", value, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartIn(List<Date> values) {
            addCriterion("reallystart in", values, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartNotIn(List<Date> values) {
            addCriterion("reallystart not in", values, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartBetween(Date value1, Date value2) {
            addCriterion("reallystart between", value1, value2, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallystartNotBetween(Date value1, Date value2) {
            addCriterion("reallystart not between", value1, value2, "reallystart");
            return (Criteria) this;
        }

        public Criteria andReallyendIsNull() {
            addCriterion("reallyend is null");
            return (Criteria) this;
        }

        public Criteria andReallyendIsNotNull() {
            addCriterion("reallyend is not null");
            return (Criteria) this;
        }

        public Criteria andReallyendEqualTo(Date value) {
            addCriterion("reallyend =", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendNotEqualTo(Date value) {
            addCriterion("reallyend <>", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendGreaterThan(Date value) {
            addCriterion("reallyend >", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendGreaterThanOrEqualTo(Date value) {
            addCriterion("reallyend >=", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendLessThan(Date value) {
            addCriterion("reallyend <", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendLessThanOrEqualTo(Date value) {
            addCriterion("reallyend <=", value, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendIn(List<Date> values) {
            addCriterion("reallyend in", values, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendNotIn(List<Date> values) {
            addCriterion("reallyend not in", values, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendBetween(Date value1, Date value2) {
            addCriterion("reallyend between", value1, value2, "reallyend");
            return (Criteria) this;
        }

        public Criteria andReallyendNotBetween(Date value1, Date value2) {
            addCriterion("reallyend not between", value1, value2, "reallyend");
            return (Criteria) this;
        }

        public Criteria andZbtypeIsNull() {
            addCriterion("zbtype is null");
            return (Criteria) this;
        }

        public Criteria andZbtypeIsNotNull() {
            addCriterion("zbtype is not null");
            return (Criteria) this;
        }

        public Criteria andZbtypeEqualTo(String value) {
            addCriterion("zbtype =", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeNotEqualTo(String value) {
            addCriterion("zbtype <>", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeGreaterThan(String value) {
            addCriterion("zbtype >", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("zbtype >=", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeLessThan(String value) {
            addCriterion("zbtype <", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeLessThanOrEqualTo(String value) {
            addCriterion("zbtype <=", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeLike(String value) {
            addCriterion("zbtype like", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeNotLike(String value) {
            addCriterion("zbtype not like", value, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeIn(List<String> values) {
            addCriterion("zbtype in", values, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeNotIn(List<String> values) {
            addCriterion("zbtype not in", values, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeBetween(String value1, String value2) {
            addCriterion("zbtype between", value1, value2, "zbtype");
            return (Criteria) this;
        }

        public Criteria andZbtypeNotBetween(String value1, String value2) {
            addCriterion("zbtype not between", value1, value2, "zbtype");
            return (Criteria) this;
        }

        public Criteria andBuildunitIsNull() {
            addCriterion("buildunit is null");
            return (Criteria) this;
        }

        public Criteria andBuildunitIsNotNull() {
            addCriterion("buildunit is not null");
            return (Criteria) this;
        }

        public Criteria andBuildunitEqualTo(String value) {
            addCriterion("buildunit =", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitNotEqualTo(String value) {
            addCriterion("buildunit <>", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitGreaterThan(String value) {
            addCriterion("buildunit >", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitGreaterThanOrEqualTo(String value) {
            addCriterion("buildunit >=", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitLessThan(String value) {
            addCriterion("buildunit <", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitLessThanOrEqualTo(String value) {
            addCriterion("buildunit <=", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitLike(String value) {
            addCriterion("buildunit like", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitNotLike(String value) {
            addCriterion("buildunit not like", value, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitIn(List<String> values) {
            addCriterion("buildunit in", values, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitNotIn(List<String> values) {
            addCriterion("buildunit not in", values, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitBetween(String value1, String value2) {
            addCriterion("buildunit between", value1, value2, "buildunit");
            return (Criteria) this;
        }

        public Criteria andBuildunitNotBetween(String value1, String value2) {
            addCriterion("buildunit not between", value1, value2, "buildunit");
            return (Criteria) this;
        }

        public Criteria andImageprogressIsNull() {
            addCriterion("imageprogress is null");
            return (Criteria) this;
        }

        public Criteria andImageprogressIsNotNull() {
            addCriterion("imageprogress is not null");
            return (Criteria) this;
        }

        public Criteria andImageprogressEqualTo(String value) {
            addCriterion("imageprogress =", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressNotEqualTo(String value) {
            addCriterion("imageprogress <>", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressGreaterThan(String value) {
            addCriterion("imageprogress >", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressGreaterThanOrEqualTo(String value) {
            addCriterion("imageprogress >=", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressLessThan(String value) {
            addCriterion("imageprogress <", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressLessThanOrEqualTo(String value) {
            addCriterion("imageprogress <=", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressLike(String value) {
            addCriterion("imageprogress like", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressNotLike(String value) {
            addCriterion("imageprogress not like", value, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressIn(List<String> values) {
            addCriterion("imageprogress in", values, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressNotIn(List<String> values) {
            addCriterion("imageprogress not in", values, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressBetween(String value1, String value2) {
            addCriterion("imageprogress between", value1, value2, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andImageprogressNotBetween(String value1, String value2) {
            addCriterion("imageprogress not between", value1, value2, "imageprogress");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andSendfundIsNull() {
            addCriterion("sendfund is null");
            return (Criteria) this;
        }

        public Criteria andSendfundIsNotNull() {
            addCriterion("sendfund is not null");
            return (Criteria) this;
        }

        public Criteria andSendfundEqualTo(String value) {
            addCriterion("sendfund =", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundNotEqualTo(String value) {
            addCriterion("sendfund <>", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundGreaterThan(String value) {
            addCriterion("sendfund >", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundGreaterThanOrEqualTo(String value) {
            addCriterion("sendfund >=", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundLessThan(String value) {
            addCriterion("sendfund <", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundLessThanOrEqualTo(String value) {
            addCriterion("sendfund <=", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundLike(String value) {
            addCriterion("sendfund like", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundNotLike(String value) {
            addCriterion("sendfund not like", value, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundIn(List<String> values) {
            addCriterion("sendfund in", values, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundNotIn(List<String> values) {
            addCriterion("sendfund not in", values, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundBetween(String value1, String value2) {
            addCriterion("sendfund between", value1, value2, "sendfund");
            return (Criteria) this;
        }

        public Criteria andSendfundNotBetween(String value1, String value2) {
            addCriterion("sendfund not between", value1, value2, "sendfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundIsNull() {
            addCriterion("finishfund is null");
            return (Criteria) this;
        }

        public Criteria andFinishfundIsNotNull() {
            addCriterion("finishfund is not null");
            return (Criteria) this;
        }

        public Criteria andFinishfundEqualTo(String value) {
            addCriterion("finishfund =", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundNotEqualTo(String value) {
            addCriterion("finishfund <>", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundGreaterThan(String value) {
            addCriterion("finishfund >", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundGreaterThanOrEqualTo(String value) {
            addCriterion("finishfund >=", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundLessThan(String value) {
            addCriterion("finishfund <", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundLessThanOrEqualTo(String value) {
            addCriterion("finishfund <=", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundLike(String value) {
            addCriterion("finishfund like", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundNotLike(String value) {
            addCriterion("finishfund not like", value, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundIn(List<String> values) {
            addCriterion("finishfund in", values, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundNotIn(List<String> values) {
            addCriterion("finishfund not in", values, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundBetween(String value1, String value2) {
            addCriterion("finishfund between", value1, value2, "finishfund");
            return (Criteria) this;
        }

        public Criteria andFinishfundNotBetween(String value1, String value2) {
            addCriterion("finishfund not between", value1, value2, "finishfund");
            return (Criteria) this;
        }

        public Criteria andTdxfunitIsNull() {
            addCriterion("tdxfunit is null");
            return (Criteria) this;
        }

        public Criteria andTdxfunitIsNotNull() {
            addCriterion("tdxfunit is not null");
            return (Criteria) this;
        }

        public Criteria andTdxfunitEqualTo(String value) {
            addCriterion("tdxfunit =", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitNotEqualTo(String value) {
            addCriterion("tdxfunit <>", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitGreaterThan(String value) {
            addCriterion("tdxfunit >", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitGreaterThanOrEqualTo(String value) {
            addCriterion("tdxfunit >=", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitLessThan(String value) {
            addCriterion("tdxfunit <", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitLessThanOrEqualTo(String value) {
            addCriterion("tdxfunit <=", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitLike(String value) {
            addCriterion("tdxfunit like", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitNotLike(String value) {
            addCriterion("tdxfunit not like", value, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitIn(List<String> values) {
            addCriterion("tdxfunit in", values, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitNotIn(List<String> values) {
            addCriterion("tdxfunit not in", values, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitBetween(String value1, String value2) {
            addCriterion("tdxfunit between", value1, value2, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdxfunitNotBetween(String value1, String value2) {
            addCriterion("tdxfunit not between", value1, value2, "tdxfunit");
            return (Criteria) this;
        }

        public Criteria andTdstartIsNull() {
            addCriterion("tdstart is null");
            return (Criteria) this;
        }

        public Criteria andTdstartIsNotNull() {
            addCriterion("tdstart is not null");
            return (Criteria) this;
        }

        public Criteria andTdstartEqualTo(Date value) {
            addCriterion("tdstart =", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartNotEqualTo(Date value) {
            addCriterion("tdstart <>", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartGreaterThan(Date value) {
            addCriterion("tdstart >", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartGreaterThanOrEqualTo(Date value) {
            addCriterion("tdstart >=", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartLessThan(Date value) {
            addCriterion("tdstart <", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartLessThanOrEqualTo(Date value) {
            addCriterion("tdstart <=", value, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartIn(List<Date> values) {
            addCriterion("tdstart in", values, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartNotIn(List<Date> values) {
            addCriterion("tdstart not in", values, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartBetween(Date value1, Date value2) {
            addCriterion("tdstart between", value1, value2, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdstartNotBetween(Date value1, Date value2) {
            addCriterion("tdstart not between", value1, value2, "tdstart");
            return (Criteria) this;
        }

        public Criteria andTdendIsNull() {
            addCriterion("tdend is null");
            return (Criteria) this;
        }

        public Criteria andTdendIsNotNull() {
            addCriterion("tdend is not null");
            return (Criteria) this;
        }

        public Criteria andTdendEqualTo(Date value) {
            addCriterion("tdend =", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendNotEqualTo(Date value) {
            addCriterion("tdend <>", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendGreaterThan(Date value) {
            addCriterion("tdend >", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendGreaterThanOrEqualTo(Date value) {
            addCriterion("tdend >=", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendLessThan(Date value) {
            addCriterion("tdend <", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendLessThanOrEqualTo(Date value) {
            addCriterion("tdend <=", value, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendIn(List<Date> values) {
            addCriterion("tdend in", values, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendNotIn(List<Date> values) {
            addCriterion("tdend not in", values, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendBetween(Date value1, Date value2) {
            addCriterion("tdend between", value1, value2, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdendNotBetween(Date value1, Date value2) {
            addCriterion("tdend not between", value1, value2, "tdend");
            return (Criteria) this;
        }

        public Criteria andTdstatusIsNull() {
            addCriterion("tdstatus is null");
            return (Criteria) this;
        }

        public Criteria andTdstatusIsNotNull() {
            addCriterion("tdstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTdstatusEqualTo(String value) {
            addCriterion("tdstatus =", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusNotEqualTo(String value) {
            addCriterion("tdstatus <>", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusGreaterThan(String value) {
            addCriterion("tdstatus >", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tdstatus >=", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusLessThan(String value) {
            addCriterion("tdstatus <", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusLessThanOrEqualTo(String value) {
            addCriterion("tdstatus <=", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusLike(String value) {
            addCriterion("tdstatus like", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusNotLike(String value) {
            addCriterion("tdstatus not like", value, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusIn(List<String> values) {
            addCriterion("tdstatus in", values, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusNotIn(List<String> values) {
            addCriterion("tdstatus not in", values, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusBetween(String value1, String value2) {
            addCriterion("tdstatus between", value1, value2, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andTdstatusNotBetween(String value1, String value2) {
            addCriterion("tdstatus not between", value1, value2, "tdstatus");
            return (Criteria) this;
        }

        public Criteria andXftimeIsNull() {
            addCriterion("xftime is null");
            return (Criteria) this;
        }

        public Criteria andXftimeIsNotNull() {
            addCriterion("xftime is not null");
            return (Criteria) this;
        }

        public Criteria andXftimeEqualTo(Date value) {
            addCriterion("xftime =", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeNotEqualTo(Date value) {
            addCriterion("xftime <>", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeGreaterThan(Date value) {
            addCriterion("xftime >", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("xftime >=", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeLessThan(Date value) {
            addCriterion("xftime <", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeLessThanOrEqualTo(Date value) {
            addCriterion("xftime <=", value, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeIn(List<Date> values) {
            addCriterion("xftime in", values, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeNotIn(List<Date> values) {
            addCriterion("xftime not in", values, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeBetween(Date value1, Date value2) {
            addCriterion("xftime between", value1, value2, "xftime");
            return (Criteria) this;
        }

        public Criteria andXftimeNotBetween(Date value1, Date value2) {
            addCriterion("xftime not between", value1, value2, "xftime");
            return (Criteria) this;
        }

        public Criteria andSendunitIsNull() {
            addCriterion("sendunit is null");
            return (Criteria) this;
        }

        public Criteria andSendunitIsNotNull() {
            addCriterion("sendunit is not null");
            return (Criteria) this;
        }

        public Criteria andSendunitEqualTo(String value) {
            addCriterion("sendunit =", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitNotEqualTo(String value) {
            addCriterion("sendunit <>", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitGreaterThan(String value) {
            addCriterion("sendunit >", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitGreaterThanOrEqualTo(String value) {
            addCriterion("sendunit >=", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitLessThan(String value) {
            addCriterion("sendunit <", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitLessThanOrEqualTo(String value) {
            addCriterion("sendunit <=", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitLike(String value) {
            addCriterion("sendunit like", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitNotLike(String value) {
            addCriterion("sendunit not like", value, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitIn(List<String> values) {
            addCriterion("sendunit in", values, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitNotIn(List<String> values) {
            addCriterion("sendunit not in", values, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitBetween(String value1, String value2) {
            addCriterion("sendunit between", value1, value2, "sendunit");
            return (Criteria) this;
        }

        public Criteria andSendunitNotBetween(String value1, String value2) {
            addCriterion("sendunit not between", value1, value2, "sendunit");
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