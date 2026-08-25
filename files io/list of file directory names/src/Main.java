import java.io.File;
import java.util.Date;

public class Main{
    public static void main(String[] args){
        File file=new File("C:/Users/dobri/OneDrive/Desktop/Java/files io/list of file directory names");
        String [] list=file.list();
        for(String name: list){
            System.out.println(name);
        }
    }
}