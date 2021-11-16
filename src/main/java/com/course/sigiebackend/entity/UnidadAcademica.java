package com.course.sigiebackend.entity;

import java.util.ArrayList;

public class UnidadAcademica {
    private int idUnidadAcademica;
    private String nombreUnidadAcademica;
    private ArrayList<Curso> cursosPropios;
    private ArrayList<PlanEstudio> planEstudio;

    public UnidadAcademica() {
        this.idUnidadAcademica = 0;
        this.nombreUnidadAcademica = "";
        this.cursosPropios = new ArrayList<>();
        this.planEstudio = new ArrayList<>();
    }

    public UnidadAcademica(int idUnidadAcademica, String nombreUnidadAcademica, ArrayList<Curso> cursosPropios, ArrayList<PlanEstudio> planEstudio) {
        this.idUnidadAcademica = idUnidadAcademica;
        this.nombreUnidadAcademica = nombreUnidadAcademica;
        this.cursosPropios = cursosPropios;
        this.planEstudio = planEstudio;
    }

    public int getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getNombreUnidadAcademica() {
        return nombreUnidadAcademica;
    }

    public void setNombreUnidadAcademica(String nombreUnidadAcademica) {
        this.nombreUnidadAcademica = nombreUnidadAcademica;
    }

    public ArrayList<Curso> getCursosPropios() {
        return cursosPropios;
    }

    public void setCursosPropios(ArrayList<Curso> cursosPropios) {
        this.cursosPropios = cursosPropios;
    }

    public ArrayList<PlanEstudio> getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(ArrayList<PlanEstudio> planEstudio) {
        this.planEstudio = planEstudio;
    }
}
