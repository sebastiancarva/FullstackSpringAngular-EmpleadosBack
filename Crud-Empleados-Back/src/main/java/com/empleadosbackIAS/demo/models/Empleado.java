
package com.empleadosbackIAS.demo.models;

import javax.persistence.*;

/**
 *
 * @author Avvy Aston
 */

@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre",nullable = true,length = 65)
    private String nombre;
    @Column(name = "apellido",nullable = true,length = 65)
    private String apellido;
    @Column(name = "email",nullable = true,length = 65,unique = true)
    private String email;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
