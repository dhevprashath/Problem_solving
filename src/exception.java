import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    static void main() {
        Scanner sc = new Scanner(System.in);
       int num;
        try{
            System.out.println("enter a num : ");
            num = sc.nextInt();
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("error occurs ");
        }
    }
}
