package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable<WeatherEntity> {
    private static final String TAG = "WeatherData";

    private List<Observer> observers;

    private WeatherEntity weatherEntity;
    public WeatherData(){
        observers = new ArrayList<>();
        weatherEntity = new WeatherEntity("-20", "10", "20");
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if (observers.contains(observer)) observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :
                observers) {
            observer.update(weatherEntity);
        }
    }

    public void setMeasurements(String temp, String humi, String pres){
        weatherEntity = new WeatherEntity(temp, humi, pres);
        notifyObserver();
    }

}
