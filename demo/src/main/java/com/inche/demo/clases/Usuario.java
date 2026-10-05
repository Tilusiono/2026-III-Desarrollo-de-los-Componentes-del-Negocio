package com.inche.demo.clases;

import java.util.Date;

public class Usuario {

    private int idUsuario; //Id
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private TipoUsuario tipoUsuario; //FK: Relación con la clase TipoUsuario
    
    private int cantidadUsuarios=0; 

    public Usuario(int id,String nom,String ape,Date fNac,TipoUsuario tipo) {
        this.idUsuario = id;
        this.nombre = nom;
        this.apellido = ape;
        this.fechaNacimiento = fNac;
        this.tipoUsuario = tipo;
        this.cantidadUsuarios++;   
    }

     public Usuario(int id,String nom,String ape,Date fNac) {
        this.idUsuario = id;
        this.nombre = nom;
        this.apellido = ape;
        this.fechaNacimiento = fNac;
        this.cantidadUsuarios++;   
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        if (fechaNacimiento == null) {
            return null;
        }
        Date fechaActual = new Date();
        long diferenciaEnMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        long edadEnAnios = diferenciaEnMilisegundos / (1000L * 60 * 60 * 24 * 365);
        return (int) edadEnAnios;
    }


    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Integer getCantidadUsuarios() {
        return cantidadUsuarios;
    }
}
