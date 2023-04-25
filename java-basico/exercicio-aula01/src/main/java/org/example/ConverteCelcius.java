package org.example;

public class ConverteCelcius {
    public static void converteCelius(double grau) {
        double fahrenheit = (grau * 9/5) + 32;
        double kelvin = (grau + 273.15);
        System.out.println( grau + "Cº " + fahrenheit + "Fº " + kelvin + " K");
    }
}
