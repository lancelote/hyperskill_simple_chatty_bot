package stage5.hw11;

public class Main {
    public static void main(String[] args) {
        System.out.println(toPrimitive(Boolean.valueOf(true)));
        System.out.println(toPrimitive(Boolean.valueOf(false)));
        System.out.println(toPrimitive(null));
    }

    public static boolean toPrimitive(Boolean b) {
        return b == null ? false : b;
    }
}
