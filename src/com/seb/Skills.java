package com.seb;

public class Skills {
    private String skills;
    private String level;

    public Skills(String skills, String level) {
        this.skills = skills;
        this.level = level;

    }

    public Skills() {
    }

    public String getSkills() {
        return skills;
    }

    public String getLevel() {
        return level;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
