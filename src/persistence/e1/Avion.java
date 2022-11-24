package persistence.e1;

import java.io.Serializable;

public class Avion implements Serializable {
    private String matricula;
    private String origen;
    private String destino;
    private String HoraSalida;
    private String piloto;

    public Avion(String matricula, String origen, String destino, String HoraSalida, String piloto) {
        super();
        this.matricula = matricula;
        this.origen = origen;
        this.destino = destino;
        this.HoraSalida = HoraSalida;
        this.piloto = piloto;

    }

    public Avion() {

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String horaSalida) {
        HoraSalida = horaSalida;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void mostrar() {
        System.out.println("\n\n--------------------------------------");
        System.out.println("matrícula: " + matricula);
        System.out.println("origen: " + origen);
        System.out.println("destino: " + destino);
        System.out.println("hora de salida: " + HoraSalida);
        System.out.println("piloto: " + piloto);
    }
}
