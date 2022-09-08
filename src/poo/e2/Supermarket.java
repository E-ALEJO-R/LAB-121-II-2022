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
        this.products[0][0] = "café";
        this.products[0][1] = "5";
        this.products[0][2] = "10";
        this.products[1][0] = "leche pil";
        this.products[1][1] = "15";
        this.products[1][2] = "6";
    }

    public void show() {
        System.out.println("\nID:            " + ci);
        System.out.println("Super mercado: " + name);
        System.out.println("Dirección:     " + address);
        System.out.println("--------------------productos--------------------");
        for (int i = 0; i < nbrProducts; i++) {
            System.out.println("producto: " + products[i][0] + "  stock: " + products[i][1] + "  precio: " + products[i][2]);
        }
    }

    public Supermarket(double ci, String name, String address) {
        this.ci = ci;
        this.name = name;
        this.address = address;
        this.nbrProducts = 3;
        this.products[0][0] = "café";
        this.products[0][1] = "8";
        this.products[0][2] = "11";
        this.products[1][0] = "coca cola";
        this.products[1][1] = "45";
        this.products[1][2] = "12";
        this.products[2][0] = "fanta";
        this.products[2][1] = "14";
        this.products[2][2] = "9";
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

    /**
     * c) Mostrar el supermercado con más stock disponible del producto de nombre X.
     * @param supermarket supermercado.
     * @param product     nombre del producto X.
     */
    public String moreStock(Supermarket supermarket, String product) {
        for (int i = 0; i < this.nbrProducts; i++) {
            if (this.products[i][0].equalsIgnoreCase(product)) {
                for (int j = 0; j < supermarket.nbrProducts; j++) {
                    if (supermarket.products[j][0].equalsIgnoreCase(product)) {
                        if (Integer.parseInt(this.products[i][1]) > Integer.parseInt(supermarket.products[i][1])) {
                            return this.name;
                        } else if (Integer.parseInt(supermarket.products[i][1]) > Integer.parseInt(this.products[i][1])) {
                            return supermarket.name;
                        } else {
                            return "Los dos supermercados tienen la misma cantidad de sock";
                        }
                    }
                }
            } else {
                return this.name;
            }
        }
        return "El producto no existe";
    }
}
