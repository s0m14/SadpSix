package adapter;

public class WeatherData {
    private String city;
    private double temperature;
    private String description;

    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }
}
