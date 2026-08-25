import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array={1,3,4,5,3,4,3,5,9,8};
        int [] array1=new int[array.length];

        for(int i=0; i<array.length; i++){
            array1[i]=array[i];
        }

        System.out.println(Arrays.toString(array1));
    }
}