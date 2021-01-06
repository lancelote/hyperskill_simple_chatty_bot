package stage4.hw1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
