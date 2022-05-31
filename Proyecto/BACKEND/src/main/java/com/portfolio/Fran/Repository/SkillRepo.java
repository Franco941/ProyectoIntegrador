package com.portfolio.Fran.Repository;

import com.portfolio.Fran.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillRepo extends JpaRepository<Skill, Long> {

}
