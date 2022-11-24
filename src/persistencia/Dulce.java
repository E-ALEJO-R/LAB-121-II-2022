package persistencia;

public class Dulce {
    private String sabor;
    private int precio;
    private double peso;

    public Dulce(String sabor, int precio, double peso) {
        this.sabor = sabor;
        this.precio = precio;
        this.peso = peso;
    }

    public Dulce() {
    }

    public void mostrar() {
        System.out.println("sabor: " + sabor);
        System.out.println("precio: " + precio);
        System.out.println("peso: " + peso);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
