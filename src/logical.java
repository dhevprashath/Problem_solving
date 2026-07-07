import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
//        double temp = -20;
//        boolean issunny = false;
//        if(temp <= 30 && temp >= 0 && issunny){
//            System.out.println("temprature is good");
//        }
//        else if(temp <=30 && temp >=0 &&  !issunny){
//            System.out.println("the weather is cloudy");
//            System.out.println("temprature is good");
//        }
//        else if(temp > 30 || temp < 0){
//            System.out.println("temprature is bad");
//        }

        Scanner sc = new Scanner(System.in);
        String username;

        System.out.print("Enter your new username : ");
        username = sc.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.println("username must between 4 to 12");
        }
        else if(username.contains(" ") && username.contains("_")){
            System.out.println("username does'nt contains any spaces or _ ");
        }
        else{
            System.out.println("welcome! " + username);
        }

        sc.close();
    }
}
