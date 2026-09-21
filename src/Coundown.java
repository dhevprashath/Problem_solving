import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Coundown {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int response;
        System.out.print("enter # of times from: ");
        response = sc.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}
