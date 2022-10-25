/*
 *  Created on: 21.10.2022
 *  Author:     Enno Stassny
 *  Task:       Prog_1_5_K_3_1
 */
/**
 * This program shows every possible conversions of all primitive data types
 * Both extending and restricting transformations.
 */
public class Main
{
    // Start of the program
    public static void main(String[] args)
    {
        /* Example for extending transformations
         * byte -> short -> int -> long -> float -> double
         */
        byte   byteValue   =          10;         //implicit conversion
        short  shortValue  =          byteValue;  //implicit conversion
        int    intValue    =          shortValue; //implicit conversion
        long   longValue   =          intValue;   //implicit conversion
        float  floatValue  =          longValue;  //implicit conversion
        double doubleValue =          floatValue; //implicit conversion

        /* Another example for extending transformations
         * char -> int -> long -> float -> double
         */
        char   charValue    =          'a';         //implicit conversion
        int    intValue2    =          charValue;   //implicit conversion
        long   longValue2   =          intValue2;   //implicit conversion
        float  floatValue2  =          longValue2;  //implicit conversion
        double doubleValue2 =          floatValue2; //implicit conversion

        /* Example for restricting transformations
         * double -> float -> long -> int -> short -> byte
         */
        double doubleValue3 =          10.0;                 //implicit conversion
        float  floatValue3  =          (float) doubleValue3; //explicit conversion
        long   longValue3   =          (long)  floatValue3;  //explicit conversion
        int    intValue3    =          (int)   longValue3;   //explicit conversion
        short  shortValue3  =          (short) intValue3;    //explicit conversion
        byte   byteValue3   =          (byte)  shortValue3;  //explicit conversion

        /* Another Example for restricting transformations
         * double -> float -> long -> int -> short -> byte
         */
        double doubleValue4 =          97.0;                 //implicit conversion
        float  floatValue4  =          (float) doubleValue4; //explicit conversion
        long   longValue4   =          (long)  floatValue4;  //explicit conversion
        int    intValue4    =          (int)   longValue4;   //explicit conversion
        char   charValue4   =          (char) intValue4;     //explicit conversion
    }
}