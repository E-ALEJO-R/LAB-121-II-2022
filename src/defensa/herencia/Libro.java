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
            if (capitulos[i][0] != null) {
                System.out.println(
                        "Capítulo->" + capitulos[i][0] +
                                "Imágenes->" + capitulos[i][1] +
                                "Hojas->" + capitulos[i][2]
                );
            }
        }
        System.out.println("------------------------------------------------------");
    }

    /**
     * Para el inciso b) mostrar (título, nombre autor capítulos que empiecen con "A")
     */
    public void capitulosEmpiecenConA(Libro libro) {
        if (contarA(this) > contarA(libro)) {
            System.out.println("Título: " + this.titulo);
            System.out.println("Nombre del autor: " + this.autor);
        } else if (contarA(libro) > contarA(this)) {
            System.out.println("Título: " + libro.titulo);
            System.out.println("Nombre del autor: " + libro.autor);
        } else {
            System.out.println("Los dos libros tienen la misma cantidad de letras A");
        }
    }

    public int contarA(Libro libro) {
        String[][] libros = libro.capitulos;
        int counter = 0;
        for (int i = 0; i < libro.nroCapitulos; i++) {
            String cap = libros[i][0];
            for (int j = 0; j < cap.length(); j++) {
                if (cap.charAt(j) == 'A' || cap.charAt(j) == 'a') {
                    counter++;
                }
            }
        }
        return counter;
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
