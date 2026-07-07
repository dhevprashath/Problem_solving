import java.util.Scanner;
public class math {
    public static void main(String[] args) {
//        hypotnuose
        Scanner sc = new Scanner(System.in);

       double radius;
       double circumference ;
       double area;
       double volume;

        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius , 2);
        volume =  (4.0/3.0 ) * Math.PI * Math.pow(radius, 3);

        System.out.println("the circumference is : " + circumference);
        System.out.println("the area is : " + area);
        System.out.println("The volume is : " + volume);

        sc.close();



    }
}
