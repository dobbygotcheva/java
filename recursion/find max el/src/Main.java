import java.util.Arrays;
public class Main {
    public static int findMax(int[] arr){
        return findMax(arr, 0, arr.length-1);
    }

    public static int findMax(int [] arr, int left, int right){
        if(left==right)
            return arr[left];

        int mid=(left+right)/2;
        int leftMax=findMax(arr, left, mid);
        int rightMax=findMax(arr, mid+1, right);

        return Math.max(leftMax,rightMax);
    }
    public static void main(String[] args) {
        int[] arr={1,6,7,58,25,6,4};
        int max=findMax(arr);
        System.out.println("The max element is: "+max);
    }
}