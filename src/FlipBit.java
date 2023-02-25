public class FlipBit {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
    public static void main(String[] args) {
        System.out.println(flipBit(6, 2));
    }
}
