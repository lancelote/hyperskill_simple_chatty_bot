package stage4.hw9;

class MagicNumber {

    private final static int[] NUMBERS;
    private static int next = 0;

    public int number;

    static {
        NUMBERS = new int[] { 1, 3, 7, 15, 31, 63 };
    }

    {
        this.number = NUMBERS[next % NUMBERS.length];
        next++;
    }

    public MagicNumber(int base) {
        this.number += base;
    }
}


public class Main {
    public static void main(String[] args) {
        MagicNumber[] numbers = new MagicNumber[8];

        for (int i = 0; i < numbers.length; i++) {
            MagicNumber magicNumber = new MagicNumber(i);
            System.out.println(magicNumber.number);
        }
    }
}
