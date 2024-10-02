package observer;

public class ForecastDisplay implements Observer{

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // TODO Auto-generated method stub
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.print("Forecast Conditions : ");
        System.out.print(" Temperature: " + temperature);
        System.out.print(" Humidity: " + humidity);
        System.out.println(" Pressure: " + pressure);
    }
    
}
