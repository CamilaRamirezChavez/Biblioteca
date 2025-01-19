package model;

public class Alumno {
    private String DNI;
    private int cod_alum;
    private int nro_lista;
    public String nombres;
    private String email;
    public String telefono;
    private String ubigeo;
    private String apoderado;
    private boolean estado_activo;
    private String fec_nacim;
    private String nacionalidad;
    private String direccion;
    private int año_nacim;

    public void setDNI(String dni) {
        DNI = dni;
    }

    public void setAño_nacim(int año_nacim){
        this.año_nacim = año_nacim;
    }
    // para leer datos "getters"
    public String getDNI() {
        return DNI;
    }

    public  int getAño_nacim() {
        return this.año_nacim; // o simplemente año_nacim
    }

    // Metodos del negocio
    //Obtencion de edad
    public int getEdad() {
        return 2025 - año_nacim;
    }
}
