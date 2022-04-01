package RomanNumerals;

import java.util.Scanner;

public class RomanNumeralConverter {

    //The RomanNumeralConverter scanner
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int decimal;
        String numeral;

        System.out.print("Enter a Roman Numeral: ");
        numeral = scan.nextLine();

        RomanNumerals.Roman roman = new RomanNumerals.Roman(numeral);

        // Call method in Roman.java to convert Roman Numeral input to decimal value
        decimal = roman.romanToDecimal();

        //Display user's Roman Numeral input and its decimal value
        System.out.println("Decimal value of " + numeral.toUpperCase() + " is " + decimal);

    }

}