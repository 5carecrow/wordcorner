package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "myword")
public class Myword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userid;

    private Integer wordid;

    private Integer checktimes;

    private Integer truetimes;

    private Double difficult;

    private Integer marks;

    private Date studydate;

    private String datastr;

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
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return wordid
     */
    public Integer getWordid() {
        return wordid;
    }

    /**
     * @param wordid
     */
    public void setWordid(Integer wordid) {
        this.wordid = wordid;
    }

    /**
     * @return checktimes
     */
    public Integer getChecktimes() {
        return checktimes;
    }

    /**
     * @param checktimes
     */
    public void setChecktimes(Integer checktimes) {
        this.checktimes = checktimes;
    }

    /**
     * @return truetimes
     */
    public Integer getTruetimes() {
        return truetimes;
    }

    /**
     * @param truetimes
     */
    public void setTruetimes(Integer truetimes) {
        this.truetimes = truetimes;
    }

    /**
     * @return difficult
     */
    public Double getDifficult() {
        return difficult;
    }

    /**
     * @param difficult
     */
    public void setDifficult(Double difficult) {
        this.difficult = difficult;
    }

    /**
     * @return marks
     */
    public Integer getMarks() {
        return marks;
    }

    /**
     * @param marks
     */
    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    /**
     * @return studydate
     */
    public Date getStudydate() {
        return studydate;
    }

    /**
     * @param studydate
     */
    public void setStudydate(Date studydate) {
        this.studydate = studydate;
    }

    /**
     * @return datastr
     */
    public String getDatastr() {
        return datastr;
    }

    /**
     * @param datastr
     */
    public void setDatastr(String datastr) {
        this.datastr = datastr == null ? null : datastr.trim();
    }
}