import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarm implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;

    public Alarm(LocalTime alarmTime,String filePath ,Scanner sc) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {

            try {
                LocalTime now = LocalTime.now();

                System.out.println(
                        String.format("\r%02d:%02d:%02d",
                                now.getHour(),
                                now.getMinute(),
                                now.getSecond())
                );

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Alarm interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("\n⏰ ALARM!!!");
        playSound(filePath);
    }
    private void playSound(String filePath){
     File audioFile = new File(filePath);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)){
          Clip clip = AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
            System.out.print("press *Enter* to stop alarm");
            sc.nextLine();
            clip.stop();
            sc.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavaliable !");
        }
        catch (IOException e){
            System.out.println("check the file path");
        }

    }
}