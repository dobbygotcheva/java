
public class Main {
    public static void main(String[] args) {
        String str1="Psychologie hilft den Menschen.";
        String str2="Es ist mir scheiss egal.";

        String str="Es";

        boolean verno=str1.startsWith(str);
        boolean verno1=str2.startsWith(str);

        System.out.println(str1+" starts with "+str+" : "+verno);
        System.out.println(str2+" starts with "+str+" : "+verno1);
    }
}