import java.util.Scanner;

public class enumDay {
    static void main() {
        Scanner sc  =  new Scanner(System.in);
        System.out.print("enter a day :");
        String response = sc.nextLine().toUpperCase();
       try{
           Day day = Day.valueOf(response);

           switch (day){
               case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("it is a weekday");
               case SATURDAY,SUNDAY -> System.out.println("it is weekend");
           }
           }
       catch(IllegalArgumentException e){
           System.out.println("invalid day");
       }
    }
}
