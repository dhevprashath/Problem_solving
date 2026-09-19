import java.util.Random;
import java.util.Scanner;

public class diceprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter The # of dice to Roll : ");
        numOfDice = sc.nextInt();
        if(numOfDice>0){
            for(int i = 0;i<numOfDice;i++){
                int roll = random.nextInt(1,7);
                System.out.println("You Rolled " + roll);
                total = total +roll;

            }
            System.out.print("Total is " + total);
        }
        else {
            System.out.print("The number must greater than zero");
        }
        sc.close();
    }
    static void printDie(int roll){

        String dice1 = """
                 -------
                |       |
                |  ☻   |
                |       |
                 -------
                
                """;
        System.out.println(dice1);

    }


}
