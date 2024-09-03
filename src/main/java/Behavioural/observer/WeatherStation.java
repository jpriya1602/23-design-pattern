package Behavioural.observer;

public class WeatherStation {
    /**
     * 2 variations of observer pattern
     * 1. pass the parameters in the update method of the observer (when each observer wants different data)
     * 2. pass the whole object to the observer
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);



        weatherData.setData(100.0f,23.01f, 34.09f);
    }
}
