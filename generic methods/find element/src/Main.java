import java.util.List;
public class Main {
    public static <T> int findElement(List<T> list, T target){
        for(int i=0; i<list.size();i++){
            if(list.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6);
        List<String> words=List.of("Kazano", "chestno", "vsichko", "mi", "e", "nared");
        int index = findElement(numbers, 5);
        System.out.println("The number 5 is on index: "+index);
        int index1=findElement(words, "chestno");
        System.out.println("The word chestno is on index: "+index1);
    }
}