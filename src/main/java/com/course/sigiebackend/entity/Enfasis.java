package com.course.sigiebackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Enfasis")

public class Enfasis {

    @JsonProperty
    private int IdEnfasis;
    @JsonProperty
    @Column
    private String descripcion;


    // @ManyToOne()


    public Enfasis() {
    }

    public Enfasis(int idEnfasis, String descripcion) {
        IdEnfasis = idEnfasis;
        this.descripcion = descripcion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdEnfasis() {
        return IdEnfasis;
    }


    public void setIdEnfasis(int idEnfasis) {
        IdEnfasis = idEnfasis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
