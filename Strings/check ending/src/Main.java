
public class Main {
    public static void main(String[] args) {
        String str1="Mein Herz brennt!";
        String str2="Ich hasse Kinder!";
        String end="brennt!";
        boolean end1=str1.endsWith(end);
        boolean end2=str2.endsWith(end);
        System.out.println(str1+" ends with "+end+" : "+end1);
        System.out.println(str2+" ends with "+end+" : "+end2);
    }
}