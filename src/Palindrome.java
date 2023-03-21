public class Palindrome {
    public static void main(String[] args) {
        String value = "Madam, I'm Adam!".replaceAll("[^a-zA-z0-9]", "");
        StringBuilder builder = new StringBuilder(value);
        builder.reverse();
        String result = builder.toString();
        System.out.println(value.equalsIgnoreCase(result));
    }
}