
public class Main {
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int result=factorial(8);
        System.out.println("The result is: "+result);
    }
}