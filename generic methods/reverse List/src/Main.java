import java.util.ArrayList;
import java.util.List;
public class Main {
    public static <T> List<T> reverseList(List<T> originalList){
        List<T> reverseList=new ArrayList<>();
        for(int i=originalList.size()-1; i>=0; i--){
            reverseList.add(originalList.get(i));
        }
        return reverseList;
    }

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8);
        List<String> words=List.of("Mnogo", "pozdravi");
        System.out.println("The reverse is: "+reverseList(numbers));
        System.out.println("The reverse is: "+reverseList(words));
    }
}