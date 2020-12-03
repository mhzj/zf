package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andCountryidIsNull() {
            addCriterion("countryid is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("countryid is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(String value) {
            addCriterion("countryid =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(String value) {
            addCriterion("countryid <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(String value) {
            addCriterion("countryid >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(String value) {
            addCriterion("countryid >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(String value) {
            addCriterion("countryid <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(String value) {
            addCriterion("countryid <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLike(String value) {
            addCriterion("countryid like", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotLike(String value) {
            addCriterion("countryid not like", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<String> values) {
            addCriterion("countryid in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<String> values) {
            addCriterion("countryid not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(String value1, String value2) {
            addCriterion("countryid between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(String value1, String value2) {
            addCriterion("countryid not between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNull() {
            addCriterion("placeid is null");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNotNull() {
            addCriterion("placeid is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceidEqualTo(String value) {
            addCriterion("placeid =", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotEqualTo(String value) {
            addCriterion("placeid <>", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThan(String value) {
            addCriterion("placeid >", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThanOrEqualTo(String value) {
            addCriterion("placeid >=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThan(String value) {
            addCriterion("placeid <", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThanOrEqualTo(String value) {
            addCriterion("placeid <=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLike(String value) {
            addCriterion("placeid like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotLike(String value) {
            addCriterion("placeid not like", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIn(List<String> values) {
            addCriterion("placeid in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotIn(List<String> values) {
            addCriterion("placeid not in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidBetween(String value1, String value2) {
            addCriterion("placeid between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotBetween(String value1, String value2) {
            addCriterion("placeid not between", value1, value2, "placeid");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(String value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(String value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(String value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(String value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(String value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLike(String value) {
            addCriterion("property like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotLike(String value) {
            addCriterion("property not like", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<String> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<String> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(String value1, String value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(String value1, String value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNull() {
            addCriterion("institution is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNotNull() {
            addCriterion("institution is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionEqualTo(String value) {
            addCriterion("institution =", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotEqualTo(String value) {
            addCriterion("institution <>", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThan(String value) {
            addCriterion("institution >", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("institution >=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThan(String value) {
            addCriterion("institution <", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThanOrEqualTo(String value) {
            addCriterion("institution <=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLike(String value) {
            addCriterion("institution like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotLike(String value) {
            addCriterion("institution not like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionIn(List<String> values) {
            addCriterion("institution in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotIn(List<String> values) {
            addCriterion("institution not in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionBetween(String value1, String value2) {
            addCriterion("institution between", value1, value2, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotBetween(String value1, String value2) {
            addCriterion("institution not between", value1, value2, "institution");
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

        public Criteria andSitedetailIsNull() {
            addCriterion("sitedetail is null");
            return (Criteria) this;
        }

        public Criteria andSitedetailIsNotNull() {
            addCriterion("sitedetail is not null");
            return (Criteria) this;
        }

        public Criteria andSitedetailEqualTo(String value) {
            addCriterion("sitedetail =", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailNotEqualTo(String value) {
            addCriterion("sitedetail <>", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailGreaterThan(String value) {
            addCriterion("sitedetail >", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailGreaterThanOrEqualTo(String value) {
            addCriterion("sitedetail >=", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailLessThan(String value) {
            addCriterion("sitedetail <", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailLessThanOrEqualTo(String value) {
            addCriterion("sitedetail <=", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailLike(String value) {
            addCriterion("sitedetail like", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailNotLike(String value) {
            addCriterion("sitedetail not like", value, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailIn(List<String> values) {
            addCriterion("sitedetail in", values, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailNotIn(List<String> values) {
            addCriterion("sitedetail not in", values, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailBetween(String value1, String value2) {
            addCriterion("sitedetail between", value1, value2, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andSitedetailNotBetween(String value1, String value2) {
            addCriterion("sitedetail not between", value1, value2, "sitedetail");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andStartyearIsNull() {
            addCriterion("startyear is null");
            return (Criteria) this;
        }

        public Criteria andStartyearIsNotNull() {
            addCriterion("startyear is not null");
            return (Criteria) this;
        }

        public Criteria andStartyearEqualTo(Date value) {
            addCriterion("startyear =", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotEqualTo(Date value) {
            addCriterion("startyear <>", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThan(Date value) {
            addCriterion("startyear >", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThanOrEqualTo(Date value) {
            addCriterion("startyear >=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThan(Date value) {
            addCriterion("startyear <", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThanOrEqualTo(Date value) {
            addCriterion("startyear <=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearIn(List<Date> values) {
            addCriterion("startyear in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotIn(List<Date> values) {
            addCriterion("startyear not in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearBetween(Date value1, Date value2) {
            addCriterion("startyear between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotBetween(Date value1, Date value2) {
            addCriterion("startyear not between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNull() {
            addCriterion("endyear is null");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNotNull() {
            addCriterion("endyear is not null");
            return (Criteria) this;
        }

        public Criteria andEndyearEqualTo(Date value) {
            addCriterion("endyear =", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotEqualTo(Date value) {
            addCriterion("endyear <>", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThan(Date value) {
            addCriterion("endyear >", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThanOrEqualTo(Date value) {
            addCriterion("endyear >=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThan(Date value) {
            addCriterion("endyear <", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThanOrEqualTo(Date value) {
            addCriterion("endyear <=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIn(List<Date> values) {
            addCriterion("endyear in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotIn(List<Date> values) {
            addCriterion("endyear not in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearBetween(Date value1, Date value2) {
            addCriterion("endyear between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotBetween(Date value1, Date value2) {
            addCriterion("endyear not between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andBuildscaleIsNull() {
            addCriterion("buildscale is null");
            return (Criteria) this;
        }

        public Criteria andBuildscaleIsNotNull() {
            addCriterion("buildscale is not null");
            return (Criteria) this;
        }

        public Criteria andBuildscaleEqualTo(String value) {
            addCriterion("buildscale =", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleNotEqualTo(String value) {
            addCriterion("buildscale <>", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleGreaterThan(String value) {
            addCriterion("buildscale >", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleGreaterThanOrEqualTo(String value) {
            addCriterion("buildscale >=", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleLessThan(String value) {
            addCriterion("buildscale <", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleLessThanOrEqualTo(String value) {
            addCriterion("buildscale <=", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleLike(String value) {
            addCriterion("buildscale like", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleNotLike(String value) {
            addCriterion("buildscale not like", value, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleIn(List<String> values) {
            addCriterion("buildscale in", values, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleNotIn(List<String> values) {
            addCriterion("buildscale not in", values, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleBetween(String value1, String value2) {
            addCriterion("buildscale between", value1, value2, "buildscale");
            return (Criteria) this;
        }

        public Criteria andBuildscaleNotBetween(String value1, String value2) {
            addCriterion("buildscale not between", value1, value2, "buildscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleIsNull() {
            addCriterion("quantifyscale is null");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleIsNotNull() {
            addCriterion("quantifyscale is not null");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleEqualTo(String value) {
            addCriterion("quantifyscale =", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleNotEqualTo(String value) {
            addCriterion("quantifyscale <>", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleGreaterThan(String value) {
            addCriterion("quantifyscale >", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleGreaterThanOrEqualTo(String value) {
            addCriterion("quantifyscale >=", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleLessThan(String value) {
            addCriterion("quantifyscale <", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleLessThanOrEqualTo(String value) {
            addCriterion("quantifyscale <=", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleLike(String value) {
            addCriterion("quantifyscale like", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleNotLike(String value) {
            addCriterion("quantifyscale not like", value, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleIn(List<String> values) {
            addCriterion("quantifyscale in", values, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleNotIn(List<String> values) {
            addCriterion("quantifyscale not in", values, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleBetween(String value1, String value2) {
            addCriterion("quantifyscale between", value1, value2, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andQuantifyscaleNotBetween(String value1, String value2) {
            addCriterion("quantifyscale not between", value1, value2, "quantifyscale");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDutypersonIsNull() {
            addCriterion("dutyperson is null");
            return (Criteria) this;
        }

        public Criteria andDutypersonIsNotNull() {
            addCriterion("dutyperson is not null");
            return (Criteria) this;
        }

        public Criteria andDutypersonEqualTo(String value) {
            addCriterion("dutyperson =", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonNotEqualTo(String value) {
            addCriterion("dutyperson <>", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonGreaterThan(String value) {
            addCriterion("dutyperson >", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonGreaterThanOrEqualTo(String value) {
            addCriterion("dutyperson >=", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonLessThan(String value) {
            addCriterion("dutyperson <", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonLessThanOrEqualTo(String value) {
            addCriterion("dutyperson <=", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonLike(String value) {
            addCriterion("dutyperson like", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonNotLike(String value) {
            addCriterion("dutyperson not like", value, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonIn(List<String> values) {
            addCriterion("dutyperson in", values, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonNotIn(List<String> values) {
            addCriterion("dutyperson not in", values, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonBetween(String value1, String value2) {
            addCriterion("dutyperson between", value1, value2, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersonNotBetween(String value1, String value2) {
            addCriterion("dutyperson not between", value1, value2, "dutyperson");
            return (Criteria) this;
        }

        public Criteria andDutypersontelIsNull() {
            addCriterion("dutypersontel is null");
            return (Criteria) this;
        }

        public Criteria andDutypersontelIsNotNull() {
            addCriterion("dutypersontel is not null");
            return (Criteria) this;
        }

        public Criteria andDutypersontelEqualTo(String value) {
            addCriterion("dutypersontel =", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelNotEqualTo(String value) {
            addCriterion("dutypersontel <>", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelGreaterThan(String value) {
            addCriterion("dutypersontel >", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelGreaterThanOrEqualTo(String value) {
            addCriterion("dutypersontel >=", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelLessThan(String value) {
            addCriterion("dutypersontel <", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelLessThanOrEqualTo(String value) {
            addCriterion("dutypersontel <=", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelLike(String value) {
            addCriterion("dutypersontel like", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelNotLike(String value) {
            addCriterion("dutypersontel not like", value, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelIn(List<String> values) {
            addCriterion("dutypersontel in", values, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelNotIn(List<String> values) {
            addCriterion("dutypersontel not in", values, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelBetween(String value1, String value2) {
            addCriterion("dutypersontel between", value1, value2, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andDutypersontelNotBetween(String value1, String value2) {
            addCriterion("dutypersontel not between", value1, value2, "dutypersontel");
            return (Criteria) this;
        }

        public Criteria andConpersonIsNull() {
            addCriterion("conperson is null");
            return (Criteria) this;
        }

        public Criteria andConpersonIsNotNull() {
            addCriterion("conperson is not null");
            return (Criteria) this;
        }

        public Criteria andConpersonEqualTo(String value) {
            addCriterion("conperson =", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonNotEqualTo(String value) {
            addCriterion("conperson <>", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonGreaterThan(String value) {
            addCriterion("conperson >", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonGreaterThanOrEqualTo(String value) {
            addCriterion("conperson >=", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonLessThan(String value) {
            addCriterion("conperson <", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonLessThanOrEqualTo(String value) {
            addCriterion("conperson <=", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonLike(String value) {
            addCriterion("conperson like", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonNotLike(String value) {
            addCriterion("conperson not like", value, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonIn(List<String> values) {
            addCriterion("conperson in", values, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonNotIn(List<String> values) {
            addCriterion("conperson not in", values, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonBetween(String value1, String value2) {
            addCriterion("conperson between", value1, value2, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersonNotBetween(String value1, String value2) {
            addCriterion("conperson not between", value1, value2, "conperson");
            return (Criteria) this;
        }

        public Criteria andConpersontelIsNull() {
            addCriterion("conpersontel is null");
            return (Criteria) this;
        }

        public Criteria andConpersontelIsNotNull() {
            addCriterion("conpersontel is not null");
            return (Criteria) this;
        }

        public Criteria andConpersontelEqualTo(String value) {
            addCriterion("conpersontel =", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelNotEqualTo(String value) {
            addCriterion("conpersontel <>", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelGreaterThan(String value) {
            addCriterion("conpersontel >", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelGreaterThanOrEqualTo(String value) {
            addCriterion("conpersontel >=", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelLessThan(String value) {
            addCriterion("conpersontel <", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelLessThanOrEqualTo(String value) {
            addCriterion("conpersontel <=", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelLike(String value) {
            addCriterion("conpersontel like", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelNotLike(String value) {
            addCriterion("conpersontel not like", value, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelIn(List<String> values) {
            addCriterion("conpersontel in", values, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelNotIn(List<String> values) {
            addCriterion("conpersontel not in", values, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelBetween(String value1, String value2) {
            addCriterion("conpersontel between", value1, value2, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andConpersontelNotBetween(String value1, String value2) {
            addCriterion("conpersontel not between", value1, value2, "conpersontel");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNull() {
            addCriterion("fundtype is null");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNotNull() {
            addCriterion("fundtype is not null");
            return (Criteria) this;
        }

        public Criteria andFundtypeEqualTo(String value) {
            addCriterion("fundtype =", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotEqualTo(String value) {
            addCriterion("fundtype <>", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThan(String value) {
            addCriterion("fundtype >", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThanOrEqualTo(String value) {
            addCriterion("fundtype >=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThan(String value) {
            addCriterion("fundtype <", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThanOrEqualTo(String value) {
            addCriterion("fundtype <=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLike(String value) {
            addCriterion("fundtype like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotLike(String value) {
            addCriterion("fundtype not like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeIn(List<String> values) {
            addCriterion("fundtype in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotIn(List<String> values) {
            addCriterion("fundtype not in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeBetween(String value1, String value2) {
            addCriterion("fundtype between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotBetween(String value1, String value2) {
            addCriterion("fundtype not between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andAllfundIsNull() {
            addCriterion("allfund is null");
            return (Criteria) this;
        }

        public Criteria andAllfundIsNotNull() {
            addCriterion("allfund is not null");
            return (Criteria) this;
        }

        public Criteria andAllfundEqualTo(String value) {
            addCriterion("allfund =", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundNotEqualTo(String value) {
            addCriterion("allfund <>", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundGreaterThan(String value) {
            addCriterion("allfund >", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundGreaterThanOrEqualTo(String value) {
            addCriterion("allfund >=", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundLessThan(String value) {
            addCriterion("allfund <", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundLessThanOrEqualTo(String value) {
            addCriterion("allfund <=", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundLike(String value) {
            addCriterion("allfund like", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundNotLike(String value) {
            addCriterion("allfund not like", value, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundIn(List<String> values) {
            addCriterion("allfund in", values, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundNotIn(List<String> values) {
            addCriterion("allfund not in", values, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundBetween(String value1, String value2) {
            addCriterion("allfund between", value1, value2, "allfund");
            return (Criteria) this;
        }

        public Criteria andAllfundNotBetween(String value1, String value2) {
            addCriterion("allfund not between", value1, value2, "allfund");
            return (Criteria) this;
        }

        public Criteria andXfundIsNull() {
            addCriterion("xfund is null");
            return (Criteria) this;
        }

        public Criteria andXfundIsNotNull() {
            addCriterion("xfund is not null");
            return (Criteria) this;
        }

        public Criteria andXfundEqualTo(String value) {
            addCriterion("xfund =", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundNotEqualTo(String value) {
            addCriterion("xfund <>", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundGreaterThan(String value) {
            addCriterion("xfund >", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundGreaterThanOrEqualTo(String value) {
            addCriterion("xfund >=", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundLessThan(String value) {
            addCriterion("xfund <", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundLessThanOrEqualTo(String value) {
            addCriterion("xfund <=", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundLike(String value) {
            addCriterion("xfund like", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundNotLike(String value) {
            addCriterion("xfund not like", value, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundIn(List<String> values) {
            addCriterion("xfund in", values, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundNotIn(List<String> values) {
            addCriterion("xfund not in", values, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundBetween(String value1, String value2) {
            addCriterion("xfund between", value1, value2, "xfund");
            return (Criteria) this;
        }

        public Criteria andXfundNotBetween(String value1, String value2) {
            addCriterion("xfund not between", value1, value2, "xfund");
            return (Criteria) this;
        }

        public Criteria andFinvestmentIsNull() {
            addCriterion("finvestment is null");
            return (Criteria) this;
        }

        public Criteria andFinvestmentIsNotNull() {
            addCriterion("finvestment is not null");
            return (Criteria) this;
        }

        public Criteria andFinvestmentEqualTo(String value) {
            addCriterion("finvestment =", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentNotEqualTo(String value) {
            addCriterion("finvestment <>", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentGreaterThan(String value) {
            addCriterion("finvestment >", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("finvestment >=", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentLessThan(String value) {
            addCriterion("finvestment <", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentLessThanOrEqualTo(String value) {
            addCriterion("finvestment <=", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentLike(String value) {
            addCriterion("finvestment like", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentNotLike(String value) {
            addCriterion("finvestment not like", value, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentIn(List<String> values) {
            addCriterion("finvestment in", values, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentNotIn(List<String> values) {
            addCriterion("finvestment not in", values, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentBetween(String value1, String value2) {
            addCriterion("finvestment between", value1, value2, "finvestment");
            return (Criteria) this;
        }

        public Criteria andFinvestmentNotBetween(String value1, String value2) {
            addCriterion("finvestment not between", value1, value2, "finvestment");
            return (Criteria) this;
        }

        public Criteria andSfundIsNull() {
            addCriterion("sfund is null");
            return (Criteria) this;
        }

        public Criteria andSfundIsNotNull() {
            addCriterion("sfund is not null");
            return (Criteria) this;
        }

        public Criteria andSfundEqualTo(String value) {
            addCriterion("sfund =", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundNotEqualTo(String value) {
            addCriterion("sfund <>", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundGreaterThan(String value) {
            addCriterion("sfund >", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundGreaterThanOrEqualTo(String value) {
            addCriterion("sfund >=", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundLessThan(String value) {
            addCriterion("sfund <", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundLessThanOrEqualTo(String value) {
            addCriterion("sfund <=", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundLike(String value) {
            addCriterion("sfund like", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundNotLike(String value) {
            addCriterion("sfund not like", value, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundIn(List<String> values) {
            addCriterion("sfund in", values, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundNotIn(List<String> values) {
            addCriterion("sfund not in", values, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundBetween(String value1, String value2) {
            addCriterion("sfund between", value1, value2, "sfund");
            return (Criteria) this;
        }

        public Criteria andSfundNotBetween(String value1, String value2) {
            addCriterion("sfund not between", value1, value2, "sfund");
            return (Criteria) this;
        }

        public Criteria andReviewthingIsNull() {
            addCriterion("reviewthing is null");
            return (Criteria) this;
        }

        public Criteria andReviewthingIsNotNull() {
            addCriterion("reviewthing is not null");
            return (Criteria) this;
        }

        public Criteria andReviewthingEqualTo(String value) {
            addCriterion("reviewthing =", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingNotEqualTo(String value) {
            addCriterion("reviewthing <>", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingGreaterThan(String value) {
            addCriterion("reviewthing >", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingGreaterThanOrEqualTo(String value) {
            addCriterion("reviewthing >=", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingLessThan(String value) {
            addCriterion("reviewthing <", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingLessThanOrEqualTo(String value) {
            addCriterion("reviewthing <=", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingLike(String value) {
            addCriterion("reviewthing like", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingNotLike(String value) {
            addCriterion("reviewthing not like", value, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingIn(List<String> values) {
            addCriterion("reviewthing in", values, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingNotIn(List<String> values) {
            addCriterion("reviewthing not in", values, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingBetween(String value1, String value2) {
            addCriterion("reviewthing between", value1, value2, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewthingNotBetween(String value1, String value2) {
            addCriterion("reviewthing not between", value1, value2, "reviewthing");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionIsNull() {
            addCriterion("reviewinstitution is null");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionIsNotNull() {
            addCriterion("reviewinstitution is not null");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionEqualTo(String value) {
            addCriterion("reviewinstitution =", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionNotEqualTo(String value) {
            addCriterion("reviewinstitution <>", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionGreaterThan(String value) {
            addCriterion("reviewinstitution >", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("reviewinstitution >=", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionLessThan(String value) {
            addCriterion("reviewinstitution <", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionLessThanOrEqualTo(String value) {
            addCriterion("reviewinstitution <=", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionLike(String value) {
            addCriterion("reviewinstitution like", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionNotLike(String value) {
            addCriterion("reviewinstitution not like", value, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionIn(List<String> values) {
            addCriterion("reviewinstitution in", values, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionNotIn(List<String> values) {
            addCriterion("reviewinstitution not in", values, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionBetween(String value1, String value2) {
            addCriterion("reviewinstitution between", value1, value2, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewinstitutionNotBetween(String value1, String value2) {
            addCriterion("reviewinstitution not between", value1, value2, "reviewinstitution");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIsNull() {
            addCriterion("reviewtime is null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIsNotNull() {
            addCriterion("reviewtime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtimeEqualTo(Date value) {
            addCriterion("reviewtime =", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotEqualTo(Date value) {
            addCriterion("reviewtime <>", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThan(Date value) {
            addCriterion("reviewtime >", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewtime >=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThan(Date value) {
            addCriterion("reviewtime <", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewtime <=", value, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeIn(List<Date> values) {
            addCriterion("reviewtime in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotIn(List<Date> values) {
            addCriterion("reviewtime not in", values, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeBetween(Date value1, Date value2) {
            addCriterion("reviewtime between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewtime not between", value1, value2, "reviewtime");
            return (Criteria) this;
        }

        public Criteria andReviewnameIsNull() {
            addCriterion("reviewname is null");
            return (Criteria) this;
        }

        public Criteria andReviewnameIsNotNull() {
            addCriterion("reviewname is not null");
            return (Criteria) this;
        }

        public Criteria andReviewnameEqualTo(String value) {
            addCriterion("reviewname =", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameNotEqualTo(String value) {
            addCriterion("reviewname <>", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameGreaterThan(String value) {
            addCriterion("reviewname >", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameGreaterThanOrEqualTo(String value) {
            addCriterion("reviewname >=", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameLessThan(String value) {
            addCriterion("reviewname <", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameLessThanOrEqualTo(String value) {
            addCriterion("reviewname <=", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameLike(String value) {
            addCriterion("reviewname like", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameNotLike(String value) {
            addCriterion("reviewname not like", value, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameIn(List<String> values) {
            addCriterion("reviewname in", values, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameNotIn(List<String> values) {
            addCriterion("reviewname not in", values, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameBetween(String value1, String value2) {
            addCriterion("reviewname between", value1, value2, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnameNotBetween(String value1, String value2) {
            addCriterion("reviewname not between", value1, value2, "reviewname");
            return (Criteria) this;
        }

        public Criteria andReviewnumberIsNull() {
            addCriterion("reviewnumber is null");
            return (Criteria) this;
        }

        public Criteria andReviewnumberIsNotNull() {
            addCriterion("reviewnumber is not null");
            return (Criteria) this;
        }

        public Criteria andReviewnumberEqualTo(String value) {
            addCriterion("reviewnumber =", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberNotEqualTo(String value) {
            addCriterion("reviewnumber <>", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberGreaterThan(String value) {
            addCriterion("reviewnumber >", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberGreaterThanOrEqualTo(String value) {
            addCriterion("reviewnumber >=", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberLessThan(String value) {
            addCriterion("reviewnumber <", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberLessThanOrEqualTo(String value) {
            addCriterion("reviewnumber <=", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberLike(String value) {
            addCriterion("reviewnumber like", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberNotLike(String value) {
            addCriterion("reviewnumber not like", value, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberIn(List<String> values) {
            addCriterion("reviewnumber in", values, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberNotIn(List<String> values) {
            addCriterion("reviewnumber not in", values, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberBetween(String value1, String value2) {
            addCriterion("reviewnumber between", value1, value2, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewnumberNotBetween(String value1, String value2) {
            addCriterion("reviewnumber not between", value1, value2, "reviewnumber");
            return (Criteria) this;
        }

        public Criteria andReviewstatusIsNull() {
            addCriterion("reviewstatus is null");
            return (Criteria) this;
        }

        public Criteria andReviewstatusIsNotNull() {
            addCriterion("reviewstatus is not null");
            return (Criteria) this;
        }

        public Criteria andReviewstatusEqualTo(String value) {
            addCriterion("reviewstatus =", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusNotEqualTo(String value) {
            addCriterion("reviewstatus <>", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusGreaterThan(String value) {
            addCriterion("reviewstatus >", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusGreaterThanOrEqualTo(String value) {
            addCriterion("reviewstatus >=", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusLessThan(String value) {
            addCriterion("reviewstatus <", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusLessThanOrEqualTo(String value) {
            addCriterion("reviewstatus <=", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusLike(String value) {
            addCriterion("reviewstatus like", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusNotLike(String value) {
            addCriterion("reviewstatus not like", value, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusIn(List<String> values) {
            addCriterion("reviewstatus in", values, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusNotIn(List<String> values) {
            addCriterion("reviewstatus not in", values, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusBetween(String value1, String value2) {
            addCriterion("reviewstatus between", value1, value2, "reviewstatus");
            return (Criteria) this;
        }

        public Criteria andReviewstatusNotBetween(String value1, String value2) {
            addCriterion("reviewstatus not between", value1, value2, "reviewstatus");
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