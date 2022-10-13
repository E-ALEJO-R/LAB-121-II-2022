package defensa.herencia;

public class LibroDigital extends Libro {
    private String extension;

    public LibroDigital(String autor, String tipo, String titulo, int precio, int nroCapitulos, String extension) {
        super(autor, tipo, titulo, precio, nroCapitulos);
        this.extension = extension;
    }

    public LibroDigital(String autor, String tipo, String titulo, int precio, int nroCapitulos, String[][] capitulos, String extension) {
        super(autor, tipo, titulo, precio, nroCapitulos, capitulos);
        this.extension = extension;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Extensión: " + extension);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
