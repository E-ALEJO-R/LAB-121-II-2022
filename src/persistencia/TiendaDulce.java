package persistencia;

public class TiendaDulce extends Tienda {
    private int nroDulces;
    private Dulce[] dulces = new Dulce[50];
    private String marca;

    public TiendaDulce(int nit, String nombre, String direcion, int nroDulces, Dulce[] dulces, String marca) {
        super(nit, nombre, direcion);
        this.nroDulces = nroDulces;
        this.dulces = dulces;
        this.marca = marca;
    }

    public TiendaDulce() {
        super();
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

    public void setDulces(Dulce[] dulces) {
        this.dulces = dulces;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
