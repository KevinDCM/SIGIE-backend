package com.course.sigiebackend.repository;

import com.course.sigiebackend.entity.SubContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubContenidoRepository extends JpaRepository<SubContenido, Integer> {
}