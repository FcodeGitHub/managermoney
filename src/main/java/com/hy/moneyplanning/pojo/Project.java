package com.hy.moneyplanning.pojo;

import java.util.Date;

public class Project {

    private int id;
    private String projectName;
    private double yearsHaving;
    private int months;
    private int money;
    private String createTime;
    private String repaymentTime;
    private String needMoney;
    private String repaymentType;
    private String guarantee;
    private int beginMoney;
    private int ProductDeadline;
    private int borrowMoney;
    private String type;
    private String perMoney;

    public Project() {
    }

    public Project(int id, String projectName, double yearsHaving, int months, int money, String createTime, String repaymentTime, String needMoney, String repaymentType, String guarantee, int beginMoney, int productDeadline, int borrowMoney, String type) {
        this.id = id;
        this.projectName = projectName;
        this.yearsHaving = yearsHaving;
        this.months = months;
        this.money = money;
        this.createTime = createTime;
        this.repaymentTime = repaymentTime;
        this.needMoney = needMoney;
        this.repaymentType = repaymentType;
        this.guarantee = guarantee;
        this.beginMoney = beginMoney;
        ProductDeadline = productDeadline;
        this.borrowMoney = borrowMoney;
        this.type = type;
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

    public double getYearsHaving() {
        return yearsHaving;
    }

    public void setYearsHaving(double yearsHaving) {
        this.yearsHaving = yearsHaving;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
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

    public int getBeginMoney() {
        return beginMoney;
    }

    public void setBeginMoney(int beginMoney) {
        this.beginMoney = beginMoney;
    }

    public int getProductDeadline() {
        return ProductDeadline;
    }

    public void setProductDeadline(int productDeadline) {
        ProductDeadline = productDeadline;
    }

    public int getBorrowMoney() {
        return borrowMoney;
    }

    public void setBorrowMoney(int borrowMoney) {
        this.borrowMoney = borrowMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", yearsHaving=" + yearsHaving +
                ", months=" + months +
                ", money=" + money +
                ", createTime='" + createTime + '\'' +
                ", repaymentTime='" + repaymentTime + '\'' +
                ", needMoney='" + needMoney + '\'' +
                ", repaymentType='" + repaymentType + '\'' +
                ", guarantee='" + guarantee + '\'' +
                ", beginMoney=" + beginMoney +
                ", ProductDeadline=" + ProductDeadline +
                ", borrowMoney=" + borrowMoney +
                ", type='" + type + '\'' +
                '}';
    }
}
