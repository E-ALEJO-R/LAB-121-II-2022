package poo.e2;

/**
 * @author edgar
 */
public class Main {
    public static void main(String[] args) {
        // a)
        Supermarket supermarket1 = new Supermarket(865, "Ekko Fidalga", "Av. Cañoto 202");
        Supermarket supermarket2 = new Supermarket("Makro Parque","Av. Cuarto Anillo y 3");

        System.out.println("\nb) Mostrar los dos supermercados.");
        supermarket1.show();
        supermarket2.show();

        System.out.println("\nc) Mostrar el supermercado con más stock disponible del producto de nombre X.");
        System.out.println("El supermercado con más stock del producto café es: " + supermarket1.moreStock(supermarket2, "café"));
    }
}
