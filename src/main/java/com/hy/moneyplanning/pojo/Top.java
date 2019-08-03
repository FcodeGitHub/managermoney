package com.hy.moneyplanning.pojo;

public class Top {

    private int id;
    private int num;
    private int userId;
    private String invested;
    private String money;
    private String yield;
    private String username;

    public Top() {
    }

    public Top(int id, int num, int userId, String invested, String money, String yield, String username) {
        this.id = id;
        this.num = num;
        this.userId = userId;
        this.invested = invested;
        this.money = money;
        this.yield = yield;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getInvested() {
        return invested;
    }

    public void setInvested(String invested) {
        this.invested = invested;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Top{" +
                "id=" + id +
                ", num=" + num +
                ", userId=" + userId +
                ", invested='" + invested + '\'' +
                ", money='" + money + '\'' +
                ", yield='" + yield + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
