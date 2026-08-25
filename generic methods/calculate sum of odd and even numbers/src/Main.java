import java.util.List;
public class Main {
    public static <T extends Number> void sumOddEven(List<T> numbers){
        double evenSum=0;
        double oddSum=0;

        for(T num: numbers){
            if(num.doubleValue()%2==0){
                evenSum+=num.doubleValue();
            } else{
                oddSum+=num.doubleValue();
            }
        }
        System.out.println("Original list of numbers is: "+numbers);
        System.out.println("The sum of odd numbers is: "+oddSum);
        System.out.println("The sum of even numbers is: "+ evenSum);
    }
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,6,6,8,9);
        List<Double> nums=List.of(2.0, 4.0, 5.9, 3.7, 6.4);
        sumOddEven(numbers);
        sumOddEven(nums);
    }
}