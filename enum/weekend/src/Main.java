
public class Main {
    public enum Weekend{
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        Weekend day1=Weekend.SATURDAY;
        Weekend day2=Weekend.SUNDAY;

        System.out.println("Tomorrow is: "+day1);
        System.out.println("The day after tomorrow is: "+day2);
    }
}