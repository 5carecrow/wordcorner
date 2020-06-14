package com.lanchaohao.wordcorner.domain;

import javax.persistence.*;

@Table(name = "file")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer ownid;

    private String filename;

    private byte[] filelink;

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
     * @return ownid
     */
    public Integer getOwnid() {
        return ownid;
    }

    /**
     * @param ownid
     */
    public void setOwnid(Integer ownid) {
        this.ownid = ownid;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * @return filelink
     */
    public byte[] getFilelink() {
        return filelink;
    }

    /**
     * @param filelink
     */
    public void setFilelink(byte[] filelink) {
        this.filelink = filelink;
    }
}