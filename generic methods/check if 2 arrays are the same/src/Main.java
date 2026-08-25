import java.util.Arrays;
public class Main {
    public static <T> boolean compare_arrays(T[] array1,T[] array2){
        if(array1.length!=array2.length){
            return false;
        }

        for(int i=0; i<array1.length; i++){
            if(!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] array1={1,2,3,4,5};
        Integer[] array2={1,2,3,4,5};

        boolean verno=compare_arrays(array1,array2);
        System.out.println("The two arrays are the same: "+verno);
    }
}