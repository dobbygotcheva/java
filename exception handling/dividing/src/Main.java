public class Main{
    public static void main(String[] args){
        try{
            int result=Exercise.divide(7,0);
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

class Exercise{
    public static int divide(int dividend, int divisor){
        if(divisor==0){
            throw new ArithmeticException("Cannot divide by 0!");
        }
        return dividend/divisor;
    }
}