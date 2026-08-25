import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] array={"rot", "gelb", "rot", "blau", "lila"};
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if((array[i].equals(array[j])) && (i!=j))
                    System.out.println("The duplicate string : "+array[j]);
            }
        }
    }
}