import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] myArray={1,2,5,7,8,9,4,3,5,8};
        int sum=0;
        for(int n:myArray){
            sum+=n;
        }
        System.out.println("The sum is: "+sum);
    }
}