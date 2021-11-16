package com.course.sigiebackend.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Contenido")
public class Contenido {
    @JsonProperty
    @Column
    @OneToMany(mappedBy = "contenido",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SubContenido> subContenidos;
    @JsonProperty
    @Column
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCurso")
    private Curso curso;

    @JsonProperty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContenido;
    @JsonProperty
    @Column
    private String tema;
    @JsonProperty
    @Column
    private int ordenContenido;

    public Contenido() {
    }

    public Contenido(int idContenido, String tema, int ordenContenido) {
        this.idContenido = idContenido;
        this.tema = tema;
        this.ordenContenido = ordenContenido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int contenidoId) {
        this.idContenido = idContenido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getOrdenContenido() {
        return ordenContenido;
    }

    public void setOrdenContenido(int ordenContenido) {
        this.ordenContenido = ordenContenido;
    }

    public List<SubContenido> getSubContenidos() {
        return subContenidos;
    }

    public void setSubContenidos(List<SubContenido> subContenidos) {
        this.subContenidos = subContenidos;
    }
}
