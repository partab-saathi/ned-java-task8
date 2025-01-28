/*Q8. Remove a Specific Substring: Use replace() to remove a specific substring by replacing it with an empty string. */
public class Q8 {

    public static void main(String[] args) {
        String str = "Java Programming";
        String removedSubstring = str.replace("Java", "");
        System.out.println("After removing 'Java': " + removedSubstring.trim());
    }
}
