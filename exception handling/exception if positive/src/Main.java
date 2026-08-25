import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            List<Integer>numbers= new ArrayList<>();
            numbers.add(-1);
            numbers.add(1);
            numbers.add(3);
            checkPos(numbers);

        } catch (NotNegativeException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void checkPos(List<Integer>numbers) throws NotNegativeException{
        for(int num: numbers){
            if(num>0){
                throw new NotNegativeException("There is a positive number.");
            }
        }
    }
}

class NotNegativeException extends Exception{
    public NotNegativeException(String message){
        super(message);
    }
}

