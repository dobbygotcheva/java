
public class Main {
    public static int expon(int num, int exponent){
        if(exponent==0){
            return 1;
        }

        return num*expon(num, exponent-1);
    }
    public static void main(String[] args) {
       System.out.println("6^2="+expon(6,2));
    }
}