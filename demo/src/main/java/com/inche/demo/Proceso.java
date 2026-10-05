package com.inche.demo;

public class Proceso {
    
    private static void ProcesoPrivado() {
        System.out.println("Proceso privado ejecutado");
    }
    protected static void ProcesoProtected() {
        System.out.println("Proceso protected ejecutado");
    }
    public static void ProcesoPublico() {
        
        System.out.println("Proceso público ejecutado");

        Proceso.ProcesoPrivado();
    }
}
