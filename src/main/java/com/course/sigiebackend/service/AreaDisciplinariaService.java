package com.course.sigiebackend.service;

import com.course.sigiebackend.entity.AreaDisciplinaria;
import com.course.sigiebackend.entity.Enfasis;
import com.course.sigiebackend.repository.AreaDisciplinariaRepository;
import com.course.sigiebackend.repository.EnfasisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AreaDisciplinariaService {

    @Autowired
    private AreaDisciplinariaRepository repository;

    // using ORM Hibernate
    public List<AreaDisciplinaria> listAll() {
        return repository.findAll();
    }

    public void save(AreaDisciplinaria areaDisciplinaria) { repository.save(areaDisciplinaria); }

    public AreaDisciplinaria get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}