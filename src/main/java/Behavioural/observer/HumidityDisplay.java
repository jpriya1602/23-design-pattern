package Behavioural.observer;

public class HumidityDisplay implements Observer{
    private float humidity;
    private WeatherData weatherData;

    public HumidityDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.add(this);
    }
    @Override
    public void update() {
        humidity = weatherData.getHumidity();
        display();
    }

    public void display(){
        System.out.println("Current humidity from weather data is "+humidity);
    }
}
