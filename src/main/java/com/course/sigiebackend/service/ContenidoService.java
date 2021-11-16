package com.course.sigiebackend.service;
import com.course.sigiebackend.entity.Contenido;
import com.course.sigiebackend.repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ContenidoService {

    @Autowired
    private ContenidoRepository repository;

    // using ORM Hibernate
    public List<Contenido> listAll() {
        return repository.findAll();
    }

    public void save(Contenido contenido) { repository.save(contenido); }

    public Contenido get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
