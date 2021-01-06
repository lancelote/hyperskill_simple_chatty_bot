package stage4.hw2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        callMeAwesome();
    }

    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
