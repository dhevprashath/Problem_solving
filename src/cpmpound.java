import java.util.Scanner;
public class cpmpound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priciple;
        double rate;
        int years;
        int timecompound;
        double amount;


        System.out.print("Enter your priciple :");
        priciple = sc.nextDouble();
        System.out.print("Enter your Rate (in %) : ");
        rate = sc.nextDouble()/100;
        System.out.print("Enter the # time compound of the year : ");
        timecompound = sc.nextInt();
        System.out.print("Enter the year : ");
        years = sc.nextInt();

        amount = priciple * Math.pow(1+ rate/timecompound , timecompound * years);
        System.out.println("The amount after "+ years + "is : $ " + amount);




        sc.close();
    }
}
