package com.entity;

import java.util.Date;

public class Scheduling {
    private Integer schedulingid;

    private Integer projectid;

    private String picture;

    private String name;

    private String stype;

    private String cycle;

    private String requirement;

    private String snumber;

    private String writestatus;

    private String dayunit;

    private String dayunitreview;

    private Date reallystart;

    private Date reallyend;

    private String zbtype;

    private String buildunit;

    private String imageprogress;

    private String question;

    private String sendfund;

    private String finishfund;

    private String tdxfunit;

    private Date tdstart;

    private Date tdend;

    private String tdstatus;

    private Date xftime;

    private String sendunit;

    public Integer getSchedulingid() {
        return schedulingid;
    }

    public void setSchedulingid(Integer schedulingid) {
        this.schedulingid = schedulingid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber == null ? null : snumber.trim();
    }

    public String getWritestatus() {
        return writestatus;
    }

    public void setWritestatus(String writestatus) {
        this.writestatus = writestatus == null ? null : writestatus.trim();
    }

    public String getDayunit() {
        return dayunit;
    }

    public void setDayunit(String dayunit) {
        this.dayunit = dayunit == null ? null : dayunit.trim();
    }

    public String getDayunitreview() {
        return dayunitreview;
    }

    public void setDayunitreview(String dayunitreview) {
        this.dayunitreview = dayunitreview == null ? null : dayunitreview.trim();
    }

    public Date getReallystart() {
        return reallystart;
    }

    public void setReallystart(Date reallystart) {
        this.reallystart = reallystart;
    }

    public Date getReallyend() {
        return reallyend;
    }

    public void setReallyend(Date reallyend) {
        this.reallyend = reallyend;
    }

    public String getZbtype() {
        return zbtype;
    }

    public void setZbtype(String zbtype) {
        this.zbtype = zbtype == null ? null : zbtype.trim();
    }

    public String getBuildunit() {
        return buildunit;
    }

    public void setBuildunit(String buildunit) {
        this.buildunit = buildunit == null ? null : buildunit.trim();
    }

    public String getImageprogress() {
        return imageprogress;
    }

    public void setImageprogress(String imageprogress) {
        this.imageprogress = imageprogress == null ? null : imageprogress.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getSendfund() {
        return sendfund;
    }

    public void setSendfund(String sendfund) {
        this.sendfund = sendfund == null ? null : sendfund.trim();
    }

    public String getFinishfund() {
        return finishfund;
    }

    public void setFinishfund(String finishfund) {
        this.finishfund = finishfund == null ? null : finishfund.trim();
    }

    public String getTdxfunit() {
        return tdxfunit;
    }

    public void setTdxfunit(String tdxfunit) {
        this.tdxfunit = tdxfunit == null ? null : tdxfunit.trim();
    }

    public Date getTdstart() {
        return tdstart;
    }

    public void setTdstart(Date tdstart) {
        this.tdstart = tdstart;
    }

    public Date getTdend() {
        return tdend;
    }

    public void setTdend(Date tdend) {
        this.tdend = tdend;
    }

    public String getTdstatus() {
        return tdstatus;
    }

    public void setTdstatus(String tdstatus) {
        this.tdstatus = tdstatus == null ? null : tdstatus.trim();
    }

    public Date getXftime() {
        return xftime;
    }

    public void setXftime(Date xftime) {
        this.xftime = xftime;
    }

    public String getSendunit() {
        return sendunit;
    }

    public void setSendunit(String sendunit) {
        this.sendunit = sendunit == null ? null : sendunit.trim();
    }
}