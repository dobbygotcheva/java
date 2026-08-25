
public class Main {
    public static void main(String[] args) {
        String str1="Preebah se";
        String str2="preebah se";
        String cs="Preebah se";
        System.out.println(str1+" is the same to "+cs+":"+str1.contentEquals(cs));
        System.out.println(str2+" is the same to "+cs+":"+str2.contentEquals(cs));

    }
}