package com.hy.moneyplanning.pojo;

public class InvestProject {

    private int id;
    private String title;
    private double yearHaving;
    private int remainder;
    private double money;
    private String payMethod;
    private String agencies;
    private double planing;
    private String type;

    public InvestProject() {
    }

    public InvestProject(int id, String title, double yearHaving, int remainder, double money, String payMethod, String agencies, double planing, String type) {
        this.id = id;
        this.title = title;
        this.yearHaving = yearHaving;
        this.remainder = remainder;
        this.money = money;
        this.payMethod = payMethod;
        this.agencies = agencies;
        this.planing = planing;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getYearHaving() {
        return yearHaving;
    }

    public void setYearHaving(double yearHaving) {
        this.yearHaving = yearHaving;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getAgencies() {
        return agencies;
    }

    public void setAgencies(String agencies) {
        this.agencies = agencies;
    }

    public double getPlaning() {
        return planing;
    }

    public void setPlaning(double planing) {
        this.planing = planing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "InvestProject{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearHaving=" + yearHaving +
                ", remainder=" + remainder +
                ", money=" + money +
                ", payMethod='" + payMethod + '\'' +
                ", agencies='" + agencies + '\'' +
                ", planing=" + planing +
                ", type='" + type + '\'' +
                '}';
    }
}
