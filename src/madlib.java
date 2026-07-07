import java.util.Scanner;
public class madlib {
    public static void main(String[] args) {
        //MADLIB Game

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun ;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description) :");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person) :");
       noun = sc.nextLine();
        System.out.print("Enter an adjective (description) :");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb ends with -ing (Action) : ");
        verb1= sc.nextLine();
        System.out.print("Enter an adjective (description) :");
        adjective3 = sc.nextLine();


        System.out.println("\n Today i went to a " + adjective1 + "Zoo.");
        System.out.println("IN a exibhit ,I saw a " + noun + ".");
        System.out.println(noun + " was " + adjective2 + "and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");





    }
}
