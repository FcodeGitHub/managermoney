package com.hy.moneyplanning.pojo;

public class News {

    private int id;
    private String info;

    public News() {
    }

    public News(int id, String info) {
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
        return "News{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
