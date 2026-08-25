import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(12,56,87,98,31,46,75,34,94,100);

        List evenNumbers=nums.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println("Even numbers: ");
        for(Object num: evenNumbers){
            System.out.println(num);
        }

        List oddNumbers=nums.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println("Odd numbers: ");
        for(Object num: oddNumbers){
            System.out.println(num);
        }


    }
}