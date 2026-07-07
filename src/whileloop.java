import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = " ";
        while(!response.equals("Q")){
            System.out.println("welcome to the game ");
            System.out.print("enter Q to exit the game : ");
            response = sc.next().toUpperCase();
            if (response.equals("Q")){
                System.out.println("thanks for comming ");
            }

        }
          sc.close();
    }
}
