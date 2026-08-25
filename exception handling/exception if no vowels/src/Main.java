
public class Main {
    public static void main(String[] args) {
        try{
            String text="Ich heisse Hermann Hesse.";
            checkVowel(text);

        } catch (NoVowelException e){
            System.out.println("Error: "+e.getMessage());
        }


    }

    public static void checkVowel(String text) throws NoVowelException{
        boolean containsVowel=false;
        String vowels="aeoiuAeiou";

        for(int i=0; i<text.length(); i++){
            char ch=text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                containsVowel=true;
            }
        }
        if (!containsVowel) {
            throw new NoVowelException("It contains no vowels!");
        } else {
            System.out.println("It contains vowels.");
        }
    }
}


class NoVowelException extends Exception{
    public NoVowelException(String message){
        super(message);
    }
}