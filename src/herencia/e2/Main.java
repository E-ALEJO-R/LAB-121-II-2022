package herencia.e2;

public class Main {
    public static void main(String[] args) {
        MLaboratorio[] mLaboratorios = new MLaboratorio[2];
        mLaboratorios[0] = new MLaboratorio(
                "LAB121", "Laboratorio de INF-121", "A"
                , "Presencial", "Informática", "Presencial",
                "Alan Brito", 90, 123,
                145, 50, "inf-111"
        );
        mLaboratorios[1] = new MLaboratorio(
                "LAB121", "Laboratorio de INF-121", "A"
                , "Presencial", "Informática", "Presencial",
                "Alan Brito", 90, 123,
                145, 50, "inf-111"
        );
        print(mLaboratorios);


        MCatedra[] mCatedras = new MCatedra[3];
        mCatedras[0] = new MCatedra(
                "LAB121", "Laboratorio de INF-121", "A"
                , "Troncal", "Informática", "Presencial",
                "Alan Brito", 90, 123, 145
        );
        mCatedras[1] = new MCatedra(
                "LAB121", "Laboratorio de INF-121", "A"
                , "Troncal", "Informática", "Presencial",
                "Alan Brito", 90, 123, 145
        );
        mCatedras[2] = new MCatedra(
                "LAB121", "Laboratorio de INF-121", "A"
                , "Troncal", "Informática", "Presencial",
                "Alan Brito", 90, 123, 145
        );
        print(mCatedras);
    }

    public static void print(Materia[] materias) {
        for (Materia materia : materias) {
            materia.mostrar();
            System.out.println();
        }
    }
}
