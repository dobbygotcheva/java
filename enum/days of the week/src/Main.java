
public class Main {
    public enum DaysOfWeek{
        MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        DaysOfWeek today=DaysOfWeek.FRIDAY;
        System.out.println("Today is: "+today);
    }
}