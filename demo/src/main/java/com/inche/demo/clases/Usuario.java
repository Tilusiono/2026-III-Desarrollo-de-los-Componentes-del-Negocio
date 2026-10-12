package com.inche.demo.clases;

import java.util.Date;
import java.util.List;

public class Usuario implements Notificacion {

    private int idUsuario; // Id
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private TipoUsuario tipoUsuario; // FK: Relación con la clase TipoUsuario

    private static int cantidadUsuarios = 0;
    private static int cantidadAlumnos = 0;
    private static int cantidadApoyo = 0;
    public static int cantidadDocentes = 0;
    private static List<Usuario> usuarios;

    /**
     * Constructor de la clase Usuario
     * 
     * @param id   Identificador del usuario
     * @param nom  Nombre del usuario
     * @param ape  Apellido del usuario
     * @param fNac Fecha de nacimiento del usuario
     * @param tipo TipoUsuario asociado al usuario (Docente o Alumno)
     */
    public Usuario(int id, String nom, String ape, Date fNac, TipoUsuario tipo) {
        this.idUsuario = id;
        this.nombre = nom;
        this.apellido = ape;
        this.fechaNacimiento = fNac;
        this.tipoUsuario = tipo;

        if (tipo.getTipoUsuarioId().equals("DOCE")) {
            this.cantidadDocentes += 1;
        } else if (tipo.getTipoUsuarioId().equals("ALUM")) {
            this.cantidadAlumnos++;
        }

        this.cantidadUsuarios += 1;
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

    public void setTipoUsuario(TipoUsuario tipoUsuarioNuevo) {

        // this.CambioTipoUsuario(tipoUsuarioNuevo, this.tipoUsuario);
        CambioTipoUsuario(tipoUsuarioNuevo, true, true);
        CambioTipoUsuario(this.tipoUsuario, false, false);

        System.out.println("Nuevo : " + tipoUsuarioNuevo.getTipoUsuarioDescripcion() + " - "
                + tipoUsuarioNuevo.getTipoUsuarioId());
        System.out.println("Actual : " + this.getTipoUsuario().getTipoUsuarioDescripcion() + " - "
                + this.getTipoUsuario().getTipoUsuarioId());

        this.tipoUsuario = tipoUsuarioNuevo;

    }

    private void CambioTipoUsuario(TipoUsuario tipoUsuario, boolean sumar, boolean notificar) {

        switch (tipoUsuario.getTipoUsuarioId()) {
            case "DOCE":
                if (sumar) {
                    this.cantidadDocentes++;
                } else {
                    this.cantidadDocentes--;
                }
                break;
            case "ALUM":
                if (sumar) {
                    this.cantidadAlumnos++;
                } else {
                    this.cantidadAlumnos--;
                }
                break;
            case "APOYO":
                if (sumar) {
                    this.cantidadApoyo++;
                } else {
                    this.cantidadApoyo--;
                }
                break;
            default:
                break;
        }

        if (notificar) {
          notificarCambioTipoUsuario(this, this.tipoUsuario, tipoUsuario);
        }
    }

    private void CambioTipoUsuario(TipoUsuario nuevoTipoUsuario, TipoUsuario actualTipoUsuario) {

        switch (nuevoTipoUsuario.getTipoUsuarioId()) {
            case "DOCE":
                this.cantidadDocentes++;
                break;
            case "ALUM":
                this.cantidadAlumnos++;
                break;
            case "APOYO":
                this.cantidadApoyo++;
                break;
            default:
                break;
        }

        switch (actualTipoUsuario.getTipoUsuarioId()) {
            case "DOCE":
                this.cantidadDocentes--;
                break;
            case "ALUM":
                this.cantidadAlumnos--;
                break;
            case "APOYO":
                this.cantidadApoyo--;
                break;
            default:
                break;
        }
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Integer getCantidadUsuarios() {
        return cantidadUsuarios;
    }

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    @Override
    public void notificarCambioTipoUsuario(Usuario usuario, TipoUsuario tipoUsuarioAnterior,
            TipoUsuario tipoUsuarioNuevo) {
        
         System.out.println("Cambio de tipo de usuario: " + tipoUsuario.getTipoUsuarioDescripcion() + " - "
                    + tipoUsuario.getTipoUsuarioId() + " - Usuario " + this.getNombre() + " " + this.getApellido());   
    }

    @Override
    public boolean notificarMigraciondeUsuario(List<Usuario> usuarios, TipoUsuario tipoUsuarioAnterior,
            TipoUsuario tipoUsuarioNuevo) {
        throw new UnsupportedOperationException("Unimplemented method 'notificarMigraciondeUsuario'");
    }
}
