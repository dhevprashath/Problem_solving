import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temprature : ");
        temp = sc.nextDouble();
        System.out.print("Convert into celcius or fahernhiet: ");
        unit = sc.next().toUpperCase();

       newtemp =  (unit.equals(" C "))?(temp - 32) * 5 / 9 : (temp * 9 / 5) + 32 ;
        System.out.println(newtemp + unit);

        sc.close();

    }
}
