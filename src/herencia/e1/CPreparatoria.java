package herencia.e1;

public class CPreparatoria extends Curso{
    private String modulo;
    private String especialidad;

    public CPreparatoria(int id, String nomDirector, String numDistrito, String ciudad, int numEstudiantes, String nomProfesor, int ciProfesor) {
        super(id, nomDirector, numDistrito, ciudad, numEstudiantes, nomProfesor, ciProfesor);
    }

    public CPreparatoria(int id, String nomDirector, String numDistrito, String ciudad, int numEstudiantes, String nomProfesor, int ciProfesor, String modulo, String especialidad) {
        super(id, nomDirector, numDistrito, ciudad, numEstudiantes, nomProfesor, ciProfesor);
        this.modulo = modulo;
        this.especialidad = especialidad;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
