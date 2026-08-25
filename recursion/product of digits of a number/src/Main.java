
public class Main {
    public static int sumDigits(int number){
        if(number<10){
            return number;
        }

        int digit=number%10;
        int remainingNumber=number/10;
        return digit+sumDigits(remainingNumber);
    }
    public static void main(String[] args) {
        int sumDig=sumDigits(1234);
        System.out.println("The product of the digits of the number 1234 is: "+sumDig);
    }
}