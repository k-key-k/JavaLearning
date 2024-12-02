package WeatherApp.WD_ver1;

public class WeatherData {
    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay currentConditionsDisplay = new currentConditionsDisplay();
        currentConditionsDisplay.update(temp,humidity,pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
    }
    public float getTemperature(){
        return 1;
    }
    public float getHumidity(){
        return 1;
    }

    public float getPressure(){
        return 1;
    }

}
