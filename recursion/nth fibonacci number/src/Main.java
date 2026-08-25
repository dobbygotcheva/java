
public class Main {

    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
       int result=fibonacci(6);
       System.out.println("The 6th fibonacci number is: "+result);
    }
}