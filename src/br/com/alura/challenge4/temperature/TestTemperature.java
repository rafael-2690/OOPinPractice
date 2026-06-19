package br.com.alura.challenge4.temperature;

public class TestTemperature {
    public static void main(String[] args) {
        TemperatureConverterStandard temperatureConverterStandard = new TemperatureConverterStandard();

        temperatureConverterStandard.CelsiusToFahrenheit(10);
        temperatureConverterStandard.FahrenheitToCelsius(10);
    }
}
