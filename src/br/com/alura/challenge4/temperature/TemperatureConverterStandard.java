package br.com.alura.challenge4.temperature;

public class TemperatureConverterStandard implements TemperatureConverter {
    @Override
    public void FahrenheitToCelsius(double temperatureInFahrenheit) {
        System.out.println("Fahrenheit to Celsius is: " +  (temperatureInFahrenheit - 32) * 5 / 9 );
    }

    @Override
    public void CelsiusToFahrenheit(double temperatureInCelsius) {
        System.out.println("Celsius to Fahrenhet is: " +   (temperatureInCelsius * 9 /5) + 32);
    }
}
