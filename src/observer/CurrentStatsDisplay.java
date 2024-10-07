package observer;

public class CurrentStatsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentStatsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        // TODO Auto-generated method stub
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.print("Current Conditions : ");
        System.out.print(" Temperature: " + temperature);
        System.out.print(" Humidity: " + humidity);
        System.out.println(" Pressure: " + pressure);
    }

    void registerForUpdates(){
        weatherData.registerObserver(this);
    }
    
}
