package com.hy.moneyplanning.pojo;

public class Notice {
    private Integer id;

    private String title;

    private String createTime;

    private String infoDate;

    private String week;

    private String source;

    private String subject;

    private String image;

    private String info;

    private String author;

    public Notice() {
    }

    public Notice(Integer id, String title, String createTime, String infoDate, String week, String source, String subject, String image, String info, String author) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.infoDate = infoDate;
        this.week = week;
        this.source = source;
        this.subject = subject;
        this.image = image;
        this.info = info;
        this.author = author;
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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime='" + createTime + '\'' +
                ", infoDate='" + infoDate + '\'' +
                ", week='" + week + '\'' +
                ", source='" + source + '\'' +
                ", subject='" + subject + '\'' +
                ", image='" + image + '\'' +
                ", info='" + info + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}