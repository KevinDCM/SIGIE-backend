package com.course.sigiebackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "AreaDisciplinaria")

public class AreaDisciplinaria {

    @JsonProperty
    private int IdAreaDisciplinaria;
    @JsonProperty
    @Column
    private String Nombre;


    // @ManyToOne()


    public AreaDisciplinaria() {
    }

    public AreaDisciplinaria(int idEnfasis, String nombre) {
        this.IdAreaDisciplinaria = idEnfasis;
        this.Nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdAreaDisciplinaria() {
        return IdAreaDisciplinaria;
    }


    public void setIdAreaDisciplinaria(int idAreaDisciplinaria) {
        IdAreaDisciplinaria = idAreaDisciplinaria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
}
