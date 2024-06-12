package looping.and.array;

public class Looping {
    // repeatedly execute a statement as long as the provided condition is true
    // they are 3 types:
    // while loop
    // do-while loop
    // for loop
    public static void whileLoop() {
        // condition is checked at loop start
        // loop body may never run
        int i = 5;
        int j = 1;
        while (i > 0) {
            j *= i;
            i--;
        }
        System.out.println(j);
    }

    public static void doWhileLoop() {
        // condition is checked at loop end
        // loop body always runs at least once
        int value = 5;
        do {
            System.out.print(value + " * 2 = ");
            System.out.println(value *= 2);
        } while (value < 25);
    }

    public static void forLoop() {
        // condition checked at loop start
        // loop body may never run
        // simplified notation for loop control values
        /*
        syntax:
        for (initialize; condition; update) {
            statement;
        }
         */
        for (int i = 1; i < 100; i *= 2) {
            System.out.println(i); // 1, 2, 4, 8, 16, 32, 64.
        }
    }

    public static void forEachLoop() {
        // executes a statement once for each array member
        // handles getting collections length
        // handles accessing each value

        int[] values = {10, 20, 15};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println(sum); // prints 45
    }
}
