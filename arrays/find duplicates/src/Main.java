import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] array={1,5,6,7,8,9,1};
        for(int i=0; i=<array.length-1;i++){
            for(int j=i+1; j<=array.length-1; j++){
                if((array[i]==array[j]) && (i!=j))
                    System.out.println("The duplicate element: "+array[j]);
            }
        }
    }
}