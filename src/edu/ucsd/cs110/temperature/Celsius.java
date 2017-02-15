package edu.ucsd.cs110.temperature;

/**
 * Created by brian on 2/15/17.
 */
public class Celsius extends Temperature {
    public Celsius(float newValue) {
        super(newValue);
    }

    public Temperature toCelcius() {
        return new Celsius(getValue());
    }

    public Temperature toFahrenheit() {
        return new Fahrenheit((getValue() * 1.8f) + 32.0f);
    }

    @Override
    public String toString() {
        return getValue() + " C";
    }
}
