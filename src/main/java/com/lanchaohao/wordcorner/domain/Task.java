package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer pubtype;

    private Integer classid;

    private String title;

    private String detail;

    private Date pubtime;

    private Date endtime;

    private Integer fileid;

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
     * @return pubtype
     */
    public Integer getPubtype() {
        return pubtype;
    }

    /**
     * @param pubtype
     */
    public void setPubtype(Integer pubtype) {
        this.pubtype = pubtype;
    }

    /**
     * @return classid
     */
    public Integer getClassid() {
        return classid;
    }

    /**
     * @param classid
     */
    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * @return pubtime
     */
    public Date getPubtime() {
        return pubtime;
    }

    /**
     * @param pubtime
     */
    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    /**
     * @return endtime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return fileid
     */
    public Integer getFileid() {
        return fileid;
    }

    /**
     * @param fileid
     */
    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }
}