package adapter;

public class FirstApiAdapter implements WeatherAdapter {
    @Override
    public WeatherData fetchWeather(String city) {
        WeatherApiResponse response = WeatherApiClient1.getWeather(city);
        WeatherData weatherData = new WeatherData();
        weatherData.setCity(response.getLocation());
        weatherData.setTemperature(response.getTemperature());
        weatherData.setDescription(response.getDescription());
        return weatherData;
    }
}
