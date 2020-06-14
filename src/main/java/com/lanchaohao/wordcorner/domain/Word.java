package com.lanchaohao.wordcorner.domain;

import javax.persistence.*;

@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String word;

    private String ping;

    private Float difficult;

    private String pronunciation;

    private String wordexplain;

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
     * @return word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word
     */
    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    /**
     * @return ping
     */
    public String getPing() {
        return ping;
    }

    /**
     * @param ping
     */
    public void setPing(String ping) {
        this.ping = ping == null ? null : ping.trim();
    }

    /**
     * @return difficult
     */
    public Float getDifficult() {
        return difficult;
    }

    /**
     * @param difficult
     */
    public void setDifficult(Float difficult) {
        this.difficult = difficult;
    }

    /**
     * @return pronunciation
     */
    public String getPronunciation() {
        return pronunciation;
    }

    /**
     * @param pronunciation
     */
    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation == null ? null : pronunciation.trim();
    }

    /**
     * @return explain
     */
    public String getWordexplain() {
        return wordexplain;
    }

    /**
     * @param explain
     */
    public void setWordexplain(String explain) {
        this.wordexplain = wordexplain == null ? null : wordexplain.trim();
    }
}