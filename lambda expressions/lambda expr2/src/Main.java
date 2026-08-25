import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Lambda expression to check if a given string is empty
        Predicate<String> isEmpty = str -> str.isEmpty();

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Hello"; // non-empty string

        System.out.println("Is str1 empty? " + isEmpty.test(str1)); // Should print: true
        System.out.println("Is str2 empty? " + isEmpty.test(str2)); // Should print: false
    }
}