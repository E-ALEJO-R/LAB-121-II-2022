package patterns.creational.factoryMethod.product;

public class Triangle extends Figure {

    public Triangle(String description) {
        super(description);
    }

    @Override
    public double area() {
        return 0;
    }
}
