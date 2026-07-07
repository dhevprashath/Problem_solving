import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week : ");

        String day = sc.next();
        switch (day){
            case "monday" -> System.out.println("Its a weekday");
            case "tuesday" -> System.out.println("Its a weekday");
            case "wednesday" -> System.out.println("Its a weekday");
            case "thursday" -> System.out.println("Its a weekday");
            case "friday" -> System.out.println("Its a weekday");
            case "saturday" -> System.out.println("Its a weekend");
            case "sunday" -> System.out.println("Its a weekend");
            default -> System.out.println(day  + " it not a day");

        }
    }
}
