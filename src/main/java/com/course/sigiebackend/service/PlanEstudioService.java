package com.course.sigiebackend.service;

import com.course.sigiebackend.entity.PlanEstudio;
import com.course.sigiebackend.repository.PlanEstudioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlanEstudioService {

    private final PlanEstudioRepository repository;

    public PlanEstudioService(PlanEstudioRepository repository) {
        this.repository = repository;
    }

    // using ORM Hibernate
    public List<PlanEstudio> listAll() {
        return repository.findAll();
    }

    public void save(PlanEstudio student) { repository.save(student); }

    public PlanEstudio get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
