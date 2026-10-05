package com.inche.demo;

import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inche.demo.clases.Alumno;
import com.inche.demo.clases.Docente;
import com.inche.demo.clases.TipoUsuario;
import com.inche.demo.clases.Usuario;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		// proceso();

		try {

			TipoUsuario administrativo = new TipoUsuario("DOCE", "Docente", false);

			Usuario usuario = new Docente(1, "Juan", "Perez", new Date("19/8/1993"), "Programacion");
			usuario.setNombre("Juan");
			usuario.setApellido("Perez");
			Date fechaNacimiento = new Date("19/8/1993");
			// fechaNacimiento = new Date(1993, 8, 19);
			usuario.setFechaNacimiento(fechaNacimiento);

			System.out.println("Datos Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
			System.out.println("Edad del usuario: " + usuario.getFechaNacimiento() + " - " + usuario.getEdad());
			System.out.println("Cantidad de usuarios: " + usuario.getCantidadUsuarios());
			System.out.println("************************************* ");
			
			
			Usuario usuario2 = new Alumno(2, "Rosa", "Mejia", new Date("31/1/2000"), "CICLO 4");
			usuario2.setNombre("Rosa");
			usuario2.setApellido("Mejia");
			Date fechaNacimiento2 = new Date("31/1/2000");
			// fechaNacimiento = new Date(1993, 8, 19);
			usuario2.setFechaNacimiento(fechaNacimiento2);

			System.out.println("Datos Usuario: " + usuario2.getNombre() + " " + usuario2.getApellido());
			System.out.println("Edad del usuario: " + usuario2.getFechaNacimiento() + " - " + usuario2.getEdad());
			System.out.println("Cantidad de usuarios: " + usuario2.getCantidadUsuarios());

			System.out.println("************************************* ");

		
			Usuario usuario3 = new Alumno(3, "Demo", "Mejia", new Date("31/1/2000"), "CICLO 4");
			
			System.out.println("Datos Usuario: " + usuario3.getNombre() + " " + usuario3.getApellido());
			System.out.println("Edad del usuario: " + usuario3.getFechaNacimiento() + " - " + usuario3.getEdad());
			System.out.println("Cantidad de usuarios: " + usuario3.getCantidadUsuarios());

			System.out.println("************************************* ");

			/*
			 * Ejecutar
			 * Estructuras.ProcesoPublico2();
			 * Proceso.ProcesoProtected();
			 * Proceso.ProcesoPublico();
			 */
		} catch (Exception e) {
			System.out.println("SE HEREDO ERROR " + e.getMessage());
		}
	}

	private static void proceso() {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese su edad: ");

			String textoIngresado = leer.nextLine();

			// PARSEAR -> Convertir el texto ingresado a un número entero
			int edad = Integer.parseInt(textoIngresado);
			Integer edadInteger = 3;

			if (edadInteger == null) {
				System.out.println("La variable edadInteger es nula");
			}

			Integer edadIntegerx = 3;
			Double edadDouble = 3.0;
			Double doubletest;
			Float edadFloat = 3.0f;
			Short tinyInteger = 1;
			Byte edadByte = 1;
			String doubleParseado = Double.toString(edadDouble);
			String floatParseado = Double.toString(edadDouble);
			int doubleParseado2 = Integer.parseInt(floatParseado);

			System.out.printf("Su edad es: %s", edad);
		} catch (NumberFormatException ex) {
			System.out.println("Ocurrió un error 1: " + ex.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrió un error 2: " + e.getMessage());
		} finally {
			System.out.println("Fin del programa");
		}

	}
}
