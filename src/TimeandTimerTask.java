import java.util.*;
public class TimeandTimerTask {
    static void main() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if(count<=0){
                    System.out.println("TASK COMPLETED");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask,0,1000);

    }
}
