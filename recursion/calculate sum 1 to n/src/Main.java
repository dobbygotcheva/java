
public class Main {
    public static int sum(int start, int end){
        if(start>end)
            return 0;
        return start+sum(start+1, end);
    }
    public static void main(String[] args) {
        int result=sum(1,4);
        System.out.println("The sum is: "+result);
    }
}