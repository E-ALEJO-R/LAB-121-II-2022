package defensa.herencia;

public class Main {
    public static void main(String[] args) {
        String[][] capLibFis = {
                {"Estructuras fundamentales de datos", "11", "15"},
                {"Pilas y colas", "5", "25"},
                {"Recursión", "6", "19"},
                {"Árboles", "8", "28"},
                {"Gráficas", "25", "40"}
        };
        LibroFisico libroFisico = new LibroFisico(
                "Osvaldo Cairo", "tipo", "Estructura de datos",
                100, 5, capLibFis, 50
        );
        System.out.println("\n+++++++++++++++ LIBRO FÍSICO +++++++++++++++++");
        libroFisico.mostrar();


        String[][] capsLibDig = {
                {"Sistemas numéricos", "5", "9"},
                {"Métodos de conteo", "7", "66"},
                {"Conjuntos", "52", "100"}
        };
        LibroDigital libroDigital = new LibroDigital(
                "José Jimenez Murillo", "tipo", "Matemáticas para la computación",
                200, 3, capsLibDig, ".pdf"
        );
        System.out.println("\n+++++++++++++++ LIBRO DIGITAL +++++++++++++++++");
        libroDigital.mostrar();
    }
}
