package RomanNumerals;

public class Roman {

    /* Decimal values of roman numerals:
       M = 1000 // M Repeats
       D = 500  // Does not repeat
       C = 100  // C Repeats
       L = 50   // Does not repeat
       X = 10   // X Repeats
       V = 5    // Does not repeat
       I = 1    // I Repeats
     */

    private String romanNumeral;
    private int romanNumeralDecimal = 0;

    // Constructor
    // Pass in input Roman Numeral
    public Roman(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    // Return value of romanNumeral variable
    public String getRomanNumeral() {
        return romanNumeral;
    }

    // Return value of the romanNumeral variable
    public void setRomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    // Return value of romanNumeralDecimal
    public int getRomanNumeralDecimal() {
        return romanNumeralDecimal;
    }

    // Set value of romanNumeralDecimal variable
    public void setRomanNumeralDecimal(int romanNumeralDecimal) {
        this.romanNumeralDecimal = romanNumeralDecimal;
    }

    // Convert Roman Numeral input to decimal value
    public int romanToDecimal(){

        // numeralDecimal = decimal value of the Roman Numeral
        // tempNumeral = input Roman Numeral value

        int decimalOut = 0;
        String tempNumeral = getRomanNumeral().toLowerCase();

        /* If the input Roman Numeral starts with CM, set output decimal to itself + 900,
           remove CM from temp string var and drop through remaining validations. */
        if (tempNumeral.startsWith("cm")){
            decimalOut += 900;
            tempNumeral = tempNumeral.replaceAll("cm", "");

         /* ElseIf the input Roman Numeral starts with M, loop through input 3 times and for each
            M found, add 1000. Remove M from temp string var and drop through remaining validations. */
        }else if(tempNumeral.startsWith("m")){
            for (int i = 0; i < 3; i++){
                if(tempNumeral.startsWith("m")){
                    decimalOut += 1000;
                    tempNumeral = tempNumeral.replaceFirst("m", "");
                }
            }
        }

        /* If the input Roman Numeral or remaining part of input Roman Numeral string starts with
           CD, set output decimal to itself + 400, remove CM from temp string var and drop through
           remaining validations. */
        if (tempNumeral.startsWith("cd")){
            decimalOut += 400;
            tempNumeral = tempNumeral.replaceAll("cd", "");

        /* ElseIf the input Roman Numeral or remaining part of input Roman Numeral string starts with D,
           set output decimal to itself + 500. Remove D from temp string var and drop through remaining
           validations. */
        }else if(tempNumeral.startsWith("d")){
            decimalOut += 500;
            tempNumeral = tempNumeral.replaceAll("d", "");
        }

        /* If the input Roman Numeral or remaining part of input Roman Numeral string starts with
           XC, set output decimal to itself + 90, remove XC from temp string var and drop through
           remaining validations. */
        if (tempNumeral.startsWith("xc")){
            decimalOut += 90;
            tempNumeral = tempNumeral.replaceAll("xc", "");

        /* ElseIf the input Roman Numeral or remaining part of input Roman Numeral string starts with C,
           loop through input 3 times and for each C found, add 100. Remove C from temp string var
           and drop through remaining validations. */
        }else if(tempNumeral.startsWith("c")){
            for (int i = 0; i < 3; i++){
                if(tempNumeral.startsWith("c")){
                    decimalOut += 100;
                    tempNumeral = tempNumeral.replaceFirst("c", "");
                }
            }
        }

        /* If the input Roman Numeral or remaining part of input Roman Numeral string starts with
           XL, set output decimal to itself + 40, remove XL from temp string var and drop through
           remaining validations. */
        if (tempNumeral.startsWith("xl")){
            decimalOut += 40;
            tempNumeral = tempNumeral.replaceAll("xl", "");

        /* ElseIf the input Roman Numeral starts with L, set output decimal to itself + 50.
           Remove L from temp string var and drop through remaining validations. */
        }else if(tempNumeral.startsWith("l")){
            decimalOut += 50;
            tempNumeral = tempNumeral.replaceAll("l", "");
        }

        /* If the input Roman Numeral or remaining part of input Roman Numeral string starts with
           IX, set output decimal to itself + 9, remove IX from temp string var and drop through
           remaining validations. */
        if (tempNumeral.startsWith("ix")){
            decimalOut += 9;
            tempNumeral = tempNumeral.replaceAll("ix", "");

        /* ElseIf the input Roman Numeral or remaining part of input Roman Numeral string starts with X,
           loop through input 3 times and for each X found, add 10. Remove X from temp string var and
           drop through remaining validations. */
        }else if(tempNumeral.startsWith("x")){
            for (int i = 0; i < 3; i++){
                if(tempNumeral.startsWith("x")){
                    decimalOut += 10;
                    tempNumeral = tempNumeral.replaceFirst("x", "");
                }
            }
        }

        /* If the input Roman Numeral or remaining part of input Roman Numeral string starts with
           IV, set output decimal to itself + 4. Remove IV from temp string var and drop through
           remaining validations. */
        if (tempNumeral.startsWith("iv")){
            decimalOut += 4;
            tempNumeral = tempNumeral.replaceAll("iv", "");

        /* ElseIf the input Roman Numeral or remaining part of input Roman Numeral string starts with V,
           set output decimal to itself + 5. Remove V from temp string var and drop through remaining
           validation. */
        }else if(tempNumeral.startsWith("v")){
            decimalOut += 5;
            tempNumeral = tempNumeral.replaceAll("v", "");
        }

        /* If the input Roman Numeral starts with I, loop through input 3 times and for each
           X found, add 10. Remove X from temp string var and drop through remaining validations. */
        if(tempNumeral.startsWith("i")){
            for (int i = 0; i < 3; i++){
                if(tempNumeral.startsWith("i")){
                    decimalOut += 1;
                    tempNumeral = tempNumeral.replaceFirst("i", "");
                }
            }
        }

       // Return value decimalOut
        setRomanNumeralDecimal(decimalOut);
        return getRomanNumeralDecimal();
    }

}