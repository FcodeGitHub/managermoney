package com.hy.moneyplanning.pojo;

public class Dynamic {

    private int id;
    private String info;

    public Dynamic() {
    }

    public Dynamic(int id, String info) {
        this.id = id;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
