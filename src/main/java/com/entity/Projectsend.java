package com.entity;

import java.util.Date;

public class Projectsend {
    private Integer id;

    private Integer projectid;

    private String librarytype;

    private String fromproject;

    private String rate;

    private String saverate;

    private String status;

    private String savesite;

    private Date savetime;

    private String fromsite;

    private String receivesite;

    private String projecttype;

    private Date chubeitime;

    private String projectname;

    private String site;

    private String gbindustry;

    private String industry;

    private String investment;

    private Date starttime;

    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getLibrarytype() {
        return librarytype;
    }

    public void setLibrarytype(String librarytype) {
        this.librarytype = librarytype == null ? null : librarytype.trim();
    }

    public String getFromproject() {
        return fromproject;
    }

    public void setFromproject(String fromproject) {
        this.fromproject = fromproject == null ? null : fromproject.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public String getSaverate() {
        return saverate;
    }

    public void setSaverate(String saverate) {
        this.saverate = saverate == null ? null : saverate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSavesite() {
        return savesite;
    }

    public void setSavesite(String savesite) {
        this.savesite = savesite == null ? null : savesite.trim();
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public String getFromsite() {
        return fromsite;
    }

    public void setFromsite(String fromsite) {
        this.fromsite = fromsite == null ? null : fromsite.trim();
    }

    public String getReceivesite() {
        return receivesite;
    }

    public void setReceivesite(String receivesite) {
        this.receivesite = receivesite == null ? null : receivesite.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public Date getChubeitime() {
        return chubeitime;
    }

    public void setChubeitime(Date chubeitime) {
        this.chubeitime = chubeitime;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
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
}