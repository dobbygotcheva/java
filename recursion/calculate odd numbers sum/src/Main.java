
public class Main {
    public static int calculateSumOddNum(int[] arr){
        return calculateSumOddNum(arr, 0);
    }

    public static int calculateSumOddNum(int [] arr, int index){
        if(index==arr.length){
            return 0;
        }
        int sum=calculateSumOddNum(arr, index+1);
        if(arr[index]%2!=0){
            sum+=arr[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,3,4,3,5,2};
        int sum=calculateSumOddNum(numbers);
        System.out.println("The sum of the odd numbers is: "+ sum);
    }
}