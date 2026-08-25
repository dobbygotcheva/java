import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] myArray={1,2,3,4,5,6,7,8};
        for(int i=0; i<myArray.length/2; i++){
            int temp=myArray[i];
            myArray[i]=myArray[myArray.length-i-1];
            myArray[myArray.length-i-1]=temp;
        }
        System.out.println("After reversing: "+ Arrays.toString(myArray));
    }
}