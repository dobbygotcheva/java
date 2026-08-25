
public class Main {
    public static <T> int countOcurrences(int[] arr,int target){
        return countOcurrences(arr, target, 0);
    }

    public static <T> int countOcurrences(int [] arr, int target, int index){
        if(index==arr.length){
            return 0;
        }
        int count=countOcurrences(arr, target, index+1);
        if(arr[index]==target){
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[]numbers={1,2,2,3,4,5,6,6,6,6};
        int count=countOcurrences(numbers,6);
        System.out.println("The number of occurences of 6 is "+count);
    }
}