package controller;

import model.Alumno;

public class TestAlumno {
    public static void main(String[] args) {
        // Uso o llamada de la clase alumno
        Alumno a1;  // Declaracion del objeto a1
                    // Alumno es la clase o tipo de dato
                    // a1 es el objeto o instancia de la clase Alumno
        a1 = new Alumno(); // Inicializacion del objeto, listo para usarse

        // Llenado de datos
        a1.nombres = "Ana Maria"; // se pone la caracteristica "Ana Maria"
        a1.telefono = "987654321";
        a1.setDNI ("12345678");
        a1.setAño_nacim(2000);

        // Uso y muestra de datos
        System.out.println("Nombres = " + a1.nombres);
        System.out.println("Telefono = " + a1.telefono);
        System.out.println("DNI = " + a1.getDNI());
        System.out.println("Año nacimiento = " + a1.getAño_nacim());
        System.out.println("Edad actual = " + a1.getEdad());
    }
}
