package adapter;

public class WeatherApiClient2 {
    public static WeatherApiResponse getWeather(String city) {
        WeatherApiResponse response = new WeatherApiResponse();
        response.setLocation(city);
        response.setTemperature(20.0);
        response.setDescription("Cloudy");
        return response;
    }
}
