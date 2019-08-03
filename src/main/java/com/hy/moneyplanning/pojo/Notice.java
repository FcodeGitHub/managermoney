package com.hy.moneyplanning.pojo;

public class Notice {
    private Integer id;

    private String title;

    private String createTime;

    private String infoDate;

    public Notice() {
    }

    public Notice(Integer id, String title, String createTime, String infoDate) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.infoDate = infoDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(String infoDate) {
        this.infoDate = infoDate;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime='" + createTime + '\'' +
                ", infoDate='" + infoDate + '\'' +
                '}';
    }
}