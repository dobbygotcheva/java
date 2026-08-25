import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int [] myArray={
               1,2,3,5,8,7,9,6
       };

       System.out.println("The original array: "+Arrays.toString(myArray));
       Arrays.sort(myArray);
       System.out.println("The sorted array: "+Arrays.toString(myArray));
    }
}