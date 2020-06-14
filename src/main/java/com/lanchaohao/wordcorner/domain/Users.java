package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private Integer usertype;

    private String email;

    private Date registertime;

    private Date lastsign;

    private Integer signdays;

    private Date examdate;

    private Integer maxword;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return usertype
     */
    public Integer getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return registertime
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * @param registertime
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * @return lastsign
     */
    public Date getLastsign() {
        return lastsign;
    }

    /**
     * @param lastsign
     */
    public void setLastsign(Date lastsign) {
        this.lastsign = lastsign;
    }

    /**
     * @return signdays
     */
    public Integer getSigndays() {
        return signdays;
    }

    /**
     * @param signdays
     */
    public void setSigndays(Integer signdays) {
        this.signdays = signdays;
    }

    /**
     * @return examdate
     */
    public Date getExamdate() {
        return examdate;
    }

    /**
     * @param examdate
     */
    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }

    /**
     * @return maxword
     */
    public Integer getMaxword() {
        return maxword;
    }

    /**
     * @param maxword
     */
    public void setMaxword(Integer maxword) {
        this.maxword = maxword;
    }
}