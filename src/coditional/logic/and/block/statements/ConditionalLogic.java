package coditional.logic.and.block.statements;

public class ConditionalLogic {
    // conditional logic performs a test
    // perform action based on the test result
    // the test is used to check the relationship between two values with relational operators

    private void relationalOperators() {
        // there are 6 types
        boolean greaterThan = 3 > 2; // greater than >
        boolean lessThan = 2 < 3; // less than <
        boolean greaterThanOrEqualTo = 3 >= 2; // greater than or equal to  >=
        boolean lessThanOrEqualTo = 2 <= 3; // less than or equal to <=
        boolean equalsTo = 2 == 2; // equal to ==
        boolean notEqualsTo = 2 != 3; // not equal to !=
    }

    private void conditionalAssignment() {
        // returns a value based on the result of a condition
        int value1 = 3;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;

        System.out.println(maxValue); // displays 5
    }

    private void ifElse() {
         // if statement conditionally executes a statement
        // else clause executes a statement when condition is false
        // else clause is optional
        // if ( condition ) { block of statement };
        int value1 = 3;
        int value2 = 5;

        if (value2 > value1) {
            System.out.println("Value2 is bigger");
        } else {
            System.out.println("Value1 is bigger");
        }
    }

    public static void logicalOperator() {
        // produces a single true or false result from 2 true or false values
        // may combine 2 relational test
        // may combine 2 boolean variables

        // there are 4 basic logical operators
        // And & --> only resolves to true when both values are true
        // Or | --> when either of the value is true it resolves to true
        // Exclusive or (XOR) ^ --> resolves to true only when either of the value is true when both values are true or false it resolves to false
        // Negation ! --> resolves to false

        int value1 = 3;
        int value2 = 5;
        int value3 = 8;

        if (value2 > value1 & value2 > value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        if (value2 > value1 & value2 < value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        if (value2 > value1 | value2 > value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        if (value2 < value1 | value2 > value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        if (value2 < value1 ^ value2 > value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        if (value2 > value1 ^ value2 > value3) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }

    public static void conditionalLogicalOperators() {
        // similar to standard logical operators
        // right side executes only when needed
        // there ere 2 of them
        // And && ->  execute right only when left is true
        // Or || -> execute right only when left is false
    }

    public static void blockStatement() {
        // Groups statement together
        // creates a compound statement
        // they are enclosed in opening and closing curly braces
        /* syntax
        {
        statement 1;
        statement 2;
        .
        .
        .
        statement N;
        }
         */
        // Variable scope
        // - describes range of visibility

        // variable declared within a block statement
        // - scope is limited to that block
        // - in other words, the variable is not visible outside of the block
        double students = 30.0d, rooms = 4.0d;
        if (rooms > 0.0d) {
            System.out.println(students);
            System.out.println(rooms);
            double avg = students / rooms;
            System.out.println(avg);
        }
    }

    public static void switchStatement() {
        // used to test value against multiple matches
        // only primitive data types can be used with switch
        // a match can have multiple statements that why you end each match with break otherwise it will fall through to the next match
        // fall through: when it switch case finds a match and runs the next case statement

    }
}
