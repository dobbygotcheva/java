
public class Main {

    public static boolean isPalindrome(String text){
        if(text.length()<=1){
            return true;
        }
        char firstChar=text.toLowerCase().charAt(0);
        char lastChar=text.toLowerCase().charAt(text.length()-1);

        if(firstChar!=lastChar)
            return false;

        String subString=text.substring(1, text.length()-2);
        return isPalindrome(subString);
    }
    public static void main(String[] args) {
        String text="Ne ma ebe.";
        System.out.println("The text is a palindrome: "+isPalindrome(text));
    }
}