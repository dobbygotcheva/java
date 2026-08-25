import java.util.Arrays;
class Exercise {
    public static int[] findIndex(int arr[], int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] arr1 = new int[arr.length - 1];
            System.arraycopy(arr, 0, arr1, 0, index);
            System.arraycopy(arr, index + 1, arr1, index, arr.length - index - 1);

            return arr1;
        } else {
            return arr;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Exercise.findIndex(arr, 4)));
    }
}