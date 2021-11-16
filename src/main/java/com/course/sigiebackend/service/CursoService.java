package com.course.sigiebackend.service;

import com.course.sigiebackend.entity.Curso;
import com.course.sigiebackend.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CursoService {

    @Autowired
    private CursoRepository repository;

    // using ORM Hibernate
    public List<Curso> listAll() {
        return repository.findAll();
    }

    public void save(Curso student) { repository.save(student); }

    public Curso get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}