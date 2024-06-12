package variables.datatypes.and.math.operators;

public class Operators {
    // there are 3 types of operators
    /*
    basic operator: produce a result, no impact on values used in the operation.
    prefix/postfix: increases or decreases a value, replaces original value.
    compound assignment : combines an operation and assignment.
     */
    // Basic Operators
    int add = 3 + 3; // add +
    int subtract = 3 - 2; // subtract -
    int multiply = 3 * 3; // multiply *
    int divide = 6 / 3; // divide /
    int modulus = 6 % 3;  // modulus %

    // Prefix/Postfix operators
    private void prefixPostfix() {
        // postfix operator: returns the value of the variable before performing the operation
        // ++ increment value
        add++;  //
        // -- decrement value
        multiply--;
        // prefix operator: performs the operation then return the value.
        ++divide;
        --modulus;
    }

    private void compoundAssignmentOperator() {
//        -=, +=, *=, /=, %=
//        these are the compound assignment operator
        int myValue = 50;
        System.out.println(myValue += 5);
        System.out.println(myValue *= 5);
        System.out.println(myValue /= 5);
        System.out.println(myValue %= 5);

    }

    //operator precedence
    // postfix ++ --> ++ prefix --> multiplicative * / % --> additive +-.
    // operators occurs from right to left.

}
