package Nomor6;

public class Temperature {
    private double temperatureInFahrenheit;

    public Temperature(double temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    public void calculateCelsius() {
        double temperatureInCelsius = (temperatureInFahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Suhu dalam Celsius: " + temperatureInCelsius);
    }
    
    public static void main(String[] args) {
        // Tes program dengan suhu dalam Fahrenheit
        Temperature temperature1 = new Temperature(98.6);
        temperature1.calculateCelsius();

        Temperature temperature2 = new Temperature(68);
        temperature2.calculateCelsius();

        Temperature temperature3 = new Temperature(32);
        temperature3.calculateCelsius();
    }
   
}
