package com.portfolio.Fran.Repository;

import com.portfolio.Fran.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    
}
