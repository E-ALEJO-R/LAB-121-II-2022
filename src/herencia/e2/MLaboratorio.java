package herencia.e2;

public class MLaboratorio extends Materia {
    private int nroAulas;

    public MLaboratorio(String sigla, String nombre, String paralelo, String tipo, String carreraPerteneciente, String modalidad, String nomDocente, int cargaHoraria, int idDocente, int nroAulas) {
        super(sigla, nombre, paralelo, tipo, carreraPerteneciente, modalidad, nomDocente, cargaHoraria, idDocente);
        this.nroAulas = nroAulas;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Número de aulas: " + nroAulas);
    }

    public int getNroAulas() {
        return nroAulas;
    }

    public void setNroAulas(int nroAulas) {
        this.nroAulas = nroAulas;
    }
}
