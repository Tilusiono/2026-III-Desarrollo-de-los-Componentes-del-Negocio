package demo.demo;

import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.demo.clases.Alumno;
import demo.demo.clases.Docente;
import demo.demo.clases.Usuario;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Usuario usuario1 = new Docente(1, "Juan", "Perez", formato.parse("19/08/1993"), "Programacion");
            mostrar(usuario1);

            Usuario usuario2 = new Alumno(2, "Rosa", "Mejia", formato.parse("31/01/2000"), "CICLO 4");
            mostrar(usuario2);

            Usuario usuario3 = new Alumno(3, "Demo", "Mejia", formato.parse("31/01/2000"), "CICLO 4");
            mostrar(usuario3);

        } catch (Exception e) {
            System.out.println("SE HEREDO ERROR " + e.getMessage());
        }
    }

    private static void mostrar(Usuario usuario) {
        System.out.println("Datos Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("Edad del usuario: " + usuario.getFechaNacimiento() + " - " + usuario.getEdad());
        System.out.println("Cantidad de usuarios: " + usuario.getCantidadUsuarios());
        System.out.println("*************************************");
    }
}