package variables.datatypes.and.math.operators;

public class DataTypes {
    // Primitive datatypes
    // they are built into the language
    // they are foundation of all other types
    // they are of 4 categories:
    /*
    Integer
    Floating point
    Character
    Boolean
     */

    // Integer Types
    /*
    byte  from -128 to 127
    short from -32768 to 32767
    int from -2147483648 to 2147483647
    long from -9223372036854775808 to 9223372036853775808
     */
    byte numberOfEnglishLetters = 26;
    short feetInMile = 5280;
    int milesToSun = 9296000;
    long milesInALightYear = 5879000000000L;

    // Floating Point Types
    /*
    float from 1.4 x 10^-45 to 3.4 x 10^38
    double from 4.9 x 10^-324 to 1.7 x 10^308
     */
    float kilometersInAMarathon = 42.195f;
    float absoluteZeroInCelsius = -273.15f;
    double atomWidthInMeters = 0.0000000001d;

    // Character Types
    /*
    stores a single unicode character
    they are literal values placed between single quotes
     */
    char regularU = 'U';

    // Boolean Types
    /*
    stores true/false values
    literal values are true and false
     */
    boolean iLoveJava = true;
    boolean hateJava = false;

    // primitive types are stores by values

    private void typeConversion() {
        // implicit type conversion: automatically performed by the compiler
        int intValueOne = 50;
        long longValueOne = intValueOne;
        // explicit type conversion: performed explicitly in code with cast operator
        long longValueTwo = 50;
        int intValueTwo = (int) longValueTwo;
    }
}
