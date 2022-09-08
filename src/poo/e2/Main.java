package poo.e2;

/**
 * @author edgar
 */
public class Main {
    public static void main(String[] args) {
        // a)
        Supermarket supermarket1 = new Supermarket(865, "Ekko Fidalga", "Av. Cañoto 202");
        Supermarket supermarket2 = new Supermarket("Makro Parque","Av. Cuarto Anillo y 3");
        // b)
        supermarket1.show();
        supermarket2.show();
    }
}
