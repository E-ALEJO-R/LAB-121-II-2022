package herencia.e1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Curso {
    protected int id;
    protected String nomDirector;
    protected String numDistrito;
    protected String ciudad;
    protected int numEstudiantes;
    protected String[][] estudiantes = new String[3][50];
    protected String nomProfesor;
    protected int ciProfesor;

    public Curso(
            int id, String nomDirector, String numDistrito,
            String ciudad, int numEstudiantes, String nomProfesor, int ciProfesor
    ) {
        this.id = id;
        this.nomDirector = nomDirector;
        this.numDistrito = numDistrito;
        this.ciudad = ciudad;
        this.numEstudiantes = numEstudiantes;
        this.nomProfesor = nomProfesor;
        this.ciProfesor = ciProfesor;

    }

    public boolean xEstudiante(int ci) {
        for (int i = 0; i < this.numEstudiantes; i++) {
            if (this.estudiantes[i][2] != null) {
                if (this.ciudad.equalsIgnoreCase("Santa Cruz")) {
                    //System.out.println("hola "  + Integer.parseInt(this.estudiantes[i][1]));
                    if (Integer.parseInt(this.estudiantes[i][1]) == ci) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void agregarKEstudiantes(Curso curso, String[][] estudiantes) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }

    public String getNumDistrito() {
        return numDistrito;
    }

    public void setNumDistrito(String numDistrito) {
        this.numDistrito = numDistrito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public String[][] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[][] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNomProfesor() {
        return nomProfesor;
    }

    public void setNomProfesor(String nomProfesor) {
        this.nomProfesor = nomProfesor;
    }

    public int getCiProfesor() {
        return ciProfesor;
    }

    public void setCiProfesor(int ciProfesor) {
        this.ciProfesor = ciProfesor;
    }
}
