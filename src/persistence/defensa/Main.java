package persistence.defensa;

import persistence.defensa.archivos.ArchivoRanking;

public class Main {
    public static void main(String[] args) {
        Canal atb = new Canal("ATB", new int[]{54, 76, 23, 87, 45});
        Canal rtp = new Canal("RTP", new int[]{67, 97, 79, 56, 74});
        Canal unitel = new Canal("UNITEL", new int[]{34, 65, 34, 37, 96});
        Canal ctv = new Canal("CTV", new int[]{76, 53, 85, 68, 67});
        Canal pat = new Canal("PAT", new int[]{87, 65, 34, 68, 75});

        ArchivoRanking archivo = new ArchivoRanking("ranking.txt");
        archivo.crear();
        archivo.adicionar(atb);
        archivo.adicionar(rtp);
        archivo.adicionar(unitel);
        archivo.adicionar(ctv);
        archivo.adicionar(pat);
        archivo.listar();

        archivo.canalMasAprob();
        // para no duplicar los canales
        archivo.eliminar();
    }
}
