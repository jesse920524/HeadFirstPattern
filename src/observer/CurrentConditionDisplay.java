package observer;

public class CurrentConditionDisplay implements Observer<WeatherEntity> {

    private WeatherEntity mEntity;
    @Override
    public void update(WeatherEntity weatherEntity) {
        mEntity = weatherEntity;
        display();
    }

    public void display(){
        System.out.println("收到新的天气信息: " + mEntity);
    }


}
