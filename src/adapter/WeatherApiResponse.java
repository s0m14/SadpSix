package adapter;

public class WeatherApiResponse {
    private String location;
    private double temperature;
    private String description;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getLocation() {
        return location;
    }
}
