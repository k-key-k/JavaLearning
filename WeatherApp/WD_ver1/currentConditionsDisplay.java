package WeatherApp.WD_ver1;

public class currentConditionsDisplay {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display() {
        System.out.println("something");
    }
}
