package controller;
import model.Biblioteca;
public class TestBiblioteca {
    private static String frase = "Tenga buen dia ya ha sido regitrado!!!";
    public static void main(String[] args) {
        Biblioteca libros1 = new Biblioteca("programacion", 5);

        libros1.setNombre("Juan Gutierres");
        System.out.println("Persona que alquila los libros = " + libros1.getNombre());

        System.out.println("Datos ");
        libros1.MostrarDatos();

        libros1.setCantidad_libros(21);
        System.out.println("cantidad de libros = " + libros1.getCantidad_libros() + " libros");

        System.out.println(frase);

    }
}
