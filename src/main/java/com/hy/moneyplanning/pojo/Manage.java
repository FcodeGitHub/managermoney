package com.hy.moneyplanning.pojo;

import java.util.List;

public class Manage {
    private Integer id;

    private String info;

    private Double repaySum;

    private int repayId;

    private int projectId;

    private List<Repay> repayList;

    public Manage() {
    }

    public Manage(Integer id, String info, Double repaySum, int repayId, int projectId) {
        this.id = id;
        this.info = info;
        this.repaySum = repaySum;
        this.repayId = repayId;
        this.projectId = projectId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Double getRepaySum() {
        return repaySum;
    }

    public void setRepaySum(Double repaySum) {
        this.repaySum = repaySum;
    }

    public int getRepayId() {
        return repayId;
    }

    public void setRepayId(int repayId) {
        this.repayId = repayId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public List<Repay> getRepayList() {
        return repayList;
    }

    public void setRepayList(List<Repay> repayList) {
        this.repayList = repayList;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", repaySum=" + repaySum +
                ", repayId=" + repayId +
                ", projectId=" + projectId +
                '}';
    }
}