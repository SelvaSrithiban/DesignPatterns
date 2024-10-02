package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentStatsDisplay currentStatsDisplay = new CurrentStatsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherData.registerObserver(currentStatsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurements(10.0f, 20.0f, 30.0f);
        weatherData.setMeasurements(21.0f, 31.0f, 41.0f);
        weatherData.removeObserver(currentStatsDisplay);
    }
}
