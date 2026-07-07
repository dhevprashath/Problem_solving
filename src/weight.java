import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        // weight convertion Program

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Convertion Program");
        System.out.println("1 : converts lbs to kgs");
        System.out.println("2 : converts kgs to lbs");

        System.out.print("choose a option : ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter your Weight in lbs : ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.print("The newWeight in kgs is : " + newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter your Weight in kgs : ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.print("The newWeight in lbs is : " + newWeight);
        }
        else{
            System.out.println("That wa not a valid choice");

        }
        sc.close();
    }
}
