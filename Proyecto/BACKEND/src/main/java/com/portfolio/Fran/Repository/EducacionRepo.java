package com.portfolio.Fran.Repository;

import com.portfolio.Fran.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepo extends JpaRepository<Educacion, Long> {

}
