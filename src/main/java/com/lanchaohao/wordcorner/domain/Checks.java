package com.lanchaohao.wordcorner.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "checks")
public class Checks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userid;

    private Integer title;

    private Integer answer;

    private Date complitime;

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
     * @return title
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(Integer title) {
        this.title = title;
    }

    /**
     * @return answer
     */
    public Integer getAnswer() {
        return answer;
    }

    /**
     * @param answer
     */
    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    /**
     * @return complitime
     */
    public Date getComplitime() {
        return complitime;
    }

    /**
     * @param complitime
     */
    public void setComplitime(Date complitime) {
        this.complitime = complitime;
    }
}