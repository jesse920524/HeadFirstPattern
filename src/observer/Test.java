package observer;

public class Test {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();

        weatherData.register(currentConditionDisplay);

        weatherData.setMeasurements("1", "2", "3");
        weatherData.setMeasurements("5", "4", "3");
    }
}
