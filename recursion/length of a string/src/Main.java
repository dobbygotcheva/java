
public class Main {
    public static int countLength(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1+countLength(str.substring(1));
    }
    public static void main(String[] args) {
        String str="Es ist mir scheiss egal.";
        int length=countLength(str);
        System.out.println("The length of the string is: "+length);
    }
}