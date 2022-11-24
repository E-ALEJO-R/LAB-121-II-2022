package persistencia;

import java.io.Serializable;

public class Bebida implements Serializable {
    private String marca;
    private String nombre;
    private int precio;
    private int litros;

    public Bebida(String marca, String nombre, int precio, int litros) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.litros = litros;
    }

    public Bebida() {
    }

    public void mostrar() {
        System.out.print("marca: " + marca);
        System.out.print(", nombre: " + nombre);
        System.out.print(", precio: " + precio);
        System.out.println(", litros: " + litros);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}
