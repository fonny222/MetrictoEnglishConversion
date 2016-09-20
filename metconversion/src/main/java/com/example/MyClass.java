package com.example;

public class MyClass {

    public static void main (String[] args)
    {
        //variable and constant declarations
        // the conversion variables is how many times 1 of the metric
        // units goes into the american units

        final  int Meter = 28;
        double Feet = 0;
        final double feetConversion = 3.280839895;

        final int Kilometer = 168;
        double Mile = 0;
        final double mileConversion = 0.621371192;

        final int Centimeter = 47;
        double Inches = 0;
        final double inchConversion = 0.393700787;

        final int KPH = 27;
        double FPS = 0;
        final double fpsConversion = .911344415;

        final int Liters = 92;
        double Gallons = 0;
        final double gallonConversion = 0.264172052;

        final int Kilograms = 200;
        double Pounds = 0;
        final double poundConversion = 2.204622622;


        // convert metric to american units
        Feet = Meter * feetConversion;
        Mile = Kilometer * mileConversion;
        Inches = Centimeter * inchConversion;
        FPS = KPH * fpsConversion;
        Gallons = Liters * gallonConversion;
        Pounds = Kilograms * poundConversion;


        // print out the results

        System.out.println();
        System.out.println(Meter+ " Meters is equal to: " +Feet+" Feet.");
        System.out.println(Kilometer+ " Kilometers is equal to: " +Mile+ " Miles.");
        System.out.println(Centimeter+ " Centimeters is equal to: " +Inches+ " Inches.");
        System.out.println(KPH+ " Kilometers per hour is equal to: "+FPS+ " Feet per second.");
        System.out.println(Liters+ " Liters is equal to: "+Gallons+ " Gallons.");
        System.out.println(Kilograms+ " Kilograms is equal to: "+Pounds+ " Pounds");

    }

}
