package edu.ucsd.cs110.temperature;

/**
 * Created by brian on 2/15/17.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float newValue) {
        super(newValue);
    }

    public Temperature toCelcius() {
        return new Celsius((getValue() - 32.0f) * (5.0f / 9.0f));
    }

    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue());
    }

    @Override
    public String toString() {
        return getValue() + " F";
    }
}
