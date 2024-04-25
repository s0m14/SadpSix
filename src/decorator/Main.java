package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new BasicCar("Toyota Camry", 25000.0);

        // Decorate the car with extra features costing $2000
        car = new ExtraFeaturesDecorator(car, 2000.0);

        // Decorate the car with a discount of 10%
        car = new DiscountDecorator(car, 0.1);

        // Print the final description and price of the car
        System.out.println("Description: " + car.getDescription());
        System.out.println("Price: $" + car.getPrice());
    }
}
