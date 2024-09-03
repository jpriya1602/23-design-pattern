package Behavioural.observer;

public class PressureDisplay implements Observer{
    private float pressure;
    private WeatherData weatherData;

    public PressureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.add(this);
    }
    @Override
    public void update() {
        pressure = weatherData.getPressure();
        display();
    }

    public void display(){
        System.out.println("current pressure from the weather data: "+  pressure);
    }

}
