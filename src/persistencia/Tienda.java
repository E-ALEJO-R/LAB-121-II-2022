package persistencia;

public class Tienda {
    private int nit;
    private String nombre;
    private String direcion;

    public Tienda(int nit, String nombre, String direcion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direcion = direcion;
    }

    public Tienda() {
    }

    public void mostrar() {
        System.out.println("nit: " + nit);
        System.out.println("nombre: " + nombre);
        System.out.println("dirección: " + direcion);
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
}
