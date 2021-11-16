package com.course.sigiebackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Curso")


public class Curso {
    @JsonProperty
    private int idCurso;
    @JsonProperty
    @Column
    private String sigla;
    @JsonProperty
    @Column
    private String nombre;
    @JsonProperty
    @Column
    private int creditos;
    @JsonProperty
    @Column
    private String ciclo;
    @JsonProperty
    @Column
    private boolean electivo;
    @JsonProperty
    @Column
    private int horasTeoria;
    @JsonProperty
    @Column
    private int horasPractica;
    @JsonProperty
    @Column
    private int horasLaboratorio;
    @JsonProperty
    @Column
    private int horasTeoriaPractica;
    @JsonProperty
    @Column
    private String objetivoGeneral;
    @JsonProperty
    @Column
    @OneToMany
    private List<Curso> electivos;
    @JsonProperty
    @Column
    @OneToMany
    private List<Curso> requisitos;
    @JsonProperty
    @Column
    @OneToMany
    private List<Curso> correquisitos;
    @JsonProperty
    @Column
    @ManyToOne
    private Modalidad modalidad;
    @JsonProperty
    @Column
    @OneToMany
    private List<Contenido> contenidos;
    @JsonProperty
    @Column
    @OneToMany
    private List<UnidadAcademica> unidades;
    @JsonProperty
    @Column
    @OneToMany
    private List<Enfasis> enfasis;

    public Curso() {
    }

    public Curso(int idCurso, String sigla, String nombre, int creditos, String ciclo,
                 boolean electivo, int horasTeoria, int horasPractica, int horasLaboratorio,
                 int horasTeoriaPractica, String objetivoGeneral, List<Curso> electivos,
                 List<Curso> requisitos, List<Curso> correquisitos, Modalidad modalidad,
                 List<Contenido> contenidos, List<UnidadAcademica> unidades,
                 List<Enfasis> enfasis) {
        this.idCurso = idCurso;
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
        this.electivo = electivo;
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
        this.horasLaboratorio = horasLaboratorio;
        this.horasTeoriaPractica = horasTeoriaPractica;
        this.objetivoGeneral = objetivoGeneral;
        this.electivos = electivos;
        this.requisitos = requisitos;
        this.correquisitos = correquisitos;
        this.modalidad=modalidad;
        this.contenidos=contenidos;
        this.unidades=unidades;
        this.enfasis=enfasis;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isElectivo() {
        return electivo;
    }

    public void setElectivo(boolean electivo) {
        this.electivo = electivo;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoriaPractica() {
        return horasTeoriaPractica;
    }

    public void setHorasTeoriaPractica(int horasTeoriaPractica) {
        this.horasTeoriaPractica = horasTeoriaPractica;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public List<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public List<UnidadAcademica> getUnidades() {
        return unidades;
    }

    public void setUnidades(List<UnidadAcademica> unidades) {
        this.unidades = unidades;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }
}
