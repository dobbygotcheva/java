import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Rot", "Gelb", "Orange");

        System.out.println("Original list: ");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.replaceAll(str -> str.toLowerCase());

        System.out.println("After: ");
        for (String str : stringList) {
            System.out.println(str);
        }

        stringList.replaceAll(str->str.toUpperCase());

        System.out.println("After capitalizing: ");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}