public class Main{
    public static int calculateProduct(int [] arr){
        return calculateProduct(arr, 0, arr.length-1);
    }

    public static int calculateProduct(int [] arr, int left, int right){
        if(right==left){
            return arr[left];
        }

        int mid=(left+right)/2;
        int leftProduct=calculateProduct(arr, left, mid);
        int rightProduct=calculateProduct(arr, mid+1, right);

        return leftProduct*rightProduct;

    }

    public static void main(String [] args){
        int [] arr={1,23,4,5,6,6};
        int product=calculateProduct(arr);
        System.out.println("The product of the numbers in the array is: "+product);
    }
}
