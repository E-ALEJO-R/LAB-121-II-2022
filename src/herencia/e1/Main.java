package herencia.e1;

public class Main {
    public static void main(String[] args) {
        String[][] estudiantes1 = new String[3][50];
        estudiantes1[0][0] = "José";estudiantes1[0][1] = "215"; estudiantes1[0][2] = "20";
        estudiantes1[1][0] = "Alán";estudiantes1[1][1] = "238"; estudiantes1[1][2] = "19";
        estudiantes1[2][0] = "Gustavo";estudiantes1[2][1] = "458"; estudiantes1[2][2] = "15";

        CSecundaria a = new CSecundaria(34, "tapia", "32", "La Paz",
                3, "12", 45625, 'F', ""
        );
        a.setEstudiantes(estudiantes1);


        String[][] estudiantes2 = new String[3][50];
        estudiantes2[0][0] = "José";estudiantes2[0][1] = "215"; estudiantes2[0][2] = "20";
        estudiantes2[1][0] = "Alán";estudiantes2[1][1] = "238"; estudiantes2[1][2] = "14";
        CPreparatoria B = new CPreparatoria(
                34, "tapia", "32", "Santa Cruz",
                3, "12", 45625, "MODULO", "ESPECIALIDAD"
        );
        B.setEstudiantes(estudiantes2);

        System.out.println("\nb)");
        a.mayorEdad(B);

        System.out.println("\nc)");
        if (B.xEstudiante(215)){
            System.out.println(" El estudiante con ci 215 se encuentra cursando en la ciudad de Santa Cruz.");
        }else {
            System.out.println("EL estudiante con ci 215 no se encuentra cursando en la ciudad de Santa Cruz.");
        }

    }
}
