import java.util.Scanner;

public class AUBGUsernameGenerator{
    public static String usernameGenerator(String name, int admissionYear){
        String [] nameList=name.split(" ");
        StringBuilder username=new StringBuilder();

        for(String word: nameList){
            if(!word.isEmpty()){
                username.append(word.charAt(0));
            } else{
                username.append('n');
            }
        }

        username.append(admissionYear%100);
        username.append('0');

        String user=username.toString();
        return user;
    }

    public static boolean validYear(int year){
        return year>=1900 && year<=2099;
    }

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a full name: ");
        String name=scanner.nextLine();

        System.out.println("Enter an admission year: ");
        if(scanner.hasNextInt()){
            int year=scanner.nextInt();
            if(validYear(year)){
                String username=usernameGenerator(name, year);
                System.out.println("Name: "+ name );
                System.out.println("Year: "+ year);
                System.out.println("Username: "+username);
            } else{
                System.out.println("Invalid year of admission!");
            }
        } else{
            System.out.println("Invalid input!");
        }
    }
}