package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer classteacher;

    private String classname;

    private Integer stunum;

    private String classdescr;

    private String classboard;

    private Date createtime;

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
     * @return classteacher
     */
    public Integer getClassteacher() {
        return classteacher;
    }

    /**
     * @param classteacher
     */
    public void setClassteacher(Integer classteacher) {
        this.classteacher = classteacher;
    }

    /**
     * @return classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname
     */
    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    /**
     * @return stunum
     */
    public Integer getStunum() {
        return stunum;
    }

    /**
     * @param stunum
     */
    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    /**
     * @return classdescr
     */
    public String getClassdescr() {
        return classdescr;
    }

    /**
     * @param classdescr
     */
    public void setClassdescr(String classdescr) {
        this.classdescr = classdescr == null ? null : classdescr.trim();
    }

    /**
     * @return classboard
     */
    public String getClassboard() {
        return classboard;
    }

    /**
     * @param classboard
     */
    public void setClassboard(String classboard) {
        this.classboard = classboard == null ? null : classboard.trim();
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}