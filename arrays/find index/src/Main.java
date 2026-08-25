import java.util.Arrays;

class Exercises{
    public static int findIndex(int arr[], int element){
        if(arr==null) return -1;
        int len=arr.length;
        int i=0;
        while(i<len){
            if(arr[i]==element){
                return i;
            }
            i+=1;
        }
        return -1;


    }
}
public class Main {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        System.out.println(Exercises.findIndex(array, 5));

    }
}