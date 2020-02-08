package stage4.hw4;

import java.util.Scanner;

public class Main {

    public static void print(String strArg) {
        System.out.println(String.format("print(\"%s\")", strArg));
    }

    public static void print(String strArg, int intArg) {
        System.out.println(String.format("print(\"%s\", %s)", strArg, intArg));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}
