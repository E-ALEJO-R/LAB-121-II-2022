package patterns.creational.factoryMethod.product;

public abstract class Figure {
    private String description;

    public Figure(String description) {
        this.description = description;
    }

    abstract double area();
}
