package com.course.sigiebackend.service;

import com.course.sigiebackend.entity.UnidadAcademica;
import com.course.sigiebackend.repository.UnidadAcademicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UnidadAcademicaService {

    @Autowired
    private UnidadAcademicaRepository repository;

    // using ORM Hibernate
    public List<UnidadAcademica> listAll() {
        return repository.findAll();
    }

    public void save(UnidadAcademica student) { repository.save(student); }

    public UnidadAcademica get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
