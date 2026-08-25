import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] array={"rot", "gelb", "blau", "lila", "rosa"};
        String [] array1={"rot", "Auge", "Kuehlschrank", "Telefon", "gelb"};
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<=array.length; i++){
            for(int j=0; j<array1.length; j++){
                if(array[i]==array1[j])
                    set.add(array[i]);
            }
        }

        System.out.println("The strings in common are: "+ set);
    }
}