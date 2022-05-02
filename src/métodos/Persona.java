
package métodos;

public class Persona {
    
    private int identificacion;
    private String nombres;
    private int teléfono;
    private String direccion;

    public Persona(int identificacion, String nombres, int teléfono, String direccion) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.teléfono = teléfono;
        this.direccion = direccion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
