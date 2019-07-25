package com.kayak.dubbo_common.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Created by JayJ on 2019/7/23.
 **/
public class User implements Serializable {
    @JsonProperty
    private String userName;
    @JsonProperty
    private String password;
    @JsonProperty
    private String userNum;

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
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userNum='" + userNum + '\'' +
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
}
