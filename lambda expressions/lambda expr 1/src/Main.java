
public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator=(x,y)->x+y;
        int result=sumCalculator.sum(5,6);
        System.out.println("Sum 5,6: "+result);
        int result1=sumCalculator.sum(15, -35);
        System.out.println("Sum -15, 35: "+result1);
    }
}