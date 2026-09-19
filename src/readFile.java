import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    static void main() {
        String filePah = "./src/test.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePah))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("file does'nt exists");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }

    }
}
