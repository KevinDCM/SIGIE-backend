package com.course.sigiebackend.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "SubContenido")
public class SubContenido {

    @JsonProperty
    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idContenido")
    private Contenido contenido;

    @JsonProperty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subContenidoId;
    @JsonProperty
    @Column
    private String subTema;
    @JsonProperty
    @Column
    private int ordenSubContenido;

    public SubContenido() {
    }

    public SubContenido(int subContenidoId, String subTema, int ordenSubContenido) {
        this.subContenidoId = subContenidoId;
        this.subTema = subTema;
        this.ordenSubContenido = ordenSubContenido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSubContenidoId() {
        return subContenidoId;
    }

    public void setSubContenidoId(int subContenidoId) {
        this.subContenidoId = subContenidoId;
    }

    public String getSubTema() {
        return subTema;
    }

    public void setSubTema(String subTema) {
        this.subTema = subTema;
    }

    public int getOrdenSubContenido() {
        return ordenSubContenido;
    }

    public void setOrdenSubContenido(int ordenSubContenido) {
        this.ordenSubContenido = ordenSubContenido;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
