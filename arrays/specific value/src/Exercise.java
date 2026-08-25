public class Exercise {
    public static boolean contains(int arr[], int num){
        for(int n: arr){
            if(n==num){
                return true;
            }
        }
        return false;
    }
}
