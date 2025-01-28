/*Q1. Concatenate Two Strings: Combine two strings using the + operator concat() function. */
public class Q1 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + " " + str2;
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated using +: " + result1);
        System.out.println("Concatenated using concat(): " + result2);
    }
}
