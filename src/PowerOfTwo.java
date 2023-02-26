public class PowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return Integer.bitCount(value) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }
}
