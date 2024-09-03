package Behavioural.observer;

public class TemperatureDisplay implements Observer {
    private float temperature;
    private WeatherData weatherData;

    TemperatureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.add(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        display();
    }

    private void display(){
        System.out.println("current temperature from weather station" + temperature);
    }
}
