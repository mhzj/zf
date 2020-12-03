package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YearplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearplanExample() {
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

        public Criteria andYearplanidIsNull() {
            addCriterion("yearplanid is null");
            return (Criteria) this;
        }

        public Criteria andYearplanidIsNotNull() {
            addCriterion("yearplanid is not null");
            return (Criteria) this;
        }

        public Criteria andYearplanidEqualTo(Integer value) {
            addCriterion("yearplanid =", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidNotEqualTo(Integer value) {
            addCriterion("yearplanid <>", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidGreaterThan(Integer value) {
            addCriterion("yearplanid >", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearplanid >=", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidLessThan(Integer value) {
            addCriterion("yearplanid <", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidLessThanOrEqualTo(Integer value) {
            addCriterion("yearplanid <=", value, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidIn(List<Integer> values) {
            addCriterion("yearplanid in", values, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidNotIn(List<Integer> values) {
            addCriterion("yearplanid not in", values, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidBetween(Integer value1, Integer value2) {
            addCriterion("yearplanid between", value1, value2, "yearplanid");
            return (Criteria) this;
        }

        public Criteria andYearplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("yearplanid not between", value1, value2, "yearplanid");
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

        public Criteria andBsunitIsNull() {
            addCriterion("bsunit is null");
            return (Criteria) this;
        }

        public Criteria andBsunitIsNotNull() {
            addCriterion("bsunit is not null");
            return (Criteria) this;
        }

        public Criteria andBsunitEqualTo(String value) {
            addCriterion("bsunit =", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitNotEqualTo(String value) {
            addCriterion("bsunit <>", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitGreaterThan(String value) {
            addCriterion("bsunit >", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitGreaterThanOrEqualTo(String value) {
            addCriterion("bsunit >=", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitLessThan(String value) {
            addCriterion("bsunit <", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitLessThanOrEqualTo(String value) {
            addCriterion("bsunit <=", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitLike(String value) {
            addCriterion("bsunit like", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitNotLike(String value) {
            addCriterion("bsunit not like", value, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitIn(List<String> values) {
            addCriterion("bsunit in", values, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitNotIn(List<String> values) {
            addCriterion("bsunit not in", values, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitBetween(String value1, String value2) {
            addCriterion("bsunit between", value1, value2, "bsunit");
            return (Criteria) this;
        }

        public Criteria andBsunitNotBetween(String value1, String value2) {
            addCriterion("bsunit not between", value1, value2, "bsunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNull() {
            addCriterion("receiveunit is null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNotNull() {
            addCriterion("receiveunit is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitEqualTo(String value) {
            addCriterion("receiveunit =", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotEqualTo(String value) {
            addCriterion("receiveunit <>", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThan(String value) {
            addCriterion("receiveunit >", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThanOrEqualTo(String value) {
            addCriterion("receiveunit >=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThan(String value) {
            addCriterion("receiveunit <", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThanOrEqualTo(String value) {
            addCriterion("receiveunit <=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLike(String value) {
            addCriterion("receiveunit like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotLike(String value) {
            addCriterion("receiveunit not like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIn(List<String> values) {
            addCriterion("receiveunit in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotIn(List<String> values) {
            addCriterion("receiveunit not in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitBetween(String value1, String value2) {
            addCriterion("receiveunit between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotBetween(String value1, String value2) {
            addCriterion("receiveunit not between", value1, value2, "receiveunit");
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

        public Criteria andXdfundyearIsNull() {
            addCriterion("xdfundyear is null");
            return (Criteria) this;
        }

        public Criteria andXdfundyearIsNotNull() {
            addCriterion("xdfundyear is not null");
            return (Criteria) this;
        }

        public Criteria andXdfundyearEqualTo(String value) {
            addCriterion("xdfundyear =", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearNotEqualTo(String value) {
            addCriterion("xdfundyear <>", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearGreaterThan(String value) {
            addCriterion("xdfundyear >", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearGreaterThanOrEqualTo(String value) {
            addCriterion("xdfundyear >=", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearLessThan(String value) {
            addCriterion("xdfundyear <", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearLessThanOrEqualTo(String value) {
            addCriterion("xdfundyear <=", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearLike(String value) {
            addCriterion("xdfundyear like", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearNotLike(String value) {
            addCriterion("xdfundyear not like", value, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearIn(List<String> values) {
            addCriterion("xdfundyear in", values, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearNotIn(List<String> values) {
            addCriterion("xdfundyear not in", values, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearBetween(String value1, String value2) {
            addCriterion("xdfundyear between", value1, value2, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andXdfundyearNotBetween(String value1, String value2) {
            addCriterion("xdfundyear not between", value1, value2, "xdfundyear");
            return (Criteria) this;
        }

        public Criteria andThisfundIsNull() {
            addCriterion("thisfund is null");
            return (Criteria) this;
        }

        public Criteria andThisfundIsNotNull() {
            addCriterion("thisfund is not null");
            return (Criteria) this;
        }

        public Criteria andThisfundEqualTo(String value) {
            addCriterion("thisfund =", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundNotEqualTo(String value) {
            addCriterion("thisfund <>", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundGreaterThan(String value) {
            addCriterion("thisfund >", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundGreaterThanOrEqualTo(String value) {
            addCriterion("thisfund >=", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundLessThan(String value) {
            addCriterion("thisfund <", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundLessThanOrEqualTo(String value) {
            addCriterion("thisfund <=", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundLike(String value) {
            addCriterion("thisfund like", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundNotLike(String value) {
            addCriterion("thisfund not like", value, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundIn(List<String> values) {
            addCriterion("thisfund in", values, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundNotIn(List<String> values) {
            addCriterion("thisfund not in", values, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundBetween(String value1, String value2) {
            addCriterion("thisfund between", value1, value2, "thisfund");
            return (Criteria) this;
        }

        public Criteria andThisfundNotBetween(String value1, String value2) {
            addCriterion("thisfund not between", value1, value2, "thisfund");
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

        public Criteria andPlantimeIsNull() {
            addCriterion("plantime is null");
            return (Criteria) this;
        }

        public Criteria andPlantimeIsNotNull() {
            addCriterion("plantime is not null");
            return (Criteria) this;
        }

        public Criteria andPlantimeEqualTo(Date value) {
            addCriterion("plantime =", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotEqualTo(Date value) {
            addCriterion("plantime <>", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThan(Date value) {
            addCriterion("plantime >", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plantime >=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThan(Date value) {
            addCriterion("plantime <", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeLessThanOrEqualTo(Date value) {
            addCriterion("plantime <=", value, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeIn(List<Date> values) {
            addCriterion("plantime in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotIn(List<Date> values) {
            addCriterion("plantime not in", values, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeBetween(Date value1, Date value2) {
            addCriterion("plantime between", value1, value2, "plantime");
            return (Criteria) this;
        }

        public Criteria andPlantimeNotBetween(Date value1, Date value2) {
            addCriterion("plantime not between", value1, value2, "plantime");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNull() {
            addCriterion("sendstatus is null");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNotNull() {
            addCriterion("sendstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSendstatusEqualTo(String value) {
            addCriterion("sendstatus =", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotEqualTo(String value) {
            addCriterion("sendstatus <>", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThan(String value) {
            addCriterion("sendstatus >", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sendstatus >=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThan(String value) {
            addCriterion("sendstatus <", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThanOrEqualTo(String value) {
            addCriterion("sendstatus <=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLike(String value) {
            addCriterion("sendstatus like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotLike(String value) {
            addCriterion("sendstatus not like", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusIn(List<String> values) {
            addCriterion("sendstatus in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotIn(List<String> values) {
            addCriterion("sendstatus not in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusBetween(String value1, String value2) {
            addCriterion("sendstatus between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotBetween(String value1, String value2) {
            addCriterion("sendstatus not between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andApplyyearIsNull() {
            addCriterion("applyyear is null");
            return (Criteria) this;
        }

        public Criteria andApplyyearIsNotNull() {
            addCriterion("applyyear is not null");
            return (Criteria) this;
        }

        public Criteria andApplyyearEqualTo(String value) {
            addCriterion("applyyear =", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearNotEqualTo(String value) {
            addCriterion("applyyear <>", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearGreaterThan(String value) {
            addCriterion("applyyear >", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearGreaterThanOrEqualTo(String value) {
            addCriterion("applyyear >=", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearLessThan(String value) {
            addCriterion("applyyear <", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearLessThanOrEqualTo(String value) {
            addCriterion("applyyear <=", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearLike(String value) {
            addCriterion("applyyear like", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearNotLike(String value) {
            addCriterion("applyyear not like", value, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearIn(List<String> values) {
            addCriterion("applyyear in", values, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearNotIn(List<String> values) {
            addCriterion("applyyear not in", values, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearBetween(String value1, String value2) {
            addCriterion("applyyear between", value1, value2, "applyyear");
            return (Criteria) this;
        }

        public Criteria andApplyyearNotBetween(String value1, String value2) {
            addCriterion("applyyear not between", value1, value2, "applyyear");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIsNull() {
            addCriterion("planstatus is null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIsNotNull() {
            addCriterion("planstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusEqualTo(String value) {
            addCriterion("planstatus =", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotEqualTo(String value) {
            addCriterion("planstatus <>", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThan(String value) {
            addCriterion("planstatus >", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThanOrEqualTo(String value) {
            addCriterion("planstatus >=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThan(String value) {
            addCriterion("planstatus <", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThanOrEqualTo(String value) {
            addCriterion("planstatus <=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLike(String value) {
            addCriterion("planstatus like", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotLike(String value) {
            addCriterion("planstatus not like", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIn(List<String> values) {
            addCriterion("planstatus in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotIn(List<String> values) {
            addCriterion("planstatus not in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusBetween(String value1, String value2) {
            addCriterion("planstatus between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotBetween(String value1, String value2) {
            addCriterion("planstatus not between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andBsnumberIsNull() {
            addCriterion("bsnumber is null");
            return (Criteria) this;
        }

        public Criteria andBsnumberIsNotNull() {
            addCriterion("bsnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBsnumberEqualTo(String value) {
            addCriterion("bsnumber =", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberNotEqualTo(String value) {
            addCriterion("bsnumber <>", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberGreaterThan(String value) {
            addCriterion("bsnumber >", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("bsnumber >=", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberLessThan(String value) {
            addCriterion("bsnumber <", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberLessThanOrEqualTo(String value) {
            addCriterion("bsnumber <=", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberLike(String value) {
            addCriterion("bsnumber like", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberNotLike(String value) {
            addCriterion("bsnumber not like", value, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberIn(List<String> values) {
            addCriterion("bsnumber in", values, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberNotIn(List<String> values) {
            addCriterion("bsnumber not in", values, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberBetween(String value1, String value2) {
            addCriterion("bsnumber between", value1, value2, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andBsnumberNotBetween(String value1, String value2) {
            addCriterion("bsnumber not between", value1, value2, "bsnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberIsNull() {
            addCriterion("fundnumber is null");
            return (Criteria) this;
        }

        public Criteria andFundnumberIsNotNull() {
            addCriterion("fundnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFundnumberEqualTo(String value) {
            addCriterion("fundnumber =", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberNotEqualTo(String value) {
            addCriterion("fundnumber <>", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberGreaterThan(String value) {
            addCriterion("fundnumber >", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberGreaterThanOrEqualTo(String value) {
            addCriterion("fundnumber >=", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberLessThan(String value) {
            addCriterion("fundnumber <", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberLessThanOrEqualTo(String value) {
            addCriterion("fundnumber <=", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberLike(String value) {
            addCriterion("fundnumber like", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberNotLike(String value) {
            addCriterion("fundnumber not like", value, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberIn(List<String> values) {
            addCriterion("fundnumber in", values, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberNotIn(List<String> values) {
            addCriterion("fundnumber not in", values, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberBetween(String value1, String value2) {
            addCriterion("fundnumber between", value1, value2, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andFundnumberNotBetween(String value1, String value2) {
            addCriterion("fundnumber not between", value1, value2, "fundnumber");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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