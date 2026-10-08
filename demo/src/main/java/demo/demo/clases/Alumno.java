package demo.demo.clases;

import java.util.Date;

public class Alumno extends Usuario {

    private String cicloAcademico;

    TipoUsuario alumno = new TipoUsuario("ALUM", "Alumno", true);

    public Alumno(int id, String nom, String ape, Date fNac, String cicloAcademico) {
        super(id, nom, ape, fNac);
        super.setTipoUsuario(alumno);
        this.cicloAcademico = cicloAcademico;
    }

    public String getCicloAcademico() {
        return cicloAcademico;
    }
}