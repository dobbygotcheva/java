
public class Main {
    public static void main(String[] args) {
        String str1="tcharakter";
        String str2="shimata";

        int result=str1.compareTo(str2);
        if(result<0){
            System.out.println(str1+"<"+str2);
        } else if(result==0){
            System.out.println(str1+"="+str2);
        } else if(result>0){
            System.out.println(str1+">"+str2);
        }
    }
}