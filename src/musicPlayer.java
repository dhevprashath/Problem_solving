import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class musicPlayer {
    static void main() {
        String filePath = "src\\Nallaru Po.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);


            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.print("Enter your choice :");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice ");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("could'nt find the path");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("unable to access the Audio resources ");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
