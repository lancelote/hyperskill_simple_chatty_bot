package stage3.project;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        String name = scanner.next();

        System.out.printf("What a great name you have, %s!\n", name);

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;

        System.out.printf("Your age is %s; that's a good time to start programming!\n", age);
    }
}
