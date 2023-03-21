import java.math.BigInteger;

public class Numbers {
    public static void main(String[] args) {
        try {
            System.out.println(factorial(4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= value; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}


