package stage4.hw12;

import java.util.*;

public class Main {

    public static int convert(Double val) {
        if (val == null) {
            return Integer.parseInt("0");
        } else if (val == Double.POSITIVE_INFINITY) {
            return Integer.MAX_VALUE;
        } else if (val == Double.NEGATIVE_INFINITY) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double doubleVal = new Double(scanner.nextDouble() / scanner.nextDouble());
        System.out.println(convert(doubleVal));
    }
}
