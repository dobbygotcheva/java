
public class Main {
    public static void main(String[] args) {
        String str1="Scheisse!";
        String str2="Verdammte Scheisse!";
        StringBuffer buffer=new StringBuffer(str1);
        System.out.println(str1+" is the same as "+buffer+":"+str1.contentEquals(buffer));
        System.out.println(str2+" is the same as "+buffer+":"+str2.contentEquals(buffer));

    }
}