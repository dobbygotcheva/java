import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file=new File("C:/Users/dobri/OneDrive/Desktop/Java/files io/if file or directory exists");
        if(file.exists()){
            System.out.println("Exists!");
        }
        else{
            System.out.println("It doesn't exist.");
        }
    }
}