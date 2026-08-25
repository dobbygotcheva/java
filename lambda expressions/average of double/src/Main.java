import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Double> numbers=Arrays.asList(5.3,6.2,4.7,9.7,4.3,6.7,1.2,3.6);
        double average=numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average of the list: "+average);
    }
}