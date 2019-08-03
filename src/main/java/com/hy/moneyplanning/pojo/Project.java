package com.hy.moneyplanning.pojo;

public class Project {

    private int id;
    private String projectName;
    private String yearsHaving;
    private String months;
    private String money;
    private String createTime;
    private String repaymentTime;
    private String needMoney;
    private String repaymentType;
    private String guarantee;
    private String perMoney;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(String repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public String getNeedMoney() {
        return needMoney;
    }

    public void setNeedMoney(String needMoney) {
        this.needMoney = needMoney;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getPerMoney() {
        return perMoney;
    }

    public void setPerMoney(String perMoney) {
        this.perMoney = perMoney;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", yearsHaving='" + yearsHaving + '\'' +
                ", months='" + months + '\'' +
                ", money='" + money + '\'' +
                ", createTime='" + createTime + '\'' +
                ", repaymentTime='" + repaymentTime + '\'' +
                ", needMoney='" + needMoney + '\'' +
                ", repaymentType='" + repaymentType + '\'' +
                ", guarantee='" + guarantee + '\'' +
                '}';
    }
}
