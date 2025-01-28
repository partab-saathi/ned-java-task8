/*Q4. Check if a String Starts or Ends With a Specific Value: Use startsWith() and endsWith() methods. */
public class Q4 {

    public static void main(String[] args) {
        String str = "Java Programming";
        boolean startsWith = str.startsWith("Java");
        boolean endsWith = str.endsWith("ing");
        System.out.println("Starts with 'Java': " + startsWith);
        System.out.println("Ends with 'ing': " + endsWith);
    }
}
