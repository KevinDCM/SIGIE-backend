package com.course.sigiebackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "Curso")


public class Curso {
    @JsonProperty
    private int StudentId;
    @JsonProperty
    @Column
    private String Name;
    @JsonProperty
    @Column
    private String Email;
    @JsonProperty
    @Column
    private String Password;

    public Curso() {
    }

    public Curso(int studentId, String name, String email, String password) {
        this.StudentId = studentId;
        this.Name = name;
        this.Email = email;
        this.Password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCursoId() {
        return StudentId;
    }

    public void setCursoId(int studentId) {
        this.StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
