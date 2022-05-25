package com.portfolio.Fran.Repository;

import com.portfolio.Fran.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillsRepo extends JpaRepository<Skills, Long>{
    
}
