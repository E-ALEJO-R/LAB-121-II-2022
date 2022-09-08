package poo.e2;

public class Supermarket {
    private double ci;
    private String name;
    private String address;
    private int nbrProducts;
    private String[][] products = new String[50][3];

    public Supermarket(String name, String address) {
        this.ci = 532;
        this.name = name;
        this.address = address;
        this.nbrProducts = 2;
        this.products[0][0] = "café"; this.products[0][1] = "5"; this.products[0][2] = "10";
        this.products[1][0] = "leche pil"; this.products[1][1] = "15"; this.products[1][2] = "6";
    }

    public void show(){
        System.out.println("ID:            " + ci);
        System.out.println("Super mercado: " + name);
        System.out.println("Dirección:     " + address);
    }

    public Supermarket(double ci, String name, String address) {
        this.ci = ci;
        this.name = name;
        this.address = address;
        this.nbrProducts = 3;
        this.products[0][0] = "café"; this.products[0][1] = "8"; this.products[0][2] = "11";
        this.products[0][0] = "coca cola"; this.products[0][1] = "45"; this.products[0][2] = "12";
        this.products[0][0] = "fanta"; this.products[0][1] = "14"; this.products[0][2] = "9";
    }

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
