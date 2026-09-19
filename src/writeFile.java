import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    static void main() {


        try(FileWriter writer = new FileWriter("./src/test.txt")){
            writer.write("heyy broo");
            System.out.println("file written");
        }
        catch (IOException e){
            System.out.println("check the file");

        }

    }
}
