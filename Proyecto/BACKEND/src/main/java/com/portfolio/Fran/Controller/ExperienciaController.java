
package com.portfolio.Fran.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExperienciaController {
    
    @GetMapping ("experiencia/hola")
    public String hola(){
        return "vo sabe";
    }
    
}
