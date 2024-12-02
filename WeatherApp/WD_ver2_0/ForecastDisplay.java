package WeatherApp.WD_ver2_0;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 30.0f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather in the way!");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        } else {
            System.out.println("More of the same");
        }
    }
}
