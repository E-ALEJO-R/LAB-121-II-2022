package poo.e2;

public class Supermarket {
    private double ci;
    private String name;
    private String address;
    private int nbrProducts;
    private String[][] products = new String[50][3];



    public double getCi() {
        return ci;
    }

    public void setCi(double ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbrProducts() {
        return nbrProducts;
    }

    public void setNbrProducts(int nbrProducts) {
        this.nbrProducts = nbrProducts;
    }

    public String[][] getProducts() {
        return products;
    }

    public void setProducts(String[][] products) {
        this.products = products;
    }
}
