package com.hy.moneyplanning.pojo;

import java.util.Date;

public class RecordUser {
    private Integer id;

    private String userName;

    private Double money;

    private String createTime;

    private String state;

    private Integer projectId;

    public RecordUser() {
    }

    public RecordUser(Integer id, String userName, Double money, String createTime, String state, Integer projectId) {
        this.id = id;
        this.userName = userName;
        this.money = money;
        this.createTime = createTime;
        this.state = state;
        this.projectId = projectId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "RecordUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                ", createTime=" + createTime +
                ", state='" + state + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}