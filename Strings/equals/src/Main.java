
public class Main {
    public static void main(String[] args) {
        String str1="Adolf Hitler";
        String str2="Albert Einstein";
        String str3="Wolfgang Amadeus Motzart";

        boolean opt1=str1.equals(str2);
        boolean opt2=str1.equals(str3);

        System.out.println(str1+" equals "+str2+" : "+opt1);
        System.out.println(str1+" equals "+str2+" : "+opt2);
    }
}