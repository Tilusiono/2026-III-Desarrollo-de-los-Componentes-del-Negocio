package com.inche.demo.clases;

public class TipoUsuario {

    //BASE DATOS
    private String TipoUsuarioId; //ID

    private String TipoUsuarioDescripcion;

    private boolean TipoUsuarioEstado = true;

    //CONSTRUCTOR
    public TipoUsuario(String Id, String descripcion, boolean TipoUsuarioEstado) {
        TipoUsuarioId = Id;
        TipoUsuarioDescripcion = descripcion;
        this.TipoUsuarioEstado = TipoUsuarioEstado;
    }

    public TipoUsuario(String Id, String descripcion) {
        TipoUsuarioId = Id;
        TipoUsuarioDescripcion = descripcion;
        //this.TipoUsuarioEstado = true;
    }


    public String getTipoUsuarioId() {
        return TipoUsuarioId;
    }
    public String getTipoUsuarioDescripcion() {
        return TipoUsuarioDescripcion;
    }
    public boolean isTipoUsuarioEstado() {
        return TipoUsuarioEstado;
    }
}
