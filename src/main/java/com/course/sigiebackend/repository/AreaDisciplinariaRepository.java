package com.course.sigiebackend.repository;


import com.course.sigiebackend.entity.AreaDisciplinaria;
import com.course.sigiebackend.entity.Enfasis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDisciplinariaRepository extends JpaRepository<AreaDisciplinaria, Integer>{


}
