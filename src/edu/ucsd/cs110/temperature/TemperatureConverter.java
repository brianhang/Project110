package edu.ucsd.cs110.temperature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by brian on 2/15/17.
 */
public class TemperatureConverter {
    public static void main(String args[]) throws IOException {
        String input = null;
        Temperature inputTemp, outputTemp;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nAvailable units: C, F");
            System.out.print("Enter temperature to convert (i.e. 36.8 C, 451 F): ");

            if ((input = reader.readLine()) == null) {
                System.exit(0);
            }

            String[] tempIn = input.split(" ");
            float tempValue = Float.parseFloat(tempIn[0]);

            switch (tempIn[1].toLowerCase().charAt(0)) {
                case 'c':
                    inputTemp = new Celsius(tempValue);
                    break;
                case 'f':
                    inputTemp = new Fahrenheit(tempValue);
                    break;
                default:
                    System.out.println("Invalid entry!!\n\n");
                    continue;
            }

            System.out.print("Enter the unit to convert TO: ");

            if ((input = reader.readLine()) == null) {
                System.exit(0);
            }

            switch (input.toLowerCase().charAt(0)) {
                case 'c':
                    outputTemp = inputTemp.toCelcius();
                    break;
                case 'f':
                    outputTemp = inputTemp.toFahrenheit();
                    break;
                default:
                    System.out.println("Invalid entry!!\n\n");
                    continue;
            }

            System.out.println("\n The converted temperature is " + outputTemp.toString() + "\n\n");
        }
    }
}