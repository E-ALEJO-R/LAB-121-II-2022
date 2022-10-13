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
                100, 4, capLibFis, 50
        );

        String[][] capsLibDig = {
                {},
                {},
                {}
        };
        LibroDigital libroDigital = new LibroDigital(
                "José Jimenez Murillo", "tipo", "Matemáticas para la computación",
                200, 3, capsLibDig, ".pdf"
        );
    }
}
