import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] myArray=new int []{1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0; i<myArray.length; i++){
            sum=sum+myArray[i];
        }
        int average=sum/myArray.length;
        System.out.println("The average is: "+average);
    }
}