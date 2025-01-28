/*Q9. Check if a String Matches a Pattern: Use matches() to verify if a string matches a specific regular expression. */
public class Q9 {

    public static void main(String[] args) {
        String str = "JavaProgramming";
        String pattern = "[a-zA-Z]+";
        boolean matches = str.matches(pattern);
        System.out.println("Matches pattern [a-zA-Z]+: " + matches);
    }
}
