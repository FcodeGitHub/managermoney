package com.hy.moneyplanning.pojo;

import java.util.Date;

public class UserComment {
    private Integer id;

    private String userName;

    private Date createTime;

    private Integer projectId;

    private String comment;

    public UserComment() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "UserComment{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}