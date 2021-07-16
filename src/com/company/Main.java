package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(0, 6);

        calcFeetAndInchesToCentimeters(16);

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || ((inches < 0) || (inches > 12))) {

            System.out.println("Invalid feet or inches parameters!");
            return -1;

        }

        double feetToCentimeters = (feet * 12) * 2.54;
        double inchesToCentimeters = inches * 2.54d;
        double totalCentimeters = feetToCentimeters + inchesToCentimeters;
        System.out.println(feet + " feet, " + inches + " inches = " + totalCentimeters + " cm");
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        } else {
            int inchesToFeet = (int) inches / 12;
            int inchesToInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(inchesToFeet, inchesToInches);
        }

    }
}
