import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
        //Shopping cart program

        Scanner sc = new Scanner (System.in);
        String items;
        int quantity;
        double price;
        char currency = '$';
        double total;


        System.out.print("whats your order :");
        items = sc.nextLine();


        System.out.print("how many pizza you like : ");
        quantity = sc.nextInt();

        System.out.print("whats the price for each  :");
        price = sc.nextDouble();



        total = price * quantity;

        System.out.println("\n you have bought  " + quantity + " " + items + "/s" );
        System.out.println("your total is " + currency + total );

        sc.close();


} }
