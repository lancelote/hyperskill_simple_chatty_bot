package stage4.hw3;

public class Main {
    public static void toString(long num) {
        System.out.println("long");
    }

    public static void toString(int num) {
        System.out.println("int");
    }

    public static void main(String[] args) {
        // float val1 = 2F; toString(val1);
        long val2 = 2L; toString(val2);
        int val3 = 2; toString(val3);
        byte val4 = 2; toString(val4);
        char val5 = 2; toString(val5);
        // double val6 = 2; toString(val6);
    }
}
