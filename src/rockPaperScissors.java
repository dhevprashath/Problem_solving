import java.util.*;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice ;
        String computerChoice;
        String playAgain = "yes";

         do {
             System.out.print("enter your move(rock,paper,scissors) : ");
             playerChoice =sc.nextLine().toLowerCase();

             if(!playerChoice.equals("rock")
                     && !playerChoice.equals("paper")
                     && !playerChoice.equals("scissors")){
                 System.out.println("invalid choice");
                 continue;
             }

             computerChoice = choices[random.nextInt(3)];
             System.out.println("computer choice : " + computerChoice);

             if(playerChoice.equals(computerChoice)){
                 System.out.println("draw");
             }
             else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
                 System.out.println("player Wins!");
             }

             else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                 System.out.println("player Wins!");
             }

             else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                 System.out.println("player Wins!");
             }

             else{
                 System.out.println("you loss!");
             }

             System.out.print("play Again (yes/no) : ");
             playAgain = sc.nextLine().toLowerCase();

         }while (playAgain.equals("yes"));

        System.out.println("Thanks For Comming :)");


        sc.close();
    }
}
