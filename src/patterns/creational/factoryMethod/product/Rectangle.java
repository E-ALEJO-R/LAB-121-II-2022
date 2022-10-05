package patterns.creational.factoryMethod.product;

public class Rectangle extends Figure {

    public Rectangle(String description) {
        super(description);
    }

    @Override
    public double area() {
        return 0;
    }
}
