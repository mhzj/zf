package com.entity;

import java.util.Date;

public class Yearplan {
    private Integer yearplanid;

    private Integer projectid;

    private String fromproject;

    private String bsunit;

    private String receiveunit;

    private String projectname;

    private String projecttype;

    private String site;

    private String gbindustry;

    private String industry;

    private String investment;

    private String xdfundyear;

    private String thisfund;

    private Date starttime;

    private Date endtime;

    private Date plantime;

    private String sendstatus;

    private Date sendtime;

    private String applyyear;

    private String planstatus;

    private Date updatetime;

    private String bsnumber;

    private String fundnumber;

    private String title;

    public Integer getYearplanid() {
        return yearplanid;
    }

    public void setYearplanid(Integer yearplanid) {
        this.yearplanid = yearplanid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getFromproject() {
        return fromproject;
    }

    public void setFromproject(String fromproject) {
        this.fromproject = fromproject == null ? null : fromproject.trim();
    }

    public String getBsunit() {
        return bsunit;
    }

    public void setBsunit(String bsunit) {
        this.bsunit = bsunit == null ? null : bsunit.trim();
    }

    public String getReceiveunit() {
        return receiveunit;
    }

    public void setReceiveunit(String receiveunit) {
        this.receiveunit = receiveunit == null ? null : receiveunit.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getGbindustry() {
        return gbindustry;
    }

    public void setGbindustry(String gbindustry) {
        this.gbindustry = gbindustry == null ? null : gbindustry.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment == null ? null : investment.trim();
    }

    public String getXdfundyear() {
        return xdfundyear;
    }

    public void setXdfundyear(String xdfundyear) {
        this.xdfundyear = xdfundyear == null ? null : xdfundyear.trim();
    }

    public String getThisfund() {
        return thisfund;
    }

    public void setThisfund(String thisfund) {
        this.thisfund = thisfund == null ? null : thisfund.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getPlantime() {
        return plantime;
    }

    public void setPlantime(Date plantime) {
        this.plantime = plantime;
    }

    public String getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus == null ? null : sendstatus.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getApplyyear() {
        return applyyear;
    }

    public void setApplyyear(String applyyear) {
        this.applyyear = applyyear == null ? null : applyyear.trim();
    }

    public String getPlanstatus() {
        return planstatus;
    }

    public void setPlanstatus(String planstatus) {
        this.planstatus = planstatus == null ? null : planstatus.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getBsnumber() {
        return bsnumber;
    }

    public void setBsnumber(String bsnumber) {
        this.bsnumber = bsnumber == null ? null : bsnumber.trim();
    }

    public String getFundnumber() {
        return fundnumber;
    }

    public void setFundnumber(String fundnumber) {
        this.fundnumber = fundnumber == null ? null : fundnumber.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}