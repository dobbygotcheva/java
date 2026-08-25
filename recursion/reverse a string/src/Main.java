
public class Main {
    public static String reverseString(String text){
        if(text.isEmpty() || text.length()==1){
            return text;
        }

        return reverseString(text.substring(1))+text.charAt(0);
    }
    public static void main(String[] args) {
        String text="Ne ma ebe";
        System.out.println(reverseString(text));
    }
}