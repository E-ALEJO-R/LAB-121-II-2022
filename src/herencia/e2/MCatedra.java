package herencia.e2;

public class MCatedra extends Materia {
    private int nroLabo, cantidadCompu;
    private String requerimientos;

    public MCatedra(
            String sigla, String nombre, String paralelo, String tipo, String
            carreraPerteneciente, String modalidad, String nomDocente, int cargaHoraria, int idDocente,
            int nroLabo, int cantidadCompu, String requerimientos
    ) {
        super(sigla, nombre, paralelo, tipo, carreraPerteneciente, modalidad, nomDocente, cargaHoraria, idDocente);
        this.nroLabo = nroLabo;
        this.cantidadCompu = cantidadCompu;
        this.requerimientos = requerimientos;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Número laboratorio: " + nroLabo);
        System.out.println("Cantidad computadoras: " + cantidadCompu);
        System.out.println("Requerimientos: " + requerimientos);
    }

    public int getNroLabo() {
        return nroLabo;
    }

    public void setNroLabo(int nroLabo) {
        this.nroLabo = nroLabo;
    }

    public int getCantidadCompu() {
        return cantidadCompu;
    }

    public void setCantidadCompu(int cantidadCompu) {
        this.cantidadCompu = cantidadCompu;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }
}
