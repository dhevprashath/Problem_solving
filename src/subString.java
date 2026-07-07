
import java.util.Scanner;
public class subString {
    public static void main(String[] args) {
        // subString method
         Scanner sc = new Scanner((System.in));

        String email;
        String username;
        String domain;

        System.out.print("Enter your Email: ");
        email = sc.nextLine();
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println("username : " + username);
            System.out.println("domain : " + domain);
        }
        else{
            System.out.println("Email Must contains @ ");
        }
         sc.close();

    }
}
