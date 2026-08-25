import java.util.Scanner;
public class PasswordValidator {
    public static boolean validatePassword(String password){
        if(password.length()<8){
            return false;
        }

        String accountName="DGG190";
        String fullName="Dobrinka Gotcheva";

        for(int i=0; i<=fullName.length()-2; i++){
            String substring=fullName.substring(i, i+3);
            if(password.contains(accountName) || password.contains(substring)){
                return false;
            }
        }

        int categoryCount=0;
        if(password.matches(".*[a-z].*")){
            categoryCount++;
        }
        if(password.matches(".*[A-Z].*")){
            categoryCount++;
        }
        if(password.matches(".*\\d.*")){
            categoryCount++;
        }
        if(password.matches(".*[^a-zA-Z0-9].*")){
            categoryCount++;
        }

        return categoryCount>=3;
    }

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password=scanner.nextLine();

        if(validatePassword(password)){
            System.out.println("The password is valid!");
        } else{
            System.out.println("The password is invalid!");
        }
    }
}
