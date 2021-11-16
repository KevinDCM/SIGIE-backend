package com.course.sigiebackend.service;

import com.course.sigiebackend.entity.Curso;
import com.course.sigiebackend.entity.Enfasis;
import com.course.sigiebackend.repository.EnfasisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EnfasisService {

    @Autowired
    private EnfasisRepository repository;

    // using ORM Hibernate
    public List<Enfasis> listAll() {
        return repository.findAll();
    }

    public void save(Enfasis enfasis) { repository.save(enfasis); }

    public Enfasis get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}