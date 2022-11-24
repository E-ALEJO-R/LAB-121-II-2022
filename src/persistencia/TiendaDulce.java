package persistencia;

import java.io.Serializable;

public class TiendaDulce extends Tienda implements Serializable {
    private int nroDulces;
    private Dulce[] dulces;
    private String marca;

    public TiendaDulce(int nit, String nombre, String direcion, int nroDulces, String marca) {
        super(nit, nombre, direcion);
        this.nroDulces = nroDulces;
        this.dulces = new Dulce[this.nroDulces];
        this.marca = marca;
    }

    public void mostrar(){
        System.out.println("\n----------------Tienda dulce----------------");
        System.out.println("marca: " + marca);
        System.out.println("cantidad de dulces: " + nroDulces);
        System.out.println("----------------------------------------------");
        for (int i = 0; i < nroDulces; i++) {
            if (dulces[i] != null){
                dulces[i].mostrar();
            }
        }
        System.out.println("----------------------------------------------");
    }

    public TiendaDulce() {
        super();
        this.dulces = new Dulce[50];
    }

    public int getNroDulces() {
        return nroDulces;
    }

    public void setNroDulces(int nroDulces) {
        this.nroDulces = nroDulces;
    }

    public Dulce[] getDulces() {
        return dulces;
    }

    public void setDulce(Dulce dulce) {
        for (int i = 0; i < nroDulces; i++) {
            if (this.dulces[i] == null){
                this.dulces[i] = dulce;
                break;
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
