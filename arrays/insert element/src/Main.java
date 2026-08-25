import java.util.Arrays;

class Exercise{
    public static int [] insertElement(int [] array, int element, int index){
        int [] result=new int[array.length+1];

        for(int i=0; i<index; i++){
            result[i]=array[i];
        }

        result[index]=element;

        for(int i=index+1;i<result.length; i++){
            result[i]=array[i-1];
        }
        return result;
    }
}

public class Main{
    public static void main(String [] args){
        int [] array={1,2,3,4,5};
        int [] result=Exercise.insertElement(array, 8, 2);
        System.out.println(Arrays.toString(result));
    }
}