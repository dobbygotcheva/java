import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> colours=Arrays.asList("rot", "orange", "gelb", "lila", "blau", "braun");
        colours.sort((str1, str2)->str1.compareToIgnoreCase(str2));

        for(String colour: colours){
            System.out.println(colour);
        }
    }
}