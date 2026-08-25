
public class Main {
    public static int gcd(int num1, int num2){
        if(num2==0){
            return num1;
        }
        int remainder=num1%num2;
        return gcd(num2, remainder);
    }
    public static void main(String[] args) {
        System.out.println("The gcd of 8 and 12 is "+gcd(8,12));
    }
}