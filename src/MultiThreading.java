public class MultiThreading {
    static void main() {

        Thread thread1 = new Thread(new OurRunnable("PING"));
        Thread thread2 = new Thread(new OurRunnable("PONG"));

        System.out.println("GAME START");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread1.join();
        }
        catch (InterruptedException e){
            System.out.println("Thread Intruppts");
        }
        System.out.println("GAME OVER");

    }
}
