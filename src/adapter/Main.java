package adapter;

public class Main {
    public static void main(String[] args) {
        WeatherAdapter api1Adapter = new FirstApiAdapter();
        WeatherAdapter api2Adapter = new SecondApiAdapter();

        WeatherData data1 = api1Adapter.fetchWeather("New York");
        WeatherData data2 = api2Adapter.fetchWeather("London");

        displayWeather(data1);
        displayWeather(data2);
    }

    private static void displayWeather(WeatherData weatherData) {
        System.out.println("City: " + weatherData.getCity());
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Description: " + weatherData.getDescription());
    }
}

