package edu.ucsd.cs110.temperature;

/**
 * Created by brian on 2/15/17.
 */
public abstract class Temperature {
    private float value;

    public Temperature(float newValue) {
        value = newValue;
    }

    public final float getValue() {
        return value;
    }

    public abstract Temperature toCelcius();
    public abstract Temperature toFahrenheit();
}
