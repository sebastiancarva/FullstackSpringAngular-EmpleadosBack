
package com.empleadosbackIAS.demo.controllers;

import com.empleadosbackIAS.demo.models.Empleado;
import com.empleadosbackIAS.demo.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Avvy Aston
 */

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin(origins = "http://localhost:4200/")
public class Controller {
    
    @Autowired
    private EmpleadoRepository empleadoRepo;
    
    @GetMapping("/listar")
    public List<Empleado> listarEmpleado(){
    return empleadoRepo.findAll();    
    }
}
