package persistence.defensa;

import java.io.Serializable;

public class Canal implements Serializable {
    private String canal;
    private int[] aprob;

    public Canal(String canal, int[] aprob) {
        this.aprob = aprob;
        this.canal = canal;
    }

    public float mayor51() {
        float sum = 0;
        for (int j : aprob) {
            sum = sum + j;
        }
        return  (sum * 100) / 500;
    }

    public void mostrar() {
        System.out.println("\ncanal: " + canal);
        System.out.println("----- aprobaciones -----");
        for (int i = 0; i < aprob.length; i++) {
            System.out.println("Dpto[" + (i + 1) + "] " + aprob[i]);
        }
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int[] getAprob() {
        return aprob;
    }

    public void setAprob(int[] aprob) {
        this.aprob = aprob;
    }
}
