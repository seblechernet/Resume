package com.seb;

public class Education {
    private String field;
    private String nameOfSchool;
    private String yearOfGrad;

    public Education(String field, String nameOfSchool, String yearofGrad) {
        this.field = field;
        this.nameOfSchool = nameOfSchool;
        this.yearOfGrad = yearOfGrad;
    }

    public Education(){

    }

    public String getField() {
        return field;
    }

    public String getNameofschool() {
        return nameOfSchool;
    }

    public String getYearofgrad() {
        return yearOfGrad;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setNameofschool(String nameofschool) {
        this.nameOfSchool = nameofschool;
    }

    public void setYearofgrad(String yearofgrad) {
        this.yearOfGrad = yearofgrad;
    }
}
