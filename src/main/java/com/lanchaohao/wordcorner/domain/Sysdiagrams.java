package com.lanchaohao.wordcorner.domain;

import javax.persistence.*;

@Table(name = "sysdiagrams")
public class Sysdiagrams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "principal_id")
    private Integer principalId;

    @Column(name = "diagram_id")
    private Integer diagramId;

    private Integer version;

    private byte[] definition;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return principal_id
     */
    public Integer getPrincipalId() {
        return principalId;
    }

    /**
     * @param principalId
     */
    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    /**
     * @return diagram_id
     */
    public Integer getDiagramId() {
        return diagramId;
    }

    /**
     * @param diagramId
     */
    public void setDiagramId(Integer diagramId) {
        this.diagramId = diagramId;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return definition
     */
    public byte[] getDefinition() {
        return definition;
    }

    /**
     * @param definition
     */
    public void setDefinition(byte[] definition) {
        this.definition = definition;
    }
}