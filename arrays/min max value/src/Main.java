import java.util.Arrays;

class Exercise{
    public static void min_max(int [] array){
       int min=array[0];
       int max=array[0];
       int len=array.length;
       for(int i=0; i<len; i++){
           if(array[i]<min){
               min=array[i];
           }
           if(array[i]>max){
               max=array[i];
           }
       }
       System.out.println("The max is: "+max);
       System.out.println("The min is: "+ min);
    }
}
public class Main {
    public static void main(String[] args) {
        int [] array={2,4,3,6,5,98,8};
        Exercise.min_max(array);

    }
}