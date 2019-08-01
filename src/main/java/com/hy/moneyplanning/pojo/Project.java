package com.hy.moneyplanning.pojo;

public class Project {

    private int id;
    private String projectName;
    private String yearsHaving;
    private String months;
    private String money;

    public Project() {
    }

    public Project(int id, String projectName, String yearsHaving, String months, String money) {
        this.id = id;
        this.projectName = projectName;
        this.yearsHaving = yearsHaving;
        this.months = months;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getYearsHaving() {
        return yearsHaving;
    }

    public void setYearsHaving(String yearsHaving) {
        this.yearsHaving = yearsHaving;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", yearsHaving='" + yearsHaving + '\'' +
                ", months='" + months + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
