import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int [] array={3,6,85,6,4,23,9};
       int newElement=8;
       int position=3;

       for(int i=array.length-1; i>position; i--){
           array[i]=array[i-1];
       }

       array[position]=newElement;
       System.out.println(Arrays.toString(array));
    }
}