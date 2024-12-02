package WeatherApp.WD_ver2_0;

public class StatisticDisplay implements Observer, DisplayElement {

    private float minTemperature = Float.MAX_VALUE;
    private float maxTemperature = Float.MIN_VALUE;
    private float sumTemperature = 0.0f;
    private int num = 0;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        sumTemperature += temp;
        num++;

        if (temp < minTemperature) {
            minTemperature = temp;
        }
        if (temp > maxTemperature) {
            maxTemperature = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
        + (sumTemperature / num) + "/"
        + maxTemperature + "/"
        + minTemperature);
    }
}
