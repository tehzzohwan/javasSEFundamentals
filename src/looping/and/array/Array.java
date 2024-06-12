package looping.and.array;

public class Array {
    // provides an ordered collection of element
    //  each element are accessed via an index
    // index range from 0 to number-of-elements minus 1
    public static void newArray() {
        int[] values = new int[3];
        values[0] = 10;
        values[1] = 20;
        values[2] = 15;
        int  sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);

        int[] vals = new int[]{20, 10, 45};
        int multipliedValues = 0;
        for (int val : vals) {
            multipliedValues *=  val;
        }
        System.out.println(multipliedValues);
    }


}
