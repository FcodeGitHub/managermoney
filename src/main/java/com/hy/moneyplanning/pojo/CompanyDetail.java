package com.hy.moneyplanning.pojo;

public class CompanyDetail {

    //加入中兴财富人数
    private int num;
    //中兴财富总额
    private int AllMoney;

    public CompanyDetail() {
    }

    public CompanyDetail(int num, int allMoney) {
        this.num = num;
        AllMoney = allMoney;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAllMoney() {
        return AllMoney;
    }

    public void setAllMoney(int allMoney) {
        AllMoney = allMoney;
    }

    @Override
    public String toString() {
        return "CompanyDetail{" +
                "num=" + num +
                ", AllMoney=" + AllMoney +
                '}';
    }
}
