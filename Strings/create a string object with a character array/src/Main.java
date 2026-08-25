
public class Main {
    public static void main(String[] args) {
        char[] arr_num=new char[]{'1','2','3','4'};
        String str=String.copyValueOf(arr_num,1,3);
        System.out.println(str);
    }
}