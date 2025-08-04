import java.util.Scanner;

public class casechecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().trim().charAt(0);
        if (ch>='a' && ch<='z' ){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
    
}
