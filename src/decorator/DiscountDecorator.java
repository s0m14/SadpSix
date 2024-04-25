package decorator;

public class DiscountDecorator implements Car{
    private Car car;
    private double discount;

    public DiscountDecorator(Car car, double discount) {
        this.car = car;
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with discount";
    }

    @Override
    public double getPrice() {
        return car.getPrice() * (1 - discount);
    }
}
