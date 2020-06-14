package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String gname;

    private String gdescr;

    private Integer conductorid;

    private Date createtime;

    private String gimage;

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
     * @return gname
     */
    public String getGname() {
        return gname;
    }

    /**
     * @param gname
     */
    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    /**
     * @return gdescr
     */
    public String getGdescr() {
        return gdescr;
    }

    /**
     * @param gdescr
     */
    public void setGdescr(String gdescr) {
        this.gdescr = gdescr == null ? null : gdescr.trim();
    }

    /**
     * @return conductorid
     */
    public Integer getConductorid() {
        return conductorid;
    }

    /**
     * @param conductorid
     */
    public void setConductorid(Integer conductorid) {
        this.conductorid = conductorid;
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

    /**
     * @return gimage
     */
    public String getGimage() {
        return gimage;
    }

    /**
     * @param gimage
     */
    public void setGimage(String gimage) {
        this.gimage = gimage == null ? null : gimage.trim();
    }
}