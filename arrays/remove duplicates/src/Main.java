import java.util.Arrays;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,4,5,6};
        int [] uniqueArray=Exercise.noDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }
}

class Exercise{
    public static int [] noDuplicates(int [] arr){
        HashSet<Integer> set=new HashSet<>();

        for(int n: arr){
            set.add(n);
        }

        int [] uniqueArray=new int[set.size()];
        int index=0;
        for(int n: set){
            uniqueArray[index++]=n;
        }

        return uniqueArray;
    }
}