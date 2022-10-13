package defensa.herencia;

public class Libro extends ProduccionIntelectual {
    protected String titulo;
    protected int precio;
    protected int nroCapitulos;
    protected String[][] capitulos = new String[3][50];

    public Libro(String autor, String tipo, String titulo, int precio, int nroCapitulos) {
        super(autor, tipo);
        this.titulo = titulo;
        this.precio = precio;
        this.nroCapitulos = nroCapitulos;
    }

    public Libro(String autor, String tipo, String titulo, int precio, int nroCapitulos, String[][] capitulos) {
        super(autor, tipo);
        this.titulo = titulo;
        this.precio = precio;
        this.nroCapitulos = nroCapitulos;
        this.capitulos = capitulos;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Título: " + titulo);
        System.out.println("Precio: " + precio);
        System.out.println("Número de capítulos: " + nroCapitulos);
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < nroCapitulos; i++) {
            if (capitulos[i][0]!= null){
                System.out.println(
                        "Capítulo->" + capitulos[i][0] +
                                "Imágenes->" + capitulos[i][1] +
                                "Hojas->" + capitulos[i][2]
                );
            }
        }
        System.out.println("------------------------------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNroCapitulos() {
        return nroCapitulos;
    }

    public void setNroCapitulos(int nroCapitulos) {
        this.nroCapitulos = nroCapitulos;
    }

    public String[][] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String[][] capitulos) {
        this.capitulos = capitulos;
    }
}
