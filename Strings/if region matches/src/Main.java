
public class Main {
    public static void main(String[] args) {
        String str1="Ich finde dich!";
        String str2="Leid, hab ich dich!";
        boolean match=str1.regionMatches(10, str2, 14, 4);
        System.out.println("The two strings are matches: "+match);
    }
}