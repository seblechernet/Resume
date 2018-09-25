package com.seb;

import java.util.Date;

public class Experience {
    private String Position;
    private String companyName;
    private String fromDate;
    private String toDate;
    private String duty;

    public Experience(String position, String companyName, String fromDate, String toDate, String duty) {
        Position = position;
        this.companyName = companyName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.duty = duty;
    }

    public Experience() {
    }

    public String getPosition() {
        return Position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public String getDuty() {
        return duty;
    }


    public void setPosition(String position) {
        Position = position;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
