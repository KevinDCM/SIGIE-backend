package com.course.sigiebackend.service;
import com.course.sigiebackend.entity.Contenido;
import com.course.sigiebackend.entity.SubContenido;
import com.course.sigiebackend.repository.SubContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class SubContenidoService {
    @Autowired
    private SubContenidoRepository repository;

    // using ORM Hibernate
    public List<SubContenido> listAll() {
        return repository.findAll();
    }

    public void save(SubContenido subContenido) { repository.save(subContenido); }

    public SubContenido get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
