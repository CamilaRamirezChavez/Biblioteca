package model;

public class Biblioteca {
    private int cantidad_libros;
    private String nombre;
    String area;
    int dias;

    public Biblioteca(String area, int dias) {
        this.area = area;
        this.dias = dias;
    }

    public void MostrarDatos() {
        System.out.println("area = " + area);
        System.out.println("dias de pestramo = " + dias + " dias");
    }

    public void setCantidad_libros(int cantidad_libros) {
        this.cantidad_libros = cantidad_libros;
    }

    public int getCantidad_libros(){
        return cantidad_libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
