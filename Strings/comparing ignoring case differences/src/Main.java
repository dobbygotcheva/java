
public class Main {
    public static void main(String[] args) {
        String str1="Viele Griesse!";
        String str2="Mnogo pozdravi!";

        int result=str1.compareToIgnoreCase(str2);
        if(result<0){
            System.out.println(str1+"<"+str2);
        } else if(result==0){
            System.out.println(str1+"="+str2);
        } else if(result>0){
            System.out.println(str1+">"+str2);
        }
    }
}