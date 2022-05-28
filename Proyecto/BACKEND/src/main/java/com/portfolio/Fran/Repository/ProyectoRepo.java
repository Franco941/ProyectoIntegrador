package com.portfolio.Fran.Repository;

import com.portfolio.Fran.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ProyectoRepo extends JpaRepository<Proyecto, Long>{
    
}
