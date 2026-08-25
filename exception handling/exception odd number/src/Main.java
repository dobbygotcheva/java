
public class Main {
    public static void main(String[] args) {
        int n=8;
        trynumber(n);
        int p=7;
        trynumber(p);
    }

    public static void trynumber(int n){
        try{

            isEven(n);
            System.out.println("The number is even.");
        } catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void isEven(int n){
        if(n%2!=0){
            throw new IllegalArgumentException("The number is not even!");
        }

    }
}