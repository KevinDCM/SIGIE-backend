package com.course.sigiebackend.entity;

import java.util.ArrayList;

public class PlanEstudio {
    private int idPlanEstudio;
    private int annoAprobacion;
    private int cantidadCiclos;
    private int codigoCarrera;
    private int duracionAnnos;
    private String nombreCarrera;
    private ArrayList<UnidadAcademica> unidadesAcdemicasPropietarias;
    private ArrayList<Curso> cursos;
    private ArrayList<Enfasis> enfasis;

    public PlanEstudio() {
        this.idPlanEstudio = 0;
        this.annoAprobacion = 0;
        this.cantidadCiclos = 0;
        this.codigoCarrera = 0;
        this.duracionAnnos = 0;
        this.nombreCarrera = "";
        this.unidadesAcdemicasPropietarias = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.enfasis = new ArrayList<Enfasis>();
    }

    public PlanEstudio(int idPlanEstudio, int annoAprobacion, int cantidadCiclos, int codigoCarrera, int duracionAnnos, String nombreCarrera, ArrayList<UnidadAcademica> unidadesAcdemicasPropietarias, ArrayList<Curso> cursos, ArrayList<Enfasis> enfasis) {
        this.idPlanEstudio = idPlanEstudio;
        this.annoAprobacion = annoAprobacion;
        this.cantidadCiclos = cantidadCiclos;
        this.codigoCarrera = codigoCarrera;
        this.duracionAnnos = duracionAnnos;
        this.nombreCarrera = nombreCarrera;
        this.unidadesAcdemicasPropietarias = unidadesAcdemicasPropietarias;
        this.cursos = cursos;
        this.enfasis = enfasis;
    }

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public int getAnnoAprobacion() {
        return annoAprobacion;
    }

    public void setAnnoAprobacion(int annoAprobacion) {
        this.annoAprobacion = annoAprobacion;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }

    public void setCantidadCiclos(int cantidadCiclos) {
        this.cantidadCiclos = cantidadCiclos;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getDuracionAnnos() {
        return duracionAnnos;
    }

    public void setDuracionAnnos(int duracionAnnos) {
        this.duracionAnnos = duracionAnnos;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public ArrayList<UnidadAcademica> getUnidadesAcdemicasPropietarias() {
        return unidadesAcdemicasPropietarias;
    }

    public void setUnidadesAcdemicasPropietarias(ArrayList<UnidadAcademica> unidadesAcdemicasPropietarias) {
        this.unidadesAcdemicasPropietarias = unidadesAcdemicasPropietarias;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(ArrayList<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }
}
