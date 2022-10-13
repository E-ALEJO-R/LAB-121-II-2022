package defensa.herencia;

public class ListaLibro {
    private int nroLibros;
    private String[][] lib = new String[4][50];

    public ListaLibro(int nroLibros, String[][] lib) {
        this.nroLibros = nroLibros;
        this.lib = lib;
    }

    public void mostrar() {
        System.out.println("Número de libros: " + nroLibros);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < nroLibros; i++) {
            if (lib[i][0] != null) {
                System.out.println(
                        "título: " + lib[i][0] +
                                "autor: " + lib[i][1] +
                                "tipo: " + lib[i][2] +
                                "precio: " + lib[i][0]
                );
            }
        }
    }

    public int getNroLibros() {
        return nroLibros;
    }

    public void setNroLibros(int nroLibros) {
        this.nroLibros = nroLibros;
    }

    public String[][] getLib() {
        return lib;
    }

    public void setLib(String[][] lib) {
        this.lib = lib;
    }
}
