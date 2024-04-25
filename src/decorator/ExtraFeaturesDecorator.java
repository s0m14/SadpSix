package decorator;

public class ExtraFeaturesDecorator implements Car {
    private Car car;
    private double extraCost;

    public ExtraFeaturesDecorator(Car car, double extraCost) {
        this.car = car;
        this.extraCost = extraCost;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with extra features";
    }

    @Override
    public double getPrice() {
        return car.getPrice() + extraCost;
    }
}
