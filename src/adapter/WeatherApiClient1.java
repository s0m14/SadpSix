package adapter;

public class WeatherApiClient1 {
    public static WeatherApiResponse getWeather(String city) {
        WeatherApiResponse response = new WeatherApiResponse();
        response.setLocation(city);
        response.setTemperature(25.0);
        response.setDescription("Sunny");
        return response;
    }
}
