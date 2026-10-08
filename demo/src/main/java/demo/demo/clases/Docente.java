package demo.demo.clases;

import java.util.Date;

public class Docente extends Usuario {

    private String especialidad;

    TipoUsuario profesor = new TipoUsuario("DOCE", "Docente");

    public Docente(int id, String nom, String ape, Date fNac, String especialidad) {
        super(id, nom, ape, fNac);
        super.setTipoUsuario(profesor);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public Integer getEdad() {
        return 99999999;
    }
}