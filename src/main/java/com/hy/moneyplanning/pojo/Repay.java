package com.hy.moneyplanning.pojo;

public class Repay {
    private Integer id;

    private Double repayMoney;

    private String repayDate;

    private String repayType;

    private String repayState;

    private Integer manageId;

    public Repay() {
    }

    public Repay(Integer id, Double repayMoney, String repayDate, String repayType, String repayState, Integer manageId) {
        this.id = id;
        this.repayMoney = repayMoney;
        this.repayDate = repayDate;
        this.repayType = repayType;
        this.repayState = repayState;
        this.manageId = manageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRepayMoney() {
        return repayMoney;
    }

    public void setRepayMoney(Double repayMoney) {
        this.repayMoney = repayMoney;
    }

    public String getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public String getRepayState() {
        return repayState;
    }

    public void setRepayState(String repayState) {
        this.repayState = repayState;
    }

    public Integer getManageId() {
        return manageId;
    }

    public void setManageId(Integer manageId) {
        this.manageId = manageId;
    }

    @Override
    public String toString() {
        return "Repay{" +
                "id=" + id +
                ", repayMoney=" + repayMoney +
                ", repayDate='" + repayDate + '\'' +
                ", repayType='" + repayType + '\'' +
                ", repayState='" + repayState + '\'' +
                ", manageId=" + manageId +
                '}';
    }
}