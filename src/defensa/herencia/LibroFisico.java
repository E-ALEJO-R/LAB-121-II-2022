package defensa.herencia;

public class LibroFisico extends Libro {
    private int tamanio;

    public LibroFisico(String autor, String tipo, String titulo, int precio, int nroCapitulos, int tamanio) {
        super(autor, tipo, titulo, precio, nroCapitulos);
        this.tamanio = tamanio;
    }

    public LibroFisico(String autor, String tipo, String titulo, int precio, int nroCapitulos, String[][] capitulos, int tamanio) {
        super(autor, tipo, titulo, precio, nroCapitulos, capitulos);
        this.tamanio = tamanio;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Tamaño: " + tamanio);
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
