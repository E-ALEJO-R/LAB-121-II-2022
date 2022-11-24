package persistencia;

import persistencia.file.ArchivoTiendaDulce;

public class Main {
    public static void main(String[] args) {
        TiendaDulce tiendaDulce = new TiendaDulce(123, "fir", "av. contanera", 2, "aps");
        tiendaDulce.setDulce(new Dulce("menta", 1, 1));
        tiendaDulce.setDulce(new Dulce("vainilla", 5, 2));

        ArchivoTiendaDulce archivoTiendaBebida = new ArchivoTiendaDulce("data.txt");
        archivoTiendaBebida.alta(tiendaDulce);
        archivoTiendaBebida.listar();
    }
}
