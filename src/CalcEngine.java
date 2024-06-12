import java.util.Arrays;

public class CalcEngine {
    public static void main(String[] args) {
        double[] value1 = {100.0d, 200.0d, 20.0d, 120.0d} ;
        double[] value2 = {50.0d, 100.0d, 10.0d, 40.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            results[i] = execute(opCodes[i], value1[i], value2[i]);
        }

        for ( double result : results){
            System.out.println(result);
        }
    }

    private static double execute(char opCode, double value1, double value2) {
        double result;
        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2: 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
        }
        return result;
    }
}
