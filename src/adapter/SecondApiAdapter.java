package adapter;

public class SecondApiAdapter implements WeatherAdapter {
    public WeatherData fetchWeather(String city) {
        WeatherApiResponse response = WeatherApiClient2.getWeather(city);
        WeatherData weatherData = new WeatherData();
        weatherData.setCity(response.getLocation());
        weatherData.setTemperature(response.getTemperature());
        weatherData.setDescription(response.getDescription());
        return weatherData;
    }
}
