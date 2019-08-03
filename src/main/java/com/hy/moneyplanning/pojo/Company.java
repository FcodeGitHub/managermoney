package com.hy.moneyplanning.pojo;


public class Company {
    private Integer id;

    private String createTime;

    private String address;

    private String type;

    private String name;

    private String fund;

    private String manageState;

    private String moneyState;

    private Integer projectId;

    public Company() {
    }

    public Company(Integer id, String createTime, String address, String type, String name, String fund, String manageState, String moneyState, Integer projectId) {
        this.id = id;
        this.createTime = createTime;
        this.address = address;
        this.type = type;
        this.name = name;
        this.fund = fund;
        this.manageState = manageState;
        this.moneyState = moneyState;
        this.projectId = projectId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getManageState() {
        return manageState;
    }

    public void setManageState(String manageState) {
        this.manageState = manageState;
    }

    public String getMoneyState() {
        return moneyState;
    }

    public void setMoneyState(String moneyState) {
        this.moneyState = moneyState;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", fund='" + fund + '\'' +
                ", manageState='" + manageState + '\'' +
                ", moneyState='" + moneyState + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}