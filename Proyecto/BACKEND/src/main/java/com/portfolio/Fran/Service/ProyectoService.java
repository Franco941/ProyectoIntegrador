package com.portfolio.Fran.Service;

import com.portfolio.Fran.Entity.Proyecto;
import com.portfolio.Fran.Repository.ProyectoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class ProyectoService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto agregarProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> buscarProyecto() {
        return proyectoRepo.findAll();
    }

    public Proyecto editarProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }

}
