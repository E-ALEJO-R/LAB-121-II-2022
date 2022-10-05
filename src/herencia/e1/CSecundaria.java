package herencia.e1;

public class CSecundaria extends Curso {
    private char paralelo;
    private String nomMateria;

    public CSecundaria(int id, String nomDirector, String numDistrito, String ciudad, int numEstudiantes, String nomProfesor, int ciProfesor) {
        super(id, nomDirector, numDistrito, ciudad, numEstudiantes, nomProfesor, ciProfesor);
    }

    public CSecundaria(int id, String nomDirector, String numDistrito, String ciudad, int numEstudiantes, String nomProfesor, int ciProfesor, char paralelo, String nomMateria) {
        super(id, nomDirector, numDistrito, ciudad, numEstudiantes, nomProfesor, ciProfesor);
        this.paralelo = paralelo;
        this.nomMateria = nomMateria;
    }

    public void mayorEdad(CPreparatoria preparatoria) {
        if (contar(this) > contar(preparatoria)) {
            System.out.println("curso secundaria tiene mayor cantidad de estudiantes mayores");
        } else if (contar(preparatoria) > contar(this)) {
            System.out.println("curso preparatoria tiene mayor cantidad de estudiantes mayores");
        } else {
            System.out.println("ambos cursos tienen la misma cantidad de estudiantes mayores");
        }
    }

    private int contar(Curso curso) {
        int contador = 0;
        for (int i = 0; i < curso.numEstudiantes; i++) {
            if (curso.estudiantes[i][2] != null){
                int edad = Integer.parseInt(curso.estudiantes[i][2]);
                if (edad >= 18) {
                    contador++;
                }
            }
            //System.out.println("hola " + curso.estudiantes[i][2]);
        }
        return contador;
    }

    public char getParalelo() {
        return paralelo;
    }

    public void setParalelo(char paralelo) {
        this.paralelo = paralelo;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }
}
