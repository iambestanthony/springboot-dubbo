package com.kayak.dubbo_common.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Created by JayJ on 2019/7/23.
 **/
public class User implements Serializable {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String userName;
    @JsonProperty
    private String password;
    @JsonProperty
    private String userNum;
    @JsonProperty
    private String realName;

    public User() {
    }

    public User(String userName, String password, String userNum) {

        this.userName = userName;
        this.password = password;
        this.userNum = userNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userNum='" + userNum + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
