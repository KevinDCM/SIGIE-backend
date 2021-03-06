package com.course.sigiebackend.repository;

import com.course.sigiebackend.entity.UnidadAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnidadAcademicaRepository extends JpaRepository<UnidadAcademica, Integer> {
}
