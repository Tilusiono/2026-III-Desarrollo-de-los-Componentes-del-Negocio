package com.inche.demo.clase1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estructuras {

    private static void ProcesoPrivado2() {
        System.out.println("Proceso privado ejecutado");
    }

    protected static void ProcesoProtected2() {
        System.out.println("Proceso protected ejecutado");
    }

    public static void ProcesoPublico2() throws Exception {

    
       /* 
        boolean resultado = false;
        // proceso

        if(resultado==false){
            throw new Exception("LST023 -No se proceso correctamente");
        }
      */

        // IF SIMPLE
        /*
         * if(edad >=18 ){
         * System.out.printf("Usted es mayor de edad, su edad es: %s" +
         * "y su DNI es: %s", edad, textoDNI);
         * }else{
         * System.out.printf("Usted es menor de edad, su edad es: %s" +
         * "y su DNI es: %s", edad, textoDNI);
         * }
         */

        // IF TERNARIO
        /*
         * String mensaje = edad >= 18 ? "Usted es mayor de edad" :
         * "Usted es menor de edad";
         * System.out.printf("%s, su edad es: %s y su DNI es: %s", mensaje, edad,
         * textoDNI);
         */
        // IF ANINDADO

        /*
         * String mensajeAnidado ="";
         * if (edad >= 60 && edad < 150) {
         * mensajeAnidado =
         * String.format("Usted es un adulto mayor, su edad es: %s y su DNI es: %s",
         * edad, textoDNI);
         * } else if (edad >= 45 && edad < 60) {
         * mensajeAnidado =
         * String.format("Usted es un adulto, su edad es: %s y su DNI es: %s", edad,
         * textoDNI);
         * } else if (edad >= 25 && edad < 45) {
         * mensajeAnidado =
         * String.format("Usted es un adulto joven, su edad es: %s y su DNI es: %s",
         * edad, textoDNI);
         * } else if (edad >= 18 && edad < 25) {
         * mensajeAnidado =
         * String.format("Usted es un mayor de edad, su edad es: %s y su DNI es: %s",
         * edad, textoDNI);
         * } else if (edad >= 12 && edad < 18) {
         * mensajeAnidado =
         * String.format("Usted es un adolescente, su edad es: %s y su DNI es: %s",
         * edad, textoDNI);
         * } else if (edad > 0 && edad < 12) {
         * mensajeAnidado =
         * String.format("Usted es un niño, su edad es: %s y su DNI es: %s", edad,
         * textoDNI);
         * }
         * 
         * switch (edad) {
         * case 1,2,3,4,5:
         * System.out.println("Usted es bebe");
         * break;
         * case 6,7,8,9,10,12:
         * System.out.println("Usted es un niño");
         * break;
         * case 13,14,15,16,17:
         * System.out.println("Usted es adolescente");
         * break;
         * default:
         * System.out.println("No aplica mayores de edad");
         * }
         * 
         * switch (edad) {
         * case 60,150:
         * //case Integer e when (e >= 60 && e < 150): JAVA +21
         * System.out.printf("Usted es un adulto mayor, su edad es: %s y su DNI es: %s",
         * edad, textoDNI);
         * break;
         * case 6,7,8,9,10,12:
         * System.out.println("Usted es un niño");
         * break;
         * case 13,14,15,16,17:
         * System.out.println("Usted es adolescente");
         * break;
         * default:
         * System.out.println("No aplica mayores de edad");
         * }
         * 
         * if(mensajeAnidado.equals("")) {
         * System.out.println("Numero no valido");
         * }
         */

        /*
         * BLOQUE FOR
         * for (int i = 1; i <= edad; i+=2) {
         * System.out.println("Cumpleaños nro " + i);
         * }
         */

        /*
         * BLOQUE ARRAY
         * ArrayList<String> listaNombres = new ArrayList<>();
         * listaNombres.add("Juan");
         * listaNombres.add("Pedro");
         * listaNombres.add("Maria");
         * 
         * for (String s1 : listaNombres) {
         * System.out.println("Procesar Notas, Nombre: " + s1);
         * }
         * 
         * List<String> listaNombres = new ArrayList<>();
         * listaNombres.add("Juan");
         * listaNombres.add("Pedro");
         * listaNombres.add("Maria");
         * 
         * for (String s1 : listaNombres) {
         * System.out.println("Procesar Notas, Nombre: " + s1);
         * }
          */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        String textoEdad = leer.nextLine();
        System.out.println("Ingrese DNI: ");
        String textoDNI = leer.nextLine();

        int edad = Integer.parseInt(textoEdad.trim());
         int edad2 = Integer.parseInt(textoEdad.trim());
        int anioActual = 2026;

         // 5,4,3,2,1,0, -1
        while (edad > 0) {
             String fecha = String.format("%s/%s/%s", anioActual, 10, 1);
            System.out.printf("WHILE - Fecha de cumpleaños %s en el año: %s", fecha, edad + "\n");
            anioActual--;
            edad--;
        }
        int anioActual2 = 2026;
        //5,4,3,2,1
        do {
            String fecha = String.format("%s/%s/%s", anioActual2, 10, 1);
            System.out.printf("DO WHILE - Fecha de cumpleaños %s en el año: %s", fecha, edad2 + "\n");
            anioActual2--;
            edad2--;
        } while (edad2 > 0);

        
    }
}
