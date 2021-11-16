package com.course.sigiebackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Modalidad")


public class Modalidad {
    @JsonProperty
    private int idModalidad;
    @JsonProperty
    @Column
    private String tipoModalidad;
    @JsonProperty
    @Column
    @OneToMany
    private List<Curso> cursos;

    public Modalidad() {

    }

    public Modalidad(int idModalidad, String tipoModalidad, List<Curso> cursos) {
        this.idModalidad = idModalidad;
        this.tipoModalidad = tipoModalidad;
        this.cursos = cursos;
    }

    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}