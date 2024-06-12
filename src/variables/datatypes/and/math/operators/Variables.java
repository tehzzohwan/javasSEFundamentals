package variables.datatypes.and.math.operators;

public class Variables {
    // Variable are simply a named area of storage
    // java is strongly typed language i.e any variable you create ypu need to indicate its type

    // Variable naming convection
    // use only letters and numbers
     int data = 2; // is valid
     int data2 = 3; // is also valid
    // first character cannot be a number
//     int 2data = 4; // is invalid

    // style name using camel case
    // start each word after the first with upper case
    // all other letters are lower case
    // Example:
     int sum;
     int studentCount;
     int bankAccountBalance;
     int level2Training;

     public static void testVariables() {
         // Variables can be declared final:
         final int maxStudents = 25;
         int myVar;
         myVar = 50;
         System.out.println(myVar);
         int anotherVar = 100;
         System.out.println(anotherVar);
         myVar = anotherVar;
         System.out.println(myVar);
     }


}
