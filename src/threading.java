import java.util.Scanner;

public class threading {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 5 sec to Enter your name ");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("hello " + name);


        sc.close();
    }
}
