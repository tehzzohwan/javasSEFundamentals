public class WorkingWithStrings {

    public void stringClass() {
        // stores a sequence of unicode characters
        // literal are enclosed in double quotes
        //  values can be concatenated using + and +=
        // strings are immutable
        // string variables do not directly hold the string value
        // hold a reference to the instance of the string
        // changes in the value create a new instance of the string

        String name = "goke";
        String car = new String("toyota");
        System.out.println(car.substring(4));
    }
}
