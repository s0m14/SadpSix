package decorator;

public class BasicCar implements Car {
    private String description;
    private double price;
    public BasicCar(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}