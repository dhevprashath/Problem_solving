import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your password: ");
         String password = sc.nextLine();

        while (!password.equals("1234")) {
            System.out.print("try again.Enter your password : ");
            password=sc.nextLine();

        }
            System.out.println("login succesfull");
         sc.close();

    }
}
