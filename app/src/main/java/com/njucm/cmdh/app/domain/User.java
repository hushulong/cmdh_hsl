package com.njucm.cmdh.app.domain;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table USER.
 */
public class User {

    private Long id;
    private Integer userid;
    private String username;
    private String usersex;
    private String password;
    private String email;
    private Integer userage;
    private Integer temp_sleepfeatureid;
    private Integer temp_exercisefeatureid;
    private Integer temp_eatingfeatureid;
    private Integer temp_adminisareaid;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, Integer userid, String username, String usersex, String password,String email, Integer userage, Integer temp_sleepfeatureid, Integer temp_exercisefeatureid, Integer temp_eatingfeatureid, Integer temp_adminisareaid) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.usersex = usersex;
        this.password = password;
        this.email = email;
        this.userage = userage;
        this.temp_sleepfeatureid = temp_sleepfeatureid;
        this.temp_exercisefeatureid = temp_exercisefeatureid;
        this.temp_eatingfeatureid = temp_eatingfeatureid;
        this.temp_adminisareaid = temp_adminisareaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Integer getTemp_sleepfeatureid() {
        return temp_sleepfeatureid;
    }

    public void setTemp_sleepfeatureid(Integer temp_sleepfeatureid) {
        this.temp_sleepfeatureid = temp_sleepfeatureid;
    }

    public Integer getTemp_exercisefeatureid() {
        return temp_exercisefeatureid;
    }

    public void setTemp_exercisefeatureid(Integer temp_exercisefeatureid) {
        this.temp_exercisefeatureid = temp_exercisefeatureid;
    }

    public Integer getTemp_eatingfeatureid() {
        return temp_eatingfeatureid;
    }

    public void setTemp_eatingfeatureid(Integer temp_eatingfeatureid) {
        this.temp_eatingfeatureid = temp_eatingfeatureid;
    }

    public Integer getTemp_adminisareaid() {
        return temp_adminisareaid;
    }

    public void setTemp_adminisareaid(Integer temp_adminisareaid) {
        this.temp_adminisareaid = temp_adminisareaid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
