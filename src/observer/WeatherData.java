package observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
        System.out.println("Observer is registered");
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.remove(o);
        System.out.println("Observer is unregistered");
    }

    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }

    public void mesurementsChanged(){
        //We might want to do certain things when measurements changed
        System.out.println("Measurements is changed");
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementsChanged();
    }
    
}
