package com.course.sigiebackend.repository;

import com.course.sigiebackend.entity.Contenido;
import com.course.sigiebackend.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
}
