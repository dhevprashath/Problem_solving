public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interuppt");
            }
            if(i==5){
                System.out.println("Timesup!");
                System.exit(0);
            }
        }
    }
}
