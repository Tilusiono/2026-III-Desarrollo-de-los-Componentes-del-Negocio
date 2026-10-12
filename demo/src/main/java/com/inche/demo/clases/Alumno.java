package com.inche.demo.clases;

import java.util.Date;

public class Alumno extends Usuario {

    private String cicloAcademico;

	static TipoUsuario alumno = new TipoUsuario("ALUM", "Alumno", true);		

    public Alumno(int id, String nom, String ape, Date fNac, 
        String cicloAcademico) {
        super(id, nom, ape, fNac,alumno);
        this.cicloAcademico = cicloAcademico;
    }

    public String getCicloAcademico() {
        return cicloAcademico;
    }
}