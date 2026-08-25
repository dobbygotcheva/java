import java.util.Arrays;
public class Main {
    public static boolean checkifSorted(int []array){
        return checkifSorted(array, 0);
    }

    public static boolean checkifSorted(int [] array, int index){
        if(index==array.length-1){
            return true;
        }

        if(array[index]>array[index+1]){
            return false;
        }

        return checkifSorted(array, index+1);
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,9};
        boolean verno=checkifSorted(array);
        System.out.println("The array is sorted: "+verno);
    }
}