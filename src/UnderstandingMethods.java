public class UnderstandingMethods {
    // mechanism for organizing code
    //enables creation of reusable code blocks
    // they can receive data
    // they can return data
    /*
    syntax
    return-type name (typed parameter-list) {
        statements;
    }
     */
    public static double calculateIntrest(double amt, double rate, int years) {
        return amt * rate * years;
    }

    // variables scope are limited to method where declared
    // parameters enables passing data values to methods
    // passed values are matched to parameters by position

    public static void showSum(float x, float y, int count) {
        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
        }
    }

    // reasons for method exits
    // end of method : no more code in the method
    // return statement: this explicitly exits a method
    // error occurs: method abruptly exits, throws an exception
}
